package aptell.antlr4.java9;

import aptell.antlr4.IO;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author kongra
 * @created 2017-10-30
 */
public class ProcessorListener extends Java9BaseListener {

  private final IO io;

  ProcessorListener(IO io) {
    this.io = io;
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    io.pushLevel();
    io.writeTerminal(node.getSymbol());
    io.popLevel();
  }

  public void enter(NonTerminal nonTerm) {
    io.pushLevel();
    io.writeNonTerminal(nonTerm.code);
  }

  public void exit() {
    io.popLevel();
  }

  @Override
  public void exitEveryRule(ParserRuleContext ctx) {
    exit();
  }

  @Override
  public void enterAdditionalBound(Java9Parser.AdditionalBoundContext ctx) {
    enter(NonTerminal.AdditionalBound);
  }

  @Override
  public void enterAdditiveExpression(Java9Parser.AdditiveExpressionContext ctx) {
    enter(NonTerminal.AdditiveExpression);
  }

  @Override
  public void enterAmbiguousName(Java9Parser.AmbiguousNameContext ctx) {
    enter(NonTerminal.AmbiguousName);
  }

  @Override
  public void enterAndExpression(Java9Parser.AndExpressionContext ctx) {
    enter(NonTerminal.AndExpression);
  }

  @Override
  public void enterAnnotation(Java9Parser.AnnotationContext ctx) {
    enter(NonTerminal.Annotation);
  }

  @Override
  public void enterAnnotationTypeBody(Java9Parser.AnnotationTypeBodyContext ctx) {
    enter(NonTerminal.AnnotationTypeBody);
  }

  @Override
  public void enterAnnotationTypeDeclaration(Java9Parser.AnnotationTypeDeclarationContext ctx) {
    enter(NonTerminal.AnnotationTypeDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementDeclaration(Java9Parser.AnnotationTypeElementDeclarationContext ctx) {
    enter(NonTerminal.AnnotationTypeElementDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementModifier(Java9Parser.AnnotationTypeElementModifierContext ctx) {
    enter(NonTerminal.AnnotationTypeElementModifier);
  }

  @Override
  public void enterAnnotationTypeMemberDeclaration(Java9Parser.AnnotationTypeMemberDeclarationContext ctx) {
    enter(NonTerminal.AnnotationTypeMemberDeclaration);
  }

  @Override
  public void enterArgumentList(Java9Parser.ArgumentListContext ctx) {
    enter(NonTerminal.ArgumentList);
  }

  @Override
  public void enterArrayAccess(Java9Parser.ArrayAccessContext ctx) {
    enter(NonTerminal.ArrayAccess);
  }

  @Override
  public void enterArrayAccess_lf_primary(Java9Parser.ArrayAccess_lf_primaryContext ctx) {
    enter(NonTerminal.ArrayAccess_lf_primary);
  }

  @Override
  public void enterArrayAccess_lfno_primary(Java9Parser.ArrayAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.ArrayAccess_lfno_primary);
  }

  @Override
  public void enterArrayCreationExpression(Java9Parser.ArrayCreationExpressionContext ctx) {
    enter(NonTerminal.ArrayCreationExpression);
  }

  @Override
  public void enterArrayInitializer(Java9Parser.ArrayInitializerContext ctx) {
    enter(NonTerminal.ArrayInitializer);
  }

  @Override
  public void enterArrayType(Java9Parser.ArrayTypeContext ctx) {
    enter(NonTerminal.ArrayType);
  }

  @Override
  public void enterAssertStatement(Java9Parser.AssertStatementContext ctx) {
    enter(NonTerminal.AssertStatement);
  }

  @Override
  public void enterAssignment(Java9Parser.AssignmentContext ctx) {
    enter(NonTerminal.Assignment);
  }

  @Override
  public void enterAssignmentExpression(Java9Parser.AssignmentExpressionContext ctx) {
    enter(NonTerminal.AssignmentExpression);
  }

  @Override
  public void enterAssignmentOperator(Java9Parser.AssignmentOperatorContext ctx) {
    enter(NonTerminal.AssignmentOperator);
  }

  @Override
  public void enterBasicForStatement(Java9Parser.BasicForStatementContext ctx) {
    enter(NonTerminal.BasicForStatement);
  }

  @Override
  public void enterBasicForStatementNoShortIf(Java9Parser.BasicForStatementNoShortIfContext ctx) {
    enter(NonTerminal.BasicForStatementNoShortIf);
  }

  @Override
  public void enterBlock(Java9Parser.BlockContext ctx) {
    enter(NonTerminal.Block);
  }

  @Override
  public void enterBlockStatement(Java9Parser.BlockStatementContext ctx) {
    enter(NonTerminal.BlockStatement);
  }

  @Override
  public void enterBlockStatements(Java9Parser.BlockStatementsContext ctx) {
    enter(NonTerminal.BlockStatements);
  }

  @Override
  public void enterBreakStatement(Java9Parser.BreakStatementContext ctx) {
    enter(NonTerminal.BreakStatement);
  }

  @Override
  public void enterCastExpression(Java9Parser.CastExpressionContext ctx) {
    enter(NonTerminal.CastExpression);
  }

  @Override
  public void enterCatchClause(Java9Parser.CatchClauseContext ctx) {
    enter(NonTerminal.CatchClause);
  }

  @Override
  public void enterCatchFormalParameter(Java9Parser.CatchFormalParameterContext ctx) {
    enter(NonTerminal.CatchFormalParameter);
  }

  @Override
  public void enterCatchType(Java9Parser.CatchTypeContext ctx) {
    enter(NonTerminal.CatchType);
  }

  @Override
  public void enterCatches(Java9Parser.CatchesContext ctx) {
    enter(NonTerminal.Catches);
  }

  @Override
  public void enterClassBody(Java9Parser.ClassBodyContext ctx) {
    enter(NonTerminal.ClassBody);
  }

  @Override
  public void enterClassBodyDeclaration(Java9Parser.ClassBodyDeclarationContext ctx) {
    enter(NonTerminal.ClassBodyDeclaration);
  }

  @Override
  public void enterClassDeclaration(Java9Parser.ClassDeclarationContext ctx) {
    enter(NonTerminal.ClassDeclaration);
  }

  @Override
  public void enterClassInstanceCreationExpression(Java9Parser.ClassInstanceCreationExpressionContext ctx) {
    enter(NonTerminal.ClassInstanceCreationExpression);
  }

  @Override
  public void enterClassInstanceCreationExpression_lf_primary(Java9Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
    enter(NonTerminal.ClassInstanceCreationExpression_lf_primary);
  }

  @Override
  public void enterClassInstanceCreationExpression_lfno_primary(Java9Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
    enter(NonTerminal.ClassInstanceCreationExpression_lfno_primary);
  }

  @Override
  public void enterClassLiteral(Java9Parser.ClassLiteralContext ctx) {
    enter(NonTerminal.ClassLiteral);
  }

  @Override
  public void enterClassMemberDeclaration(Java9Parser.ClassMemberDeclarationContext ctx) {
    enter(NonTerminal.ClassMemberDeclaration);
  }

  @Override
  public void enterClassModifier(Java9Parser.ClassModifierContext ctx) {
    enter(NonTerminal.ClassModifier);
  }

  @Override
  public void enterClassOrInterfaceType(Java9Parser.ClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.ClassOrInterfaceType);
  }

  @Override
  public void enterClassType(Java9Parser.ClassTypeContext ctx) {
    enter(NonTerminal.ClassType);
  }

  @Override
  public void enterClassType_lf_classOrInterfaceType(Java9Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.ClassType_lf_classOrInterfaceType);
  }

  @Override
  public void enterClassType_lfno_classOrInterfaceType(Java9Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.ClassType_lfno_classOrInterfaceType);
  }

