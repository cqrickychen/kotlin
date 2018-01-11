/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.slicer;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/slicer")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SlicerTreeTestGenerated extends AbstractSlicerTreeTest {
    public void testAllFilesPresentInSlicer() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/slicer"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY);
    }

    @TestMetadata("inflow/anonymousFunBodyExpression.kt")
    public void testInflow_AnonymousFunBodyExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/anonymousFunBodyExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/anonymousFunReturnExpression.kt")
    public void testInflow_AnonymousFunReturnExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/anonymousFunReturnExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/cast.kt")
    public void testInflow_Cast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/cast.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/compositeAssignments.kt")
    public void testInflow_CompositeAssignments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/compositeAssignments.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/defaultGetterFieldInSetter.kt")
    public void testInflow_DefaultGetterFieldInSetter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/defaultGetterFieldInSetter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/delegateGetter.kt")
    public void testInflow_DelegateGetter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/delegateGetter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/delegateToJavaGetter.kt")
    public void testInflow_DelegateToJavaGetter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/delegateToJavaGetter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/diamondHierarchyJKMiddleClassFun.kt")
    public void testInflow_DiamondHierarchyJKMiddleClassFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/diamondHierarchyJKMiddleClassFun.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/diamondHierarchyJKMiddleInterfaceFun.kt")
    public void testInflow_DiamondHierarchyJKMiddleInterfaceFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/diamondHierarchyJKMiddleInterfaceFun.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/diamondHierarchyJKRootInterfaceFun.kt")
    public void testInflow_DiamondHierarchyJKRootInterfaceFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/diamondHierarchyJKRootInterfaceFun.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/diamondHierarchyMiddleClassFun.kt")
    public void testInflow_DiamondHierarchyMiddleClassFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/diamondHierarchyMiddleClassFun.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/diamondHierarchyMiddleInterfaceFun.kt")
    public void testInflow_DiamondHierarchyMiddleInterfaceFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/diamondHierarchyMiddleInterfaceFun.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/diamondHierarchyRootInterfaceFun.kt")
    public void testInflow_DiamondHierarchyRootInterfaceFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/diamondHierarchyRootInterfaceFun.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/doubleLambdaResult.kt")
    public void testInflow_DoubleLambdaResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/doubleLambdaResult.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funParamerer.kt")
    public void testInflow_FunParamerer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funParamerer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funParamererWithDefault.kt")
    public void testInflow_FunParamererWithDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funParamererWithDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funResultViaCallableRef.kt")
    public void testInflow_FunResultViaCallableRef() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funResultViaCallableRef.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funResultViaCallableRefWithAssignment.kt")
    public void testInflow_FunResultViaCallableRefWithAssignment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funResultViaCallableRefWithAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funResultViaCallableRefWithDirectCall.kt")
    public void testInflow_FunResultViaCallableRefWithDirectCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funResultViaCallableRefWithDirectCall.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funWithExpressionBody.kt")
    public void testInflow_FunWithExpressionBody() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funWithExpressionBody.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funWithReturnExpressions.kt")
    public void testInflow_FunWithReturnExpressions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funWithReturnExpressions.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/getterAndSetterUsingField.kt")
    public void testInflow_GetterAndSetterUsingField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/getterAndSetterUsingField.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/getterExpressionBody.kt")
    public void testInflow_GetterExpressionBody() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/getterExpressionBody.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/getterReturnExpression.kt")
    public void testInflow_GetterReturnExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/getterReturnExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/ifExpression.kt")
    public void testInflow_IfExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/ifExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/lambdaResult.kt")
    public void testInflow_LambdaResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/lambdaResult.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/lambdaResultWithAssignments.kt")
    public void testInflow_LambdaResultWithAssignments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/lambdaResultWithAssignments.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/lambdaResultWithDirectCall.kt")
    public void testInflow_LambdaResultWithDirectCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/lambdaResultWithDirectCall.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/lambdaResultWithDirectCallViaAssignment.kt")
    public void testInflow_LambdaResultWithDirectCallViaAssignment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/lambdaResultWithDirectCallViaAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/localVal.kt")
    public void testInflow_LocalVal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/localVal.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/localVar.kt")
    public void testInflow_LocalVar() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/localVar.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberValWithInitializer.kt")
    public void testInflow_MemberValWithInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberValWithInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberValWithSplitInitializer.kt")
    public void testInflow_MemberValWithSplitInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberValWithSplitInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberVarWithInitializer.kt")
    public void testInflow_MemberVarWithInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberVarWithInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberVarWithSplitInitializer.kt")
    public void testInflow_MemberVarWithSplitInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberVarWithSplitInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/noFieldInGetter.kt")
    public void testInflow_NoFieldInGetter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/noFieldInGetter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/nonLocalReturn.kt")
    public void testInflow_NonLocalReturn() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/nonLocalReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/notNullAssertion.kt")
    public void testInflow_NotNullAssertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/notNullAssertion.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/overridingFunctionResult.kt")
    public void testInflow_OverridingFunctionResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/overridingFunctionResult.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/overridingParameter.kt")
    public void testInflow_OverridingParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/overridingParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/overridingPropertyGetterResult.kt")
    public void testInflow_OverridingPropertyGetterResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/overridingPropertyGetterResult.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/overridingPropertyResult.kt")
    public void testInflow_OverridingPropertyResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/overridingPropertyResult.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/primaryConstructorParameter.kt")
    public void testInflow_PrimaryConstructorParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/primaryConstructorParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/primaryConstructorParameterWithDefault.kt")
    public void testInflow_PrimaryConstructorParameterWithDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/primaryConstructorParameterWithDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/qualifiedAssignmentsForQualifiedRef.kt")
    public void testInflow_QualifiedAssignmentsForQualifiedRef() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/qualifiedAssignmentsForQualifiedRef.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/qualifiedAssignmentsForSimpleRef.kt")
    public void testInflow_QualifiedAssignmentsForSimpleRef() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/qualifiedAssignmentsForSimpleRef.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/safeCast.kt")
    public void testInflow_SafeCast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/safeCast.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/secondaryConstructorParameter.kt")
    public void testInflow_SecondaryConstructorParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/secondaryConstructorParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/secondaryConstructorParameterWithDefault.kt")
    public void testInflow_SecondaryConstructorParameterWithDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/secondaryConstructorParameterWithDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/settersViaDelegateForQualifiedRef.kt")
    public void testInflow_SettersViaDelegateForQualifiedRef() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/settersViaDelegateForQualifiedRef.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/settersViaDelegateForSimpleRef.kt")
    public void testInflow_SettersViaDelegateForSimpleRef() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/settersViaDelegateForSimpleRef.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/settersViaJavaDelegate.kt")
    public void testInflow_SettersViaJavaDelegate() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/settersViaJavaDelegate.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/topLevelVal.kt")
    public void testInflow_TopLevelVal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/topLevelVal.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/topLevelVar.kt")
    public void testInflow_TopLevelVar() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/topLevelVar.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/valParameter.kt")
    public void testInflow_ValParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/valParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/varParameter.kt")
    public void testInflow_VarParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/varParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/whenExpression.kt")
    public void testInflow_WhenExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/whenExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/anonymousFunBodyExpression.kt")
    public void testOutflow_AnonymousFunBodyExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/anonymousFunBodyExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/anonymousFunReturnExpression.kt")
    public void testOutflow_AnonymousFunReturnExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/anonymousFunReturnExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/callArgument.kt")
    public void testOutflow_CallArgument() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/callArgument.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/callArgumentKJK.kt")
    public void testOutflow_CallArgumentKJK() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/callArgumentKJK.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/cast.kt")
    public void testOutflow_Cast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/cast.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/defaultExplicitPrimaryConstructorCalls.kt")
    public void testOutflow_DefaultExplicitPrimaryConstructorCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/defaultExplicitPrimaryConstructorCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/diamondHierarchyJKLeafClassFun.kt")
    public void testOutflow_DiamondHierarchyJKLeafClassFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/diamondHierarchyJKLeafClassFun.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/diamondHierarchyJKMiddleClassFun.kt")
    public void testOutflow_DiamondHierarchyJKMiddleClassFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/diamondHierarchyJKMiddleClassFun.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/diamondHierarchyJKMiddleInterfaceFun.kt")
    public void testOutflow_DiamondHierarchyJKMiddleInterfaceFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/diamondHierarchyJKMiddleInterfaceFun.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/diamondHierarchyLeafClassFun.kt")
    public void testOutflow_DiamondHierarchyLeafClassFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/diamondHierarchyLeafClassFun.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/diamondHierarchyMiddleClassFun.kt")
    public void testOutflow_DiamondHierarchyMiddleClassFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/diamondHierarchyMiddleClassFun.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/diamondHierarchyMiddleInterfaceFun.kt")
    public void testOutflow_DiamondHierarchyMiddleInterfaceFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/diamondHierarchyMiddleInterfaceFun.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/doubleLambdaResult.kt")
    public void testOutflow_DoubleLambdaResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/doubleLambdaResult.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/explicitLambdaReturnExpression.kt")
    public void testOutflow_ExplicitLambdaReturnExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/explicitLambdaReturnExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/extensionIndexingDereferences.kt")
    public void testOutflow_ExtensionIndexingDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/extensionIndexingDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/forVariable.kt")
    public void testOutflow_ForVariable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/forVariable.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funBodyExpression.kt")
    public void testOutflow_FunBodyExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funBodyExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/functionCalls.kt")
    public void testOutflow_FunctionCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/functionCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funParameterUsages.kt")
    public void testOutflow_FunParameterUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funParameterUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funResultViaCallableRef.kt")
    public void testOutflow_FunResultViaCallableRef() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funResultViaCallableRef.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funResultViaCallableRefWithAssignment.kt")
    public void testOutflow_FunResultViaCallableRefWithAssignment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funResultViaCallableRefWithAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funResultViaCallableRefWithDirectCall.kt")
    public void testOutflow_FunResultViaCallableRefWithDirectCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funResultViaCallableRefWithDirectCall.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funReturnExpression.kt")
    public void testOutflow_FunReturnExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funReturnExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/getFunCalls.kt")
    public void testOutflow_GetFunCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/getFunCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/getterExpressionBody.kt")
    public void testOutflow_GetterExpressionBody() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/getterExpressionBody.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/getterReturnExpression.kt")
    public void testOutflow_GetterReturnExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/getterReturnExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/ifExpression.kt")
    public void testOutflow_IfExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/ifExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/indexingDereferences.kt")
    public void testOutflow_IndexingDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/indexingDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/jvmFieldMemberPropertyJavaUsages.kt")
    public void testOutflow_JvmFieldMemberPropertyJavaUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/jvmFieldMemberPropertyJavaUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/lambdaResult.kt")
    public void testOutflow_LambdaResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/lambdaResult.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/lambdaResultWithAssignments.kt")
    public void testOutflow_LambdaResultWithAssignments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/lambdaResultWithAssignments.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/lambdaResultWithDirectCall.kt")
    public void testOutflow_LambdaResultWithDirectCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/lambdaResultWithDirectCall.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/lambdaResultWithDirectCallViaAssignment.kt")
    public void testOutflow_LambdaResultWithDirectCallViaAssignment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/lambdaResultWithDirectCallViaAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/localVariableUsages.kt")
    public void testOutflow_LocalVariableUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/localVariableUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/memberPropertyUsages.kt")
    public void testOutflow_MemberPropertyUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/memberPropertyUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/nonLocalReturn.kt")
    public void testOutflow_NonLocalReturn() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/nonLocalReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/notNullAssertion.kt")
    public void testOutflow_NotNullAssertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/notNullAssertion.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/operatorCallDereferences.kt")
    public void testOutflow_OperatorCallDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/operatorCallDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/operatorFunCalls.kt")
    public void testOutflow_OperatorFunCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/operatorFunCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/overridingFunctionResult.kt")
    public void testOutflow_OverridingFunctionResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/overridingFunctionResult.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/overridingFunctionResultWithJava.kt")
    public void testOutflow_OverridingFunctionResultWithJava() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/overridingFunctionResultWithJava.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/overridingParameter.kt")
    public void testOutflow_OverridingParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/overridingParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/overridingPropertyGetterResult.kt")
    public void testOutflow_OverridingPropertyGetterResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/overridingPropertyGetterResult.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/overridingPropertyResult.kt")
    public void testOutflow_OverridingPropertyResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/overridingPropertyResult.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/primaryConstructorCalls.kt")
    public void testOutflow_PrimaryConstructorCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/primaryConstructorCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/primaryConstructorParameterUsages.kt")
    public void testOutflow_PrimaryConstructorParameterUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/primaryConstructorParameterUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/secondaryConstructorCalls.kt")
    public void testOutflow_SecondaryConstructorCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/secondaryConstructorCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/simpleCallDereferences.kt")
    public void testOutflow_SimpleCallDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/simpleCallDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/topLevelPropertyUsages.kt")
    public void testOutflow_TopLevelPropertyUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/topLevelPropertyUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/usagesInLoopRange.kt")
    public void testOutflow_UsagesInLoopRange() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/usagesInLoopRange.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/usagesInTemplates.kt")
    public void testOutflow_UsagesInTemplates() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/usagesInTemplates.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/valParameter.kt")
    public void testOutflow_ValParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/valParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/varParameter.kt")
    public void testOutflow_VarParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/varParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/whenExpression.kt")
    public void testOutflow_WhenExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/whenExpression.kt");
        doTest(fileName);
    }
}