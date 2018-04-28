/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen

import org.jetbrains.kotlin.codegen.coroutines.createCustomCopy
import org.jetbrains.kotlin.config.JVMAssertionsMode
import org.jetbrains.kotlin.descriptors.CallableDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.incremental.components.NoLookupLocation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.BindingTraceContext
import org.jetbrains.kotlin.resolve.DelegatingBindingTrace
import org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides
import org.jetbrains.kotlin.resolve.calls.model.*
import org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo
import org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy
import org.jetbrains.kotlin.resolve.descriptorUtil.module
import org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin
import org.jetbrains.org.objectweb.asm.Label
import org.jetbrains.org.objectweb.asm.Opcodes
import org.jetbrains.org.objectweb.asm.Type

object AssertCodegenUtil {
    private lateinit var assertFunctionDescriptor: Collection<FunctionDescriptor>

    private fun getAssertFunctionDescriptors(descriptor: CallableDescriptor): Collection<FunctionDescriptor> {
        if (!this::assertFunctionDescriptor.isInitialized) {
            assertFunctionDescriptor = descriptor.module.getPackage(FqName("kotlin")).memberScope
                .getContributedFunctions(Name.identifier("assert"), NoLookupLocation.FROM_BACKEND)
        }
        return assertFunctionDescriptor
    }

    @JvmStatic
    fun isAssertCall(resolvedCall: ResolvedCall<*>) = getAssertFunctionDescriptors(resolvedCall.resultingDescriptor).any {
        DescriptorEquivalenceForOverrides.areEquivalent(resolvedCall.resultingDescriptor, it)
    }

    @JvmStatic
    fun generateAssert(
        assertionsMode: JVMAssertionsMode,
        resolvedCall: ResolvedCall<*>,
        codegen: ExpressionCodegen,
        parentCodegen: MemberCodegen<*>
    ) {
        assert(isAssertCall(resolvedCall)) { "generateAssert expects call of kotlin.assert function" }
        when (assertionsMode) {
            JVMAssertionsMode.ALWAYS_ENABLE -> inlineAssertInner(resolvedCall, codegen)
            JVMAssertionsMode.ALWAYS_DISABLE -> {
                // Nothing to do: assertions disabled
            }
            JVMAssertionsMode.JVM -> generateJvmAssert(resolvedCall, codegen, parentCodegen)
            else -> error("legacy assertions mode shall be handled in ExpressionCodegen")
        }
    }

    private fun generateJvmAssert(resolvedCall: ResolvedCall<*>, codegen: ExpressionCodegen, parentCodegen: MemberCodegen<*>) {
        parentCodegen.generateAssertField()

        val label = Label()
        with(codegen.v) {
            getstatic(parentCodegen.v.thisName, "\$assertionsDisabled", "Z")
            ifne(label)
            inlineAssertInner(resolvedCall, codegen)
            mark(label)
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun inlineAssertInner(resolvedCall: ResolvedCall<*>, codegen: ExpressionCodegen) {
        val replaced = (resolvedCall as ResolvedCall<FunctionDescriptor>).replaceAssertWithAssertInner()
        codegen.invokeMethodWithArguments(
            codegen.typeMapper.mapToCallableMethod(replaced.resultingDescriptor, false),
            replaced,
            StackValue.none()
        )
    }

    @JvmStatic
    fun generateAssertionsDisabledFieldInitialization(parentCodegen: MemberCodegen<*>) {
        parentCodegen.v.newField(
            JvmDeclarationOrigin.NO_ORIGIN, Opcodes.ACC_STATIC or Opcodes.ACC_FINAL or Opcodes.ACC_SYNTHETIC, "\$assertionsDisabled",
            "Z", null, null
        )
        val clInitCodegen = parentCodegen.createOrGetClInitCodegen()
        MemberCodegen.markLineNumberForElement(parentCodegen.element.psiOrParent, clInitCodegen.v)
        val thenLabel = Label()
        val elseLabel = Label()
        with(clInitCodegen.v) {
            aconst(Type.getObjectType(parentCodegen.v.thisName))
            invokevirtual("java/lang/Class", "desiredAssertionStatus", "()Z", false)
            ifne(thenLabel)
            iconst(1)
            goTo(elseLabel)

            mark(thenLabel)
            iconst(0)

            mark(elseLabel)
            putstatic(parentCodegen.v.thisName, "\$assertionsDisabled", "Z")
        }
    }
}

private fun <D : FunctionDescriptor> ResolvedCall<D>.replaceAssertWithAssertInner(): ResolvedCall<D> {
    val newCandidateDescriptor = resultingDescriptor.createCustomCopy {
        setName(Name.identifier("assertInner"))
    }
    val newResolvedCall = ResolvedCallImpl(
        call,
        newCandidateDescriptor,
        dispatchReceiver, extensionReceiver, explicitReceiverKind,
        null, DelegatingBindingTrace(BindingTraceContext().bindingContext, "Temporary trace for assertInner"),
        TracingStrategy.EMPTY, MutableDataFlowInfoForArguments.WithoutArgumentsCheck(DataFlowInfo.EMPTY)
    )
    valueArguments.forEach {
        newResolvedCall.recordValueArgument(newCandidateDescriptor.valueParameters[it.key.index], it.value)
    }
    return newResolvedCall
}