  @Override
  public void enterCompilationUnit(Java9Parser.CompilationUnitContext ctx) {
    enter(NonTerminal.CompilationUnit);
  }

  @Override
  public void enterConditionalAndExpression(Java9Parser.ConditionalAndExpressionContext ctx) {
    enter(NonTerminal.ConditionalAndExpression);
  }

  @Override
  public void enterConditionalExpression(Java9Parser.ConditionalExpressionContext ctx) {
    enter(NonTerminal.ConditionalExpression);
  }

  @Override
  public void enterConditionalOrExpression(Java9Parser.ConditionalOrExpressionContext ctx) {
    enter(NonTerminal.ConditionalOrExpression);
  }

  @Override
  public void enterConstantDeclaration(Java9Parser.ConstantDeclarationContext ctx) {
    enter(NonTerminal.ConstantDeclaration);
  }

  @Override
  public void enterConstantExpression(Java9Parser.ConstantExpressionContext ctx) {
    enter(NonTerminal.ConstantExpression);
  }

  @Override
  public void enterConstantModifier(Java9Parser.ConstantModifierContext ctx) {
    enter(NonTerminal.ConstantModifier);
  }

  @Override
  public void enterConstructorBody(Java9Parser.ConstructorBodyContext ctx) {
    enter(NonTerminal.ConstructorBody);
  }

  @Override
  public void enterConstructorDeclaration(Java9Parser.ConstructorDeclarationContext ctx) {
    enter(NonTerminal.ConstructorDeclaration);
  }

  @Override
  public void enterConstructorDeclarator(Java9Parser.ConstructorDeclaratorContext ctx) {
    enter(NonTerminal.ConstructorDeclarator);
  }

  @Override
  public void enterConstructorModifier(Java9Parser.ConstructorModifierContext ctx) {
    enter(NonTerminal.ConstructorModifier);
  }

  @Override
  public void enterContinueStatement(Java9Parser.ContinueStatementContext ctx) {
    enter(NonTerminal.ContinueStatement);
  }

  @Override
  public void enterDefaultValue(Java9Parser.DefaultValueContext ctx) {
    enter(NonTerminal.DefaultValue);
  }

  @Override
  public void enterDimExpr(Java9Parser.DimExprContext ctx) {
    enter(NonTerminal.DimExpr);
  }

  @Override
  public void enterDimExprs(Java9Parser.DimExprsContext ctx) {
    enter(NonTerminal.DimExprs);
  }

  @Override
  public void enterDims(Java9Parser.DimsContext ctx) {
    enter(NonTerminal.Dims);
  }

  @Override
  public void enterDoStatement(Java9Parser.DoStatementContext ctx) {
    enter(NonTerminal.DoStatement);
  }

  @Override
  public void enterElementValue(Java9Parser.ElementValueContext ctx) {
    enter(NonTerminal.ElementValue);
  }

  @Override
  public void enterElementValueArrayInitializer(Java9Parser.ElementValueArrayInitializerContext ctx) {
    enter(NonTerminal.ElementValueArrayInitializer);
  }

  @Override
  public void enterElementValueList(Java9Parser.ElementValueListContext ctx) {
    enter(NonTerminal.ElementValueList);
  }

  @Override
  public void enterElementValuePair(Java9Parser.ElementValuePairContext ctx) {
    enter(NonTerminal.ElementValuePair);
  }

  @Override
  public void enterElementValuePairList(Java9Parser.ElementValuePairListContext ctx) {
    enter(NonTerminal.ElementValuePairList);
  }

  @Override
  public void enterEmptyStatement(Java9Parser.EmptyStatementContext ctx) {
    enter(NonTerminal.EmptyStatement);
  }

  @Override
  public void enterEnhancedForStatement(Java9Parser.EnhancedForStatementContext ctx) {
    enter(NonTerminal.EnhancedForStatement);
  }

  @Override
  public void enterEnhancedForStatementNoShortIf(Java9Parser.EnhancedForStatementNoShortIfContext ctx) {
    enter(NonTerminal.EnhancedForStatementNoShortIf);
  }

  @Override
  public void enterEnumBody(Java9Parser.EnumBodyContext ctx) {
    enter(NonTerminal.EnumBody);
  }

  @Override
  public void enterEnumBodyDeclarations(Java9Parser.EnumBodyDeclarationsContext ctx) {
    enter(NonTerminal.EnumBodyDeclarations);
  }

  @Override
  public void enterEnumConstant(Java9Parser.EnumConstantContext ctx) {
    enter(NonTerminal.EnumConstant);
  }

  @Override
  public void enterEnumConstantList(Java9Parser.EnumConstantListContext ctx) {
    enter(NonTerminal.EnumConstantList);
  }

  @Override
  public void enterEnumConstantModifier(Java9Parser.EnumConstantModifierContext ctx) {
    enter(NonTerminal.EnumConstantModifier);
  }

  @Override
  public void enterEnumConstantName(Java9Parser.EnumConstantNameContext ctx) {
    enter(NonTerminal.EnumConstantName);
  }

  @Override
  public void enterEnumDeclaration(Java9Parser.EnumDeclarationContext ctx) {
    enter(NonTerminal.EnumDeclaration);
  }

  @Override
  public void enterEqualityExpression(Java9Parser.EqualityExpressionContext ctx) {
    enter(NonTerminal.EqualityExpression);
  }

  @Override
  public void enterExceptionType(Java9Parser.ExceptionTypeContext ctx) {
    enter(NonTerminal.ExceptionType);
  }

  @Override
  public void enterExceptionTypeList(Java9Parser.ExceptionTypeListContext ctx) {
    enter(NonTerminal.ExceptionTypeList);
  }

  @Override
  public void enterExclusiveOrExpression(Java9Parser.ExclusiveOrExpressionContext ctx) {
    enter(NonTerminal.ExclusiveOrExpression);
  }

  @Override
  public void enterExplicitConstructorInvocation(Java9Parser.ExplicitConstructorInvocationContext ctx) {
    enter(NonTerminal.ExplicitConstructorInvocation);
  }

  @Override
  public void enterExpression(Java9Parser.ExpressionContext ctx) {
    enter(NonTerminal.Expression);
  }

  @Override
  public void enterExpressionName(Java9Parser.ExpressionNameContext ctx) {
    enter(NonTerminal.ExpressionName);
  }

  @Override
  public void enterExpressionStatement(Java9Parser.ExpressionStatementContext ctx) {
    enter(NonTerminal.ExpressionStatement);
  }

  @Override
  public void enterExtendsInterfaces(Java9Parser.ExtendsInterfacesContext ctx) {
    enter(NonTerminal.ExtendsInterfaces);
  }

  @Override
  public void enterFieldAccess(Java9Parser.FieldAccessContext ctx) {
    enter(NonTerminal.FieldAccess);
  }

  @Override
  public void enterFieldAccess_lf_primary(Java9Parser.FieldAccess_lf_primaryContext ctx) {
    enter(NonTerminal.FieldAccess_lf_primary);
  }

  @Override
  public void enterFieldAccess_lfno_primary(Java9Parser.FieldAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.FieldAccess_lfno_primary);
  }

  @Override
  public void enterFieldDeclaration(Java9Parser.FieldDeclarationContext ctx) {
    enter(NonTerminal.FieldDeclaration);
  }

  @Override
  public void enterFieldModifier(Java9Parser.FieldModifierContext ctx) {
    enter(NonTerminal.FieldModifier);
  }

  @Override
  public void enterFinally_(Java9Parser.Finally_Context ctx) {
    enter(NonTerminal.Finally_);
  }

  @Override
  public void enterFloatingPointType(Java9Parser.FloatingPointTypeContext ctx) {
    enter(NonTerminal.FloatingPointType);
  }

  @Override
  public void enterForInit(Java9Parser.ForInitContext ctx) {
    enter(NonTerminal.ForInit);
  }

  @Override
  public void enterForStatement(Java9Parser.ForStatementContext ctx) {
    enter(NonTerminal.ForStatement);
  }

  @Override
  public void enterForStatementNoShortIf(Java9Parser.ForStatementNoShortIfContext ctx) {
    enter(NonTerminal.ForStatementNoShortIf);
  }

  @Override
  public void enterForUpdate(Java9Parser.ForUpdateContext ctx) {
    enter(NonTerminal.ForUpdate);
  }

  @Override
  public void enterFormalParameter(Java9Parser.FormalParameterContext ctx) {
    enter(NonTerminal.FormalParameter);
  }

  @Override
  public void enterFormalParameterList(Java9Parser.FormalParameterListContext ctx) {
    enter(NonTerminal.FormalParameterList);
  }

  @Override
  public void enterFormalParameters(Java9Parser.FormalParametersContext ctx) {
    enter(NonTerminal.FormalParameters);
  }

  @Override
  public void enterIfThenElseStatement(Java9Parser.IfThenElseStatementContext ctx) {
    enter(NonTerminal.IfThenElseStatement);
  }

  @Override
  public void enterIfThenElseStatementNoShortIf(Java9Parser.IfThenElseStatementNoShortIfContext ctx) {
    enter(NonTerminal.IfThenElseStatementNoShortIf);
  }

  @Override
  public void enterIfThenStatement(Java9Parser.IfThenStatementContext ctx) {
    enter(NonTerminal.IfThenStatement);
  }

  @Override
  public void enterImportDeclaration(Java9Parser.ImportDeclarationContext ctx) {
    enter(NonTerminal.ImportDeclaration);
  }

  @Override
  public void enterInclusiveOrExpression(Java9Parser.InclusiveOrExpressionContext ctx) {
    enter(NonTerminal.InclusiveOrExpression);
  }

  @Override
  public void enterInferredFormalParameterList(Java9Parser.InferredFormalParameterListContext ctx) {
    enter(NonTerminal.InferredFormalParameterList);
  }

  @Override
  public void enterInstanceInitializer(Java9Parser.InstanceInitializerContext ctx) {
    enter(NonTerminal.InstanceInitializer);
  }

  @Override
  public void enterIntegralType(Java9Parser.IntegralTypeContext ctx) {
    enter(NonTerminal.IntegralType);
  }

  @Override
  public void enterInterfaceBody(Java9Parser.InterfaceBodyContext ctx) {
    enter(NonTerminal.InterfaceBody);
  }

  @Override
  public void enterInterfaceDeclaration(Java9Parser.InterfaceDeclarationContext ctx) {
    enter(NonTerminal.InterfaceDeclaration);
  }

  @Override
  public void enterInterfaceMemberDeclaration(Java9Parser.InterfaceMemberDeclarationContext ctx) {
    enter(NonTerminal.InterfaceMemberDeclaration);
  }

  @Override
  public void enterInterfaceMethodDeclaration(Java9Parser.InterfaceMethodDeclarationContext ctx) {
    enter(NonTerminal.InterfaceMethodDeclaration);
  }

  @Override
  public void enterInterfaceMethodModifier(Java9Parser.InterfaceMethodModifierContext ctx) {
    enter(NonTerminal.InterfaceMethodModifier);
  }

  @Override
  public void enterInterfaceModifier(Java9Parser.InterfaceModifierContext ctx) {
    enter(NonTerminal.InterfaceModifier);
  }

  @Override
  public void enterInterfaceType(Java9Parser.InterfaceTypeContext ctx) {
    enter(NonTerminal.InterfaceType);
  }

  @Override
  public void enterInterfaceTypeList(Java9Parser.InterfaceTypeListContext ctx) {
    enter(NonTerminal.InterfaceTypeList);
  }

  @Override
  public void enterInterfaceType_lf_classOrInterfaceType(Java9Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.InterfaceType_lf_classOrInterfaceType);
  }

  @Override
  public void enterInterfaceType_lfno_classOrInterfaceType(Java9Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.InterfaceType_lfno_classOrInterfaceType);
  }

  @Override
  public void enterLabeledStatement(Java9Parser.LabeledStatementContext ctx) {
    enter(NonTerminal.LabeledStatement);
  }

  @Override
  public void enterLabeledStatementNoShortIf(Java9Parser.LabeledStatementNoShortIfContext ctx) {
    enter(NonTerminal.LabeledStatementNoShortIf);
  }

  @Override
  public void enterLambdaBody(Java9Parser.LambdaBodyContext ctx) {
    enter(NonTerminal.LambdaBody);
  }

  @Override
  public void enterLambdaExpression(Java9Parser.LambdaExpressionContext ctx) {
    enter(NonTerminal.LambdaExpression);
  }

  @Override
  public void enterLambdaParameters(Java9Parser.LambdaParametersContext ctx) {
    enter(NonTerminal.LambdaParameters);
  }

  @Override
  public void enterLastFormalParameter(Java9Parser.LastFormalParameterContext ctx) {
    enter(NonTerminal.LastFormalParameter);
  }

  @Override
  public void enterLeftHandSide(Java9Parser.LeftHandSideContext ctx) {
    enter(NonTerminal.LeftHandSide);
  }

  @Override
  public void enterLiteral(Java9Parser.LiteralContext ctx) {
    enter(NonTerminal.Literal);
  }

  @Override
  public void enterLocalVariableDeclaration(Java9Parser.LocalVariableDeclarationContext ctx) {
    enter(NonTerminal.LocalVariableDeclaration);
  }

  @Override
  public void enterLocalVariableDeclarationStatement(Java9Parser.LocalVariableDeclarationStatementContext ctx) {
    enter(NonTerminal.LocalVariableDeclarationStatement);
  }

  @Override
  public void enterMarkerAnnotation(Java9Parser.MarkerAnnotationContext ctx) {
    enter(NonTerminal.MarkerAnnotation);
  }

  @Override
  public void enterMethodBody(Java9Parser.MethodBodyContext ctx) {
    enter(NonTerminal.MethodBody);
  }

  @Override
  public void enterMethodDeclaration(Java9Parser.MethodDeclarationContext ctx) {
    enter(NonTerminal.MethodDeclaration);
  }

  @Override
  public void enterMethodDeclarator(Java9Parser.MethodDeclaratorContext ctx) {
    enter(NonTerminal.MethodDeclarator);
  }

  @Override
  public void enterMethodHeader(Java9Parser.MethodHeaderContext ctx) {
    enter(NonTerminal.MethodHeader);
  }

  @Override
  public void enterMethodInvocation(Java9Parser.MethodInvocationContext ctx) {
    enter(NonTerminal.MethodInvocation);
  }

  @Override
  public void enterMethodInvocation_lf_primary(Java9Parser.MethodInvocation_lf_primaryContext ctx) {
    enter(NonTerminal.MethodInvocation_lf_primary);
  }

  @Override
  public void enterMethodInvocation_lfno_primary(Java9Parser.MethodInvocation_lfno_primaryContext ctx) {
    enter(NonTerminal.MethodInvocation_lfno_primary);
  }

  @Override
  public void enterMethodModifier(Java9Parser.MethodModifierContext ctx) {
    enter(NonTerminal.MethodModifier);
  }

  @Override
  public void enterMethodName(Java9Parser.MethodNameContext ctx) {
    enter(NonTerminal.MethodName);
  }

  @Override
  public void enterMethodReference(Java9Parser.MethodReferenceContext ctx) {
    enter(NonTerminal.MethodReference);
  }

  @Override
  public void enterMethodReference_lf_primary(Java9Parser.MethodReference_lf_primaryContext ctx) {
    enter(NonTerminal.MethodReference_lf_primary);
  }

  @Override
  public void enterMethodReference_lfno_primary(Java9Parser.MethodReference_lfno_primaryContext ctx) {
    enter(NonTerminal.MethodReference_lfno_primary);
  }

  @Override
  public void enterModularCompilation(Java9Parser.ModularCompilationContext ctx) {
    enter(NonTerminal.ModularCompilation);
  }

  @Override
  public void enterModuleDeclaration(Java9Parser.ModuleDeclarationContext ctx) {
    enter(NonTerminal.ModuleDeclaration);
  }

  @Override
  public void enterModuleDirective(Java9Parser.ModuleDirectiveContext ctx) {
    enter(NonTerminal.ModuleDirective);
  }

  @Override
  public void enterModuleName(Java9Parser.ModuleNameContext ctx) {
    enter(NonTerminal.ModuleName);
  }

  @Override
  public void enterMultiplicativeExpression(Java9Parser.MultiplicativeExpressionContext ctx) {
    enter(NonTerminal.MultiplicativeExpression);
  }

  @Override
  public void enterNormalAnnotation(Java9Parser.NormalAnnotationContext ctx) {
    enter(NonTerminal.NormalAnnotation);
  }

  @Override
  public void enterNormalClassDeclaration(Java9Parser.NormalClassDeclarationContext ctx) {
    enter(NonTerminal.NormalClassDeclaration);
  }

  @Override
  public void enterNormalInterfaceDeclaration(Java9Parser.NormalInterfaceDeclarationContext ctx) {
    enter(NonTerminal.NormalInterfaceDeclaration);
  }

  @Override
  public void enterNumericType(Java9Parser.NumericTypeContext ctx) {
    enter(NonTerminal.NumericType);
  }

  @Override
  public void enterOrdinaryCompilation(Java9Parser.OrdinaryCompilationContext ctx) {
    enter(NonTerminal.OrdinaryCompilation);
  }

  @Override
  public void enterPackageDeclaration(Java9Parser.PackageDeclarationContext ctx) {
    enter(NonTerminal.PackageDeclaration);
  }

  @Override
  public void enterPackageModifier(Java9Parser.PackageModifierContext ctx) {
    enter(NonTerminal.PackageModifier);
  }

  @Override
  public void enterPackageName(Java9Parser.PackageNameContext ctx) {
    enter(NonTerminal.PackageName);
  }

  @Override
  public void enterPackageOrTypeName(Java9Parser.PackageOrTypeNameContext ctx) {
    enter(NonTerminal.PackageOrTypeName);
  }

  @Override
  public void enterPostDecrementExpression(Java9Parser.PostDecrementExpressionContext ctx) {
    enter(NonTerminal.PostDecrementExpression);
  }

  @Override
  public void enterPostDecrementExpression_lf_postfixExpression(Java9Parser.PostDecrementExpression_lf_postfixExpressionContext ctx) {
    enter(NonTerminal.PostDecrementExpression_lf_postfixExpression);
  }

  @Override
  public void enterPostIncrementExpression(Java9Parser.PostIncrementExpressionContext ctx) {
    enter(NonTerminal.PostIncrementExpression);
  }

  @Override
  public void enterPostIncrementExpression_lf_postfixExpression(Java9Parser.PostIncrementExpression_lf_postfixExpressionContext ctx) {
    enter(NonTerminal.PostIncrementExpression_lf_postfixExpression);
  }

  @Override
  public void enterPostfixExpression(Java9Parser.PostfixExpressionContext ctx) {
    enter(NonTerminal.PostfixExpression);
  }

  @Override
  public void enterPreDecrementExpression(Java9Parser.PreDecrementExpressionContext ctx) {
    enter(NonTerminal.PreDecrementExpression);
  }

  @Override
  public void enterPreIncrementExpression(Java9Parser.PreIncrementExpressionContext ctx) {
    enter(NonTerminal.PreIncrementExpression);
  }

  @Override
  public void enterPrimary(Java9Parser.PrimaryContext ctx) {
    enter(NonTerminal.Primary);
  }

  @Override
  public void enterPrimaryNoNewArray(Java9Parser.PrimaryNoNewArrayContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_arrayAccess(Java9Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_arrayAccess);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_arrayAccess(Java9Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_arrayAccess);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
  }

  @Override
  public void enterPrimitiveType(Java9Parser.PrimitiveTypeContext ctx) {
    enter(NonTerminal.PrimitiveType);
  }

  @Override
  public void enterReceiverParameter(Java9Parser.ReceiverParameterContext ctx) {
    enter(NonTerminal.ReceiverParameter);
  }

  @Override
  public void enterReferenceType(Java9Parser.ReferenceTypeContext ctx) {
    enter(NonTerminal.ReferenceType);
  }

  @Override
  public void enterRelationalExpression(Java9Parser.RelationalExpressionContext ctx) {
    enter(NonTerminal.RelationalExpression);
  }

  @Override
  public void enterRequiresModifier(Java9Parser.RequiresModifierContext ctx) {
    enter(NonTerminal.RequiresModifier);
  }

  @Override
  public void enterResource(Java9Parser.ResourceContext ctx) {
    enter(NonTerminal.Resource);
  }

  @Override
  public void enterResourceList(Java9Parser.ResourceListContext ctx) {
    enter(NonTerminal.ResourceList);
  }

  @Override
  public void enterResourceSpecification(Java9Parser.ResourceSpecificationContext ctx) {
    enter(NonTerminal.ResourceSpecification);
  }

  @Override
  public void enterResult(Java9Parser.ResultContext ctx) {
    enter(NonTerminal.Result);
  }

  @Override
  public void enterReturnStatement(Java9Parser.ReturnStatementContext ctx) {
    enter(NonTerminal.ReturnStatement);
  }

  @Override
  public void enterShiftExpression(Java9Parser.ShiftExpressionContext ctx) {
    enter(NonTerminal.ShiftExpression);
  }

  @Override
  public void enterSimpleTypeName(Java9Parser.SimpleTypeNameContext ctx) {
    enter(NonTerminal.SimpleTypeName);
  }

  @Override
  public void enterSingleElementAnnotation(Java9Parser.SingleElementAnnotationContext ctx) {
    enter(NonTerminal.SingleElementAnnotation);
  }

  @Override
  public void enterSingleStaticImportDeclaration(Java9Parser.SingleStaticImportDeclarationContext ctx) {
    enter(NonTerminal.SingleStaticImportDeclaration);
  }

  @Override
  public void enterSingleTypeImportDeclaration(Java9Parser.SingleTypeImportDeclarationContext ctx) {
    enter(NonTerminal.SingleTypeImportDeclaration);
  }

  @Override
  public void enterStatement(Java9Parser.StatementContext ctx) {
    enter(NonTerminal.Statement);
  }

  @Override
  public void enterStatementExpression(Java9Parser.StatementExpressionContext ctx) {
    enter(NonTerminal.StatementExpression);
  }

  @Override
  public void enterStatementExpressionList(Java9Parser.StatementExpressionListContext ctx) {
    enter(NonTerminal.StatementExpressionList);
  }

  @Override
  public void enterStatementNoShortIf(Java9Parser.StatementNoShortIfContext ctx) {
    enter(NonTerminal.StatementNoShortIf);
  }

  @Override
  public void enterStatementWithoutTrailingSubstatement(Java9Parser.StatementWithoutTrailingSubstatementContext ctx) {
    enter(NonTerminal.StatementWithoutTrailingSubstatement);
  }

  @Override
  public void enterStaticImportOnDemandDeclaration(Java9Parser.StaticImportOnDemandDeclarationContext ctx) {
    enter(NonTerminal.StaticImportOnDemandDeclaration);
  }

  @Override
  public void enterStaticInitializer(Java9Parser.StaticInitializerContext ctx) {
    enter(NonTerminal.StaticInitializer);
  }

  @Override
  public void enterSuperclass(Java9Parser.SuperclassContext ctx) {
    enter(NonTerminal.Superclass);
  }

  @Override
  public void enterSuperinterfaces(Java9Parser.SuperinterfacesContext ctx) {
    enter(NonTerminal.Superinterfaces);
  }

  @Override
  public void enterSwitchBlock(Java9Parser.SwitchBlockContext ctx) {
    enter(NonTerminal.SwitchBlock);
  }

  @Override
  public void enterSwitchBlockStatementGroup(Java9Parser.SwitchBlockStatementGroupContext ctx) {
    enter(NonTerminal.SwitchBlockStatementGroup);
  }

  @Override
  public void enterSwitchLabel(Java9Parser.SwitchLabelContext ctx) {
    enter(NonTerminal.SwitchLabel);
  }

  @Override
  public void enterSwitchLabels(Java9Parser.SwitchLabelsContext ctx) {
    enter(NonTerminal.SwitchLabels);
  }

  @Override
  public void enterSwitchStatement(Java9Parser.SwitchStatementContext ctx) {
    enter(NonTerminal.SwitchStatement);
  }

  @Override
  public void enterSynchronizedStatement(Java9Parser.SynchronizedStatementContext ctx) {
    enter(NonTerminal.SynchronizedStatement);
  }

  @Override
  public void enterThrowStatement(Java9Parser.ThrowStatementContext ctx) {
    enter(NonTerminal.ThrowStatement);
  }

  @Override
  public void enterThrows_(Java9Parser.Throws_Context ctx) {
    enter(NonTerminal.Throws_);
  }

  @Override
  public void enterTryStatement(Java9Parser.TryStatementContext ctx) {
    enter(NonTerminal.TryStatement);
  }

  @Override
  public void enterTryWithResourcesStatement(Java9Parser.TryWithResourcesStatementContext ctx) {
    enter(NonTerminal.TryWithResourcesStatement);
  }

  @Override
  public void enterType(Java9Parser.TypeContext ctx) {
    enter(NonTerminal.Type);
  }

  @Override
  public void enterTypeArgument(Java9Parser.TypeArgumentContext ctx) {
    enter(NonTerminal.TypeArgument);
  }

  @Override
  public void enterTypeArgumentList(Java9Parser.TypeArgumentListContext ctx) {
    enter(NonTerminal.TypeArgumentList);
  }

  @Override
  public void enterTypeArguments(Java9Parser.TypeArgumentsContext ctx) {
    enter(NonTerminal.TypeArguments);
  }

  @Override
  public void enterTypeArgumentsOrDiamond(Java9Parser.TypeArgumentsOrDiamondContext ctx) {
    enter(NonTerminal.TypeArgumentsOrDiamond);
  }

  @Override
  public void enterTypeBound(Java9Parser.TypeBoundContext ctx) {
    enter(NonTerminal.TypeBound);
  }

  @Override
  public void enterTypeDeclaration(Java9Parser.TypeDeclarationContext ctx) {
    enter(NonTerminal.TypeDeclaration);
  }

  @Override
  public void enterTypeImportOnDemandDeclaration(Java9Parser.TypeImportOnDemandDeclarationContext ctx) {
    enter(NonTerminal.TypeImportOnDemandDeclaration);
  }

  @Override
  public void enterTypeName(Java9Parser.TypeNameContext ctx) {
    enter(NonTerminal.TypeName);
  }

  @Override
  public void enterTypeParameter(Java9Parser.TypeParameterContext ctx) {
    enter(NonTerminal.TypeParameter);
  }

  @Override
  public void enterTypeParameterList(Java9Parser.TypeParameterListContext ctx) {
    enter(NonTerminal.TypeParameterList);
  }

  @Override
  public void enterTypeParameterModifier(Java9Parser.TypeParameterModifierContext ctx) {
    enter(NonTerminal.TypeParameterModifier);
  }

  @Override
  public void enterTypeParameters(Java9Parser.TypeParametersContext ctx) {
    enter(NonTerminal.TypeParameters);
  }

  @Override
  public void enterTypeVariable(Java9Parser.TypeVariableContext ctx) {
    enter(NonTerminal.TypeVariable);
  }

  @Override
  public void enterUnannArrayType(Java9Parser.UnannArrayTypeContext ctx) {
    enter(NonTerminal.UnannArrayType);
  }

  @Override
  public void enterUnannClassOrInterfaceType(Java9Parser.UnannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannClassOrInterfaceType);
  }

  @Override
  public void enterUnannClassType(Java9Parser.UnannClassTypeContext ctx) {
    enter(NonTerminal.UnannClassType);
  }

  @Override
  public void enterUnannClassType_lf_unannClassOrInterfaceType(Java9Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannClassType_lf_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannClassType_lfno_unannClassOrInterfaceType(Java9Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannClassType_lfno_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType(Java9Parser.UnannInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(Java9Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannInterfaceType_lf_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(Java9Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannInterfaceType_lfno_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannPrimitiveType(Java9Parser.UnannPrimitiveTypeContext ctx) {
    enter(NonTerminal.UnannPrimitiveType);
  }

  @Override
  public void enterUnannReferenceType(Java9Parser.UnannReferenceTypeContext ctx) {
    enter(NonTerminal.UnannReferenceType);
  }

  @Override
  public void enterUnannType(Java9Parser.UnannTypeContext ctx) {
    enter(NonTerminal.UnannType);
  }

  @Override
  public void enterUnannTypeVariable(Java9Parser.UnannTypeVariableContext ctx) {
    enter(NonTerminal.UnannTypeVariable);
  }

  @Override
  public void enterUnaryExpression(Java9Parser.UnaryExpressionContext ctx) {
    enter(NonTerminal.UnaryExpression);
  }

  @Override
  public void enterUnaryExpressionNotPlusMinus(Java9Parser.UnaryExpressionNotPlusMinusContext ctx) {
    enter(NonTerminal.UnaryExpressionNotPlusMinus);
  }

  @Override
  public void enterVariableAccess(Java9Parser.VariableAccessContext ctx) {
    enter(NonTerminal.VariableAccess);
  }

  @Override
  public void enterVariableDeclarator(Java9Parser.VariableDeclaratorContext ctx) {
    enter(NonTerminal.VariableDeclarator);
  }

  @Override
  public void enterVariableDeclaratorId(Java9Parser.VariableDeclaratorIdContext ctx) {
    enter(NonTerminal.VariableDeclaratorId);
  }

  @Override
  public void enterVariableDeclaratorList(Java9Parser.VariableDeclaratorListContext ctx) {
    enter(NonTerminal.VariableDeclaratorList);
  }

  @Override
  public void enterVariableInitializer(Java9Parser.VariableInitializerContext ctx) {
    enter(NonTerminal.VariableInitializer);
  }

  @Override
  public void enterVariableInitializerList(Java9Parser.VariableInitializerListContext ctx) {
    enter(NonTerminal.VariableInitializerList);
  }

  @Override
  public void enterVariableModifier(Java9Parser.VariableModifierContext ctx) {
    enter(NonTerminal.VariableModifier);
  }

  @Override
  public void enterWhileStatement(Java9Parser.WhileStatementContext ctx) {
    enter(NonTerminal.WhileStatement);
  }

  @Override
  public void enterWhileStatementNoShortIf(Java9Parser.WhileStatementNoShortIfContext ctx) {
    enter(NonTerminal.WhileStatementNoShortIf);
  }

  @Override
  public void enterWildcard(Java9Parser.WildcardContext ctx) {
    enter(NonTerminal.Wildcard);
  }

  @Override
  public void enterWildcardBounds(Java9Parser.WildcardBoundsContext ctx) {
    enter(NonTerminal.WildcardBounds);
  }
}
