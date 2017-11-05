package aptell.antlr4.java9;

import aptell.antlr4.IO;
import aptell.antlr4.JavaNonTerminal;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author kongra
 * @created 2017-10-30
 */
public class Processor9Listener extends Java9BaseListener {

  private final IO io;

  public Processor9Listener(IO io) {
    this.io = io;
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    io.pushLevel();
    io.writeTerminal(node.getSymbol());
    io.popLevel();
  }

  public void enter(JavaNonTerminal nonTerm) {
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
    enter(JavaNonTerminal.AdditionalBound);
  }

  @Override
  public void enterAdditiveExpression(Java9Parser.AdditiveExpressionContext ctx) {
    enter(JavaNonTerminal.AdditiveExpression);
  }

  @Override
  public void enterAmbiguousName(Java9Parser.AmbiguousNameContext ctx) {
    enter(JavaNonTerminal.AmbiguousName);
  }

  @Override
  public void enterAndExpression(Java9Parser.AndExpressionContext ctx) {
    enter(JavaNonTerminal.AndExpression);
  }

  @Override
  public void enterAnnotation(Java9Parser.AnnotationContext ctx) {
    enter(JavaNonTerminal.Annotation);
  }

  @Override
  public void enterAnnotationTypeBody(Java9Parser.AnnotationTypeBodyContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeBody);
  }

  @Override
  public void enterAnnotationTypeDeclaration(Java9Parser.AnnotationTypeDeclarationContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementDeclaration(Java9Parser.AnnotationTypeElementDeclarationContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeElementDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementModifier(Java9Parser.AnnotationTypeElementModifierContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeElementModifier);
  }

  @Override
  public void enterAnnotationTypeMemberDeclaration(Java9Parser.AnnotationTypeMemberDeclarationContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeMemberDeclaration);
  }

  @Override
  public void enterArgumentList(Java9Parser.ArgumentListContext ctx) {
    enter(JavaNonTerminal.ArgumentList);
  }

  @Override
  public void enterArrayAccess(Java9Parser.ArrayAccessContext ctx) {
    enter(JavaNonTerminal.ArrayAccess);
  }

  @Override
  public void enterArrayAccess_lf_primary(Java9Parser.ArrayAccess_lf_primaryContext ctx) {
    enter(JavaNonTerminal.ArrayAccess_lf_primary);
  }

  @Override
  public void enterArrayAccess_lfno_primary(Java9Parser.ArrayAccess_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.ArrayAccess_lfno_primary);
  }

  @Override
  public void enterArrayCreationExpression(Java9Parser.ArrayCreationExpressionContext ctx) {
    enter(JavaNonTerminal.ArrayCreationExpression);
  }

  @Override
  public void enterArrayInitializer(Java9Parser.ArrayInitializerContext ctx) {
    enter(JavaNonTerminal.ArrayInitializer);
  }

  @Override
  public void enterArrayType(Java9Parser.ArrayTypeContext ctx) {
    enter(JavaNonTerminal.ArrayType);
  }

  @Override
  public void enterAssertStatement(Java9Parser.AssertStatementContext ctx) {
    enter(JavaNonTerminal.AssertStatement);
  }

  @Override
  public void enterAssignment(Java9Parser.AssignmentContext ctx) {
    enter(JavaNonTerminal.Assignment);
  }

  @Override
  public void enterAssignmentExpression(Java9Parser.AssignmentExpressionContext ctx) {
    enter(JavaNonTerminal.AssignmentExpression);
  }

  @Override
  public void enterAssignmentOperator(Java9Parser.AssignmentOperatorContext ctx) {
    enter(JavaNonTerminal.AssignmentOperator);
  }

  @Override
  public void enterBasicForStatement(Java9Parser.BasicForStatementContext ctx) {
    enter(JavaNonTerminal.BasicForStatement);
  }

  @Override
  public void enterBasicForStatementNoShortIf(Java9Parser.BasicForStatementNoShortIfContext ctx) {
    enter(JavaNonTerminal.BasicForStatementNoShortIf);
  }

  @Override
  public void enterBlock(Java9Parser.BlockContext ctx) {
    enter(JavaNonTerminal.Block);
  }

  @Override
  public void enterBlockStatement(Java9Parser.BlockStatementContext ctx) {
    enter(JavaNonTerminal.BlockStatement);
  }

  @Override
  public void enterBlockStatements(Java9Parser.BlockStatementsContext ctx) {
    enter(JavaNonTerminal.BlockStatements);
  }

  @Override
  public void enterBreakStatement(Java9Parser.BreakStatementContext ctx) {
    enter(JavaNonTerminal.BreakStatement);
  }

  @Override
  public void enterCastExpression(Java9Parser.CastExpressionContext ctx) {
    enter(JavaNonTerminal.CastExpression);
  }

  @Override
  public void enterCatchClause(Java9Parser.CatchClauseContext ctx) {
    enter(JavaNonTerminal.CatchClause);
  }

  @Override
  public void enterCatchFormalParameter(Java9Parser.CatchFormalParameterContext ctx) {
    enter(JavaNonTerminal.CatchFormalParameter);
  }

  @Override
  public void enterCatchType(Java9Parser.CatchTypeContext ctx) {
    enter(JavaNonTerminal.CatchType);
  }

  @Override
  public void enterCatches(Java9Parser.CatchesContext ctx) {
    enter(JavaNonTerminal.Catches);
  }

  @Override
  public void enterClassBody(Java9Parser.ClassBodyContext ctx) {
    enter(JavaNonTerminal.ClassBody);
  }

  @Override
  public void enterClassBodyDeclaration(Java9Parser.ClassBodyDeclarationContext ctx) {
    enter(JavaNonTerminal.ClassBodyDeclaration);
  }

  @Override
  public void enterClassDeclaration(Java9Parser.ClassDeclarationContext ctx) {
    enter(JavaNonTerminal.ClassDeclaration);
  }

  @Override
  public void enterClassInstanceCreationExpression(Java9Parser.ClassInstanceCreationExpressionContext ctx) {
    enter(JavaNonTerminal.ClassInstanceCreationExpression);
  }

  @Override
  public void enterClassInstanceCreationExpression_lf_primary(Java9Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
    enter(JavaNonTerminal.ClassInstanceCreationExpression_lf_primary);
  }

  @Override
  public void enterClassInstanceCreationExpression_lfno_primary(Java9Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.ClassInstanceCreationExpression_lfno_primary);
  }

  @Override
  public void enterClassLiteral(Java9Parser.ClassLiteralContext ctx) {
    enter(JavaNonTerminal.ClassLiteral);
  }

  @Override
  public void enterClassMemberDeclaration(Java9Parser.ClassMemberDeclarationContext ctx) {
    enter(JavaNonTerminal.ClassMemberDeclaration);
  }

  @Override
  public void enterClassModifier(Java9Parser.ClassModifierContext ctx) {
    enter(JavaNonTerminal.ClassModifier);
  }

  @Override
  public void enterClassOrInterfaceType(Java9Parser.ClassOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.ClassOrInterfaceType);
  }

  @Override
  public void enterClassType(Java9Parser.ClassTypeContext ctx) {
    enter(JavaNonTerminal.ClassType);
  }

  @Override
  public void enterClassType_lf_classOrInterfaceType(Java9Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.ClassType_lf_classOrInterfaceType);
  }

  @Override
  public void enterClassType_lfno_classOrInterfaceType(Java9Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.ClassType_lfno_classOrInterfaceType);
  }

  @Override
  public void enterCompilationUnit(Java9Parser.CompilationUnitContext ctx) {
    enter(JavaNonTerminal.CompilationUnit);
  }

  @Override
  public void enterConditionalAndExpression(Java9Parser.ConditionalAndExpressionContext ctx) {
    enter(JavaNonTerminal.ConditionalAndExpression);
  }

  @Override
  public void enterConditionalExpression(Java9Parser.ConditionalExpressionContext ctx) {
    enter(JavaNonTerminal.ConditionalExpression);
  }

  @Override
  public void enterConditionalOrExpression(Java9Parser.ConditionalOrExpressionContext ctx) {
    enter(JavaNonTerminal.ConditionalOrExpression);
  }

  @Override
  public void enterConstantDeclaration(Java9Parser.ConstantDeclarationContext ctx) {
    enter(JavaNonTerminal.ConstantDeclaration);
  }

  @Override
  public void enterConstantExpression(Java9Parser.ConstantExpressionContext ctx) {
    enter(JavaNonTerminal.ConstantExpression);
  }

  @Override
  public void enterConstantModifier(Java9Parser.ConstantModifierContext ctx) {
    enter(JavaNonTerminal.ConstantModifier);
  }

  @Override
  public void enterConstructorBody(Java9Parser.ConstructorBodyContext ctx) {
    enter(JavaNonTerminal.ConstructorBody);
  }

  @Override
  public void enterConstructorDeclaration(Java9Parser.ConstructorDeclarationContext ctx) {
    enter(JavaNonTerminal.ConstructorDeclaration);
  }

  @Override
  public void enterConstructorDeclarator(Java9Parser.ConstructorDeclaratorContext ctx) {
    enter(JavaNonTerminal.ConstructorDeclarator);
  }

  @Override
  public void enterConstructorModifier(Java9Parser.ConstructorModifierContext ctx) {
    enter(JavaNonTerminal.ConstructorModifier);
  }

  @Override
  public void enterContinueStatement(Java9Parser.ContinueStatementContext ctx) {
    enter(JavaNonTerminal.ContinueStatement);
  }

  @Override
  public void enterDefaultValue(Java9Parser.DefaultValueContext ctx) {
    enter(JavaNonTerminal.DefaultValue);
  }

  @Override
  public void enterDimExpr(Java9Parser.DimExprContext ctx) {
    enter(JavaNonTerminal.DimExpr);
  }

  @Override
  public void enterDimExprs(Java9Parser.DimExprsContext ctx) {
    enter(JavaNonTerminal.DimExprs);
  }

  @Override
  public void enterDims(Java9Parser.DimsContext ctx) {
    enter(JavaNonTerminal.Dims);
  }

  @Override
  public void enterDoStatement(Java9Parser.DoStatementContext ctx) {
    enter(JavaNonTerminal.DoStatement);
  }

  @Override
  public void enterElementValue(Java9Parser.ElementValueContext ctx) {
    enter(JavaNonTerminal.ElementValue);
  }

  @Override
  public void enterElementValueArrayInitializer(Java9Parser.ElementValueArrayInitializerContext ctx) {
    enter(JavaNonTerminal.ElementValueArrayInitializer);
  }

  @Override
  public void enterElementValueList(Java9Parser.ElementValueListContext ctx) {
    enter(JavaNonTerminal.ElementValueList);
  }

  @Override
  public void enterElementValuePair(Java9Parser.ElementValuePairContext ctx) {
    enter(JavaNonTerminal.ElementValuePair);
  }

  @Override
  public void enterElementValuePairList(Java9Parser.ElementValuePairListContext ctx) {
    enter(JavaNonTerminal.ElementValuePairList);
  }

  @Override
  public void enterEmptyStatement(Java9Parser.EmptyStatementContext ctx) {
    enter(JavaNonTerminal.EmptyStatement);
  }

  @Override
  public void enterEnhancedForStatement(Java9Parser.EnhancedForStatementContext ctx) {
    enter(JavaNonTerminal.EnhancedForStatement);
  }

  @Override
  public void enterEnhancedForStatementNoShortIf(Java9Parser.EnhancedForStatementNoShortIfContext ctx) {
    enter(JavaNonTerminal.EnhancedForStatementNoShortIf);
  }

  @Override
  public void enterEnumBody(Java9Parser.EnumBodyContext ctx) {
    enter(JavaNonTerminal.EnumBody);
  }

  @Override
  public void enterEnumBodyDeclarations(Java9Parser.EnumBodyDeclarationsContext ctx) {
    enter(JavaNonTerminal.EnumBodyDeclarations);
  }

  @Override
  public void enterEnumConstant(Java9Parser.EnumConstantContext ctx) {
    enter(JavaNonTerminal.EnumConstant);
  }

  @Override
  public void enterEnumConstantList(Java9Parser.EnumConstantListContext ctx) {
    enter(JavaNonTerminal.EnumConstantList);
  }

  @Override
  public void enterEnumConstantModifier(Java9Parser.EnumConstantModifierContext ctx) {
    enter(JavaNonTerminal.EnumConstantModifier);
  }

  @Override
  public void enterEnumConstantName(Java9Parser.EnumConstantNameContext ctx) {
    enter(JavaNonTerminal.EnumConstantName);
  }

  @Override
  public void enterEnumDeclaration(Java9Parser.EnumDeclarationContext ctx) {
    enter(JavaNonTerminal.EnumDeclaration);
  }

  @Override
  public void enterEqualityExpression(Java9Parser.EqualityExpressionContext ctx) {
    enter(JavaNonTerminal.EqualityExpression);
  }

  @Override
  public void enterExceptionType(Java9Parser.ExceptionTypeContext ctx) {
    enter(JavaNonTerminal.ExceptionType);
  }

  @Override
  public void enterExceptionTypeList(Java9Parser.ExceptionTypeListContext ctx) {
    enter(JavaNonTerminal.ExceptionTypeList);
  }

  @Override
  public void enterExclusiveOrExpression(Java9Parser.ExclusiveOrExpressionContext ctx) {
    enter(JavaNonTerminal.ExclusiveOrExpression);
  }

  @Override
  public void enterExplicitConstructorInvocation(Java9Parser.ExplicitConstructorInvocationContext ctx) {
    enter(JavaNonTerminal.ExplicitConstructorInvocation);
  }

  @Override
  public void enterExpression(Java9Parser.ExpressionContext ctx) {
    enter(JavaNonTerminal.Expression);
  }

  @Override
  public void enterExpressionName(Java9Parser.ExpressionNameContext ctx) {
    enter(JavaNonTerminal.ExpressionName);
  }

  @Override
  public void enterExpressionStatement(Java9Parser.ExpressionStatementContext ctx) {
    enter(JavaNonTerminal.ExpressionStatement);
  }

  @Override
  public void enterExtendsInterfaces(Java9Parser.ExtendsInterfacesContext ctx) {
    enter(JavaNonTerminal.ExtendsInterfaces);
  }

  @Override
  public void enterFieldAccess(Java9Parser.FieldAccessContext ctx) {
    enter(JavaNonTerminal.FieldAccess);
  }

  @Override
  public void enterFieldAccess_lf_primary(Java9Parser.FieldAccess_lf_primaryContext ctx) {
    enter(JavaNonTerminal.FieldAccess_lf_primary);
  }

  @Override
  public void enterFieldAccess_lfno_primary(Java9Parser.FieldAccess_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.FieldAccess_lfno_primary);
  }

  @Override
  public void enterFieldDeclaration(Java9Parser.FieldDeclarationContext ctx) {
    enter(JavaNonTerminal.FieldDeclaration);
  }

  @Override
  public void enterFieldModifier(Java9Parser.FieldModifierContext ctx) {
    enter(JavaNonTerminal.FieldModifier);
  }

  @Override
  public void enterFinally_(Java9Parser.Finally_Context ctx) {
    enter(JavaNonTerminal.Finally_);
  }

  @Override
  public void enterFloatingPointType(Java9Parser.FloatingPointTypeContext ctx) {
    enter(JavaNonTerminal.FloatingPointType);
  }

  @Override
  public void enterForInit(Java9Parser.ForInitContext ctx) {
    enter(JavaNonTerminal.ForInit);
  }

  @Override
  public void enterForStatement(Java9Parser.ForStatementContext ctx) {
    enter(JavaNonTerminal.ForStatement);
  }

  @Override
  public void enterForStatementNoShortIf(Java9Parser.ForStatementNoShortIfContext ctx) {
    enter(JavaNonTerminal.ForStatementNoShortIf);
  }

  @Override
  public void enterForUpdate(Java9Parser.ForUpdateContext ctx) {
    enter(JavaNonTerminal.ForUpdate);
  }

  @Override
  public void enterFormalParameter(Java9Parser.FormalParameterContext ctx) {
    enter(JavaNonTerminal.FormalParameter);
  }

  @Override
  public void enterFormalParameterList(Java9Parser.FormalParameterListContext ctx) {
    enter(JavaNonTerminal.FormalParameterList);
  }

  @Override
  public void enterFormalParameters(Java9Parser.FormalParametersContext ctx) {
    enter(JavaNonTerminal.FormalParameters);
  }

  @Override
  public void enterIfThenElseStatement(Java9Parser.IfThenElseStatementContext ctx) {
    enter(JavaNonTerminal.IfThenElseStatement);
  }

  @Override
  public void enterIfThenElseStatementNoShortIf(Java9Parser.IfThenElseStatementNoShortIfContext ctx) {
    enter(JavaNonTerminal.IfThenElseStatementNoShortIf);
  }

  @Override
  public void enterIfThenStatement(Java9Parser.IfThenStatementContext ctx) {
    enter(JavaNonTerminal.IfThenStatement);
  }

  @Override
  public void enterImportDeclaration(Java9Parser.ImportDeclarationContext ctx) {
    enter(JavaNonTerminal.ImportDeclaration);
  }

  @Override
  public void enterInclusiveOrExpression(Java9Parser.InclusiveOrExpressionContext ctx) {
    enter(JavaNonTerminal.InclusiveOrExpression);
  }

  @Override
  public void enterInferredFormalParameterList(Java9Parser.InferredFormalParameterListContext ctx) {
    enter(JavaNonTerminal.InferredFormalParameterList);
  }

  @Override
  public void enterInstanceInitializer(Java9Parser.InstanceInitializerContext ctx) {
    enter(JavaNonTerminal.InstanceInitializer);
  }

  @Override
  public void enterIntegralType(Java9Parser.IntegralTypeContext ctx) {
    enter(JavaNonTerminal.IntegralType);
  }

  @Override
  public void enterInterfaceBody(Java9Parser.InterfaceBodyContext ctx) {
    enter(JavaNonTerminal.InterfaceBody);
  }

  @Override
  public void enterInterfaceDeclaration(Java9Parser.InterfaceDeclarationContext ctx) {
    enter(JavaNonTerminal.InterfaceDeclaration);
  }

  @Override
  public void enterInterfaceMemberDeclaration(Java9Parser.InterfaceMemberDeclarationContext ctx) {
    enter(JavaNonTerminal.InterfaceMemberDeclaration);
  }

  @Override
  public void enterInterfaceMethodDeclaration(Java9Parser.InterfaceMethodDeclarationContext ctx) {
    enter(JavaNonTerminal.InterfaceMethodDeclaration);
  }

  @Override
  public void enterInterfaceMethodModifier(Java9Parser.InterfaceMethodModifierContext ctx) {
    enter(JavaNonTerminal.InterfaceMethodModifier);
  }

  @Override
  public void enterInterfaceModifier(Java9Parser.InterfaceModifierContext ctx) {
    enter(JavaNonTerminal.InterfaceModifier);
  }

  @Override
  public void enterInterfaceType(Java9Parser.InterfaceTypeContext ctx) {
    enter(JavaNonTerminal.InterfaceType);
  }

  @Override
  public void enterInterfaceTypeList(Java9Parser.InterfaceTypeListContext ctx) {
    enter(JavaNonTerminal.InterfaceTypeList);
  }

  @Override
  public void enterInterfaceType_lf_classOrInterfaceType(Java9Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.InterfaceType_lf_classOrInterfaceType);
  }

  @Override
  public void enterInterfaceType_lfno_classOrInterfaceType(Java9Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.InterfaceType_lfno_classOrInterfaceType);
  }

  @Override
  public void enterLabeledStatement(Java9Parser.LabeledStatementContext ctx) {
    enter(JavaNonTerminal.LabeledStatement);
  }

  @Override
  public void enterLabeledStatementNoShortIf(Java9Parser.LabeledStatementNoShortIfContext ctx) {
    enter(JavaNonTerminal.LabeledStatementNoShortIf);
  }

  @Override
  public void enterLambdaBody(Java9Parser.LambdaBodyContext ctx) {
    enter(JavaNonTerminal.LambdaBody);
  }

  @Override
  public void enterLambdaExpression(Java9Parser.LambdaExpressionContext ctx) {
    enter(JavaNonTerminal.LambdaExpression);
  }

  @Override
  public void enterLambdaParameters(Java9Parser.LambdaParametersContext ctx) {
    enter(JavaNonTerminal.LambdaParameters);
  }

  @Override
  public void enterLastFormalParameter(Java9Parser.LastFormalParameterContext ctx) {
    enter(JavaNonTerminal.LastFormalParameter);
  }

  @Override
  public void enterLeftHandSide(Java9Parser.LeftHandSideContext ctx) {
    enter(JavaNonTerminal.LeftHandSide);
  }

  @Override
  public void enterLiteral(Java9Parser.LiteralContext ctx) {
    enter(JavaNonTerminal.Literal);
  }

  @Override
  public void enterLocalVariableDeclaration(Java9Parser.LocalVariableDeclarationContext ctx) {
    enter(JavaNonTerminal.LocalVariableDeclaration);
  }

  @Override
  public void enterLocalVariableDeclarationStatement(Java9Parser.LocalVariableDeclarationStatementContext ctx) {
    enter(JavaNonTerminal.LocalVariableDeclarationStatement);
  }

  @Override
  public void enterMarkerAnnotation(Java9Parser.MarkerAnnotationContext ctx) {
    enter(JavaNonTerminal.MarkerAnnotation);
  }

  @Override
  public void enterMethodBody(Java9Parser.MethodBodyContext ctx) {
    enter(JavaNonTerminal.MethodBody);
  }

  @Override
  public void enterMethodDeclaration(Java9Parser.MethodDeclarationContext ctx) {
    enter(JavaNonTerminal.MethodDeclaration);
  }

  @Override
  public void enterMethodDeclarator(Java9Parser.MethodDeclaratorContext ctx) {
    enter(JavaNonTerminal.MethodDeclarator);
  }

  @Override
  public void enterMethodHeader(Java9Parser.MethodHeaderContext ctx) {
    enter(JavaNonTerminal.MethodHeader);
  }

  @Override
  public void enterMethodInvocation(Java9Parser.MethodInvocationContext ctx) {
    enter(JavaNonTerminal.MethodInvocation);
  }

  @Override
  public void enterMethodInvocation_lf_primary(Java9Parser.MethodInvocation_lf_primaryContext ctx) {
    enter(JavaNonTerminal.MethodInvocation_lf_primary);
  }

  @Override
  public void enterMethodInvocation_lfno_primary(Java9Parser.MethodInvocation_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.MethodInvocation_lfno_primary);
  }

  @Override
  public void enterMethodModifier(Java9Parser.MethodModifierContext ctx) {
    enter(JavaNonTerminal.MethodModifier);
  }

  @Override
  public void enterMethodName(Java9Parser.MethodNameContext ctx) {
    enter(JavaNonTerminal.MethodName);
  }

  @Override
  public void enterMethodReference(Java9Parser.MethodReferenceContext ctx) {
    enter(JavaNonTerminal.MethodReference);
  }

  @Override
  public void enterMethodReference_lf_primary(Java9Parser.MethodReference_lf_primaryContext ctx) {
    enter(JavaNonTerminal.MethodReference_lf_primary);
  }

  @Override
  public void enterMethodReference_lfno_primary(Java9Parser.MethodReference_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.MethodReference_lfno_primary);
  }

  @Override
  public void enterModularCompilation(Java9Parser.ModularCompilationContext ctx) {
    enter(JavaNonTerminal.ModularCompilation);
  }

  @Override
  public void enterModuleDeclaration(Java9Parser.ModuleDeclarationContext ctx) {
    enter(JavaNonTerminal.ModuleDeclaration);
  }

  @Override
  public void enterModuleDirective(Java9Parser.ModuleDirectiveContext ctx) {
    enter(JavaNonTerminal.ModuleDirective);
  }

  @Override
  public void enterModuleName(Java9Parser.ModuleNameContext ctx) {
    enter(JavaNonTerminal.ModuleName);
  }

  @Override
  public void enterMultiplicativeExpression(Java9Parser.MultiplicativeExpressionContext ctx) {
    enter(JavaNonTerminal.MultiplicativeExpression);
  }

  @Override
  public void enterNormalAnnotation(Java9Parser.NormalAnnotationContext ctx) {
    enter(JavaNonTerminal.NormalAnnotation);
  }

  @Override
  public void enterNormalClassDeclaration(Java9Parser.NormalClassDeclarationContext ctx) {
    enter(JavaNonTerminal.NormalClassDeclaration);
  }

  @Override
  public void enterNormalInterfaceDeclaration(Java9Parser.NormalInterfaceDeclarationContext ctx) {
    enter(JavaNonTerminal.NormalInterfaceDeclaration);
  }

  @Override
  public void enterNumericType(Java9Parser.NumericTypeContext ctx) {
    enter(JavaNonTerminal.NumericType);
  }

  @Override
  public void enterOrdinaryCompilation(Java9Parser.OrdinaryCompilationContext ctx) {
    enter(JavaNonTerminal.OrdinaryCompilation);
  }

  @Override
  public void enterPackageDeclaration(Java9Parser.PackageDeclarationContext ctx) {
    enter(JavaNonTerminal.PackageDeclaration);
  }

  @Override
  public void enterPackageModifier(Java9Parser.PackageModifierContext ctx) {
    enter(JavaNonTerminal.PackageModifier);
  }

  @Override
  public void enterPackageName(Java9Parser.PackageNameContext ctx) {
    enter(JavaNonTerminal.PackageName);
  }

  @Override
  public void enterPackageOrTypeName(Java9Parser.PackageOrTypeNameContext ctx) {
    enter(JavaNonTerminal.PackageOrTypeName);
  }

  @Override
  public void enterPostDecrementExpression(Java9Parser.PostDecrementExpressionContext ctx) {
    enter(JavaNonTerminal.PostDecrementExpression);
  }

  @Override
  public void enterPostDecrementExpression_lf_postfixExpression(Java9Parser.PostDecrementExpression_lf_postfixExpressionContext ctx) {
    enter(JavaNonTerminal.PostDecrementExpression_lf_postfixExpression);
  }

  @Override
  public void enterPostIncrementExpression(Java9Parser.PostIncrementExpressionContext ctx) {
    enter(JavaNonTerminal.PostIncrementExpression);
  }

  @Override
  public void enterPostIncrementExpression_lf_postfixExpression(Java9Parser.PostIncrementExpression_lf_postfixExpressionContext ctx) {
    enter(JavaNonTerminal.PostIncrementExpression_lf_postfixExpression);
  }

  @Override
  public void enterPostfixExpression(Java9Parser.PostfixExpressionContext ctx) {
    enter(JavaNonTerminal.PostfixExpression);
  }

  @Override
  public void enterPreDecrementExpression(Java9Parser.PreDecrementExpressionContext ctx) {
    enter(JavaNonTerminal.PreDecrementExpression);
  }

  @Override
  public void enterPreIncrementExpression(Java9Parser.PreIncrementExpressionContext ctx) {
    enter(JavaNonTerminal.PreIncrementExpression);
  }

  @Override
  public void enterPrimary(Java9Parser.PrimaryContext ctx) {
    enter(JavaNonTerminal.Primary);
  }

  @Override
  public void enterPrimaryNoNewArray(Java9Parser.PrimaryNoNewArrayContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_arrayAccess(Java9Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lf_arrayAccess);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_arrayAccess(Java9Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lfno_arrayAccess);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lfno_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
    enter(JavaNonTerminal.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
  }

  @Override
  public void enterPrimitiveType(Java9Parser.PrimitiveTypeContext ctx) {
    enter(JavaNonTerminal.PrimitiveType);
  }

  @Override
  public void enterReceiverParameter(Java9Parser.ReceiverParameterContext ctx) {
    enter(JavaNonTerminal.ReceiverParameter);
  }

  @Override
  public void enterReferenceType(Java9Parser.ReferenceTypeContext ctx) {
    enter(JavaNonTerminal.ReferenceType);
  }

  @Override
  public void enterRelationalExpression(Java9Parser.RelationalExpressionContext ctx) {
    enter(JavaNonTerminal.RelationalExpression);
  }

  @Override
  public void enterRequiresModifier(Java9Parser.RequiresModifierContext ctx) {
    enter(JavaNonTerminal.RequiresModifier);
  }

  @Override
  public void enterResource(Java9Parser.ResourceContext ctx) {
    enter(JavaNonTerminal.Resource);
  }

  @Override
  public void enterResourceList(Java9Parser.ResourceListContext ctx) {
    enter(JavaNonTerminal.ResourceList);
  }

  @Override
  public void enterResourceSpecification(Java9Parser.ResourceSpecificationContext ctx) {
    enter(JavaNonTerminal.ResourceSpecification);
  }

  @Override
  public void enterResult(Java9Parser.ResultContext ctx) {
    enter(JavaNonTerminal.Result);
  }

  @Override
  public void enterReturnStatement(Java9Parser.ReturnStatementContext ctx) {
    enter(JavaNonTerminal.ReturnStatement);
  }

  @Override
  public void enterShiftExpression(Java9Parser.ShiftExpressionContext ctx) {
    enter(JavaNonTerminal.ShiftExpression);
  }

  @Override
  public void enterSimpleTypeName(Java9Parser.SimpleTypeNameContext ctx) {
    enter(JavaNonTerminal.SimpleTypeName);
  }

  @Override
  public void enterSingleElementAnnotation(Java9Parser.SingleElementAnnotationContext ctx) {
    enter(JavaNonTerminal.SingleElementAnnotation);
  }

  @Override
  public void enterSingleStaticImportDeclaration(Java9Parser.SingleStaticImportDeclarationContext ctx) {
    enter(JavaNonTerminal.SingleStaticImportDeclaration);
  }

  @Override
  public void enterSingleTypeImportDeclaration(Java9Parser.SingleTypeImportDeclarationContext ctx) {
    enter(JavaNonTerminal.SingleTypeImportDeclaration);
  }

  @Override
  public void enterStatement(Java9Parser.StatementContext ctx) {
    enter(JavaNonTerminal.Statement);
  }

  @Override
  public void enterStatementExpression(Java9Parser.StatementExpressionContext ctx) {
    enter(JavaNonTerminal.StatementExpression);
  }

  @Override
  public void enterStatementExpressionList(Java9Parser.StatementExpressionListContext ctx) {
    enter(JavaNonTerminal.StatementExpressionList);
  }

  @Override
  public void enterStatementNoShortIf(Java9Parser.StatementNoShortIfContext ctx) {
    enter(JavaNonTerminal.StatementNoShortIf);
  }

  @Override
  public void enterStatementWithoutTrailingSubstatement(Java9Parser.StatementWithoutTrailingSubstatementContext ctx) {
    enter(JavaNonTerminal.StatementWithoutTrailingSubstatement);
  }

  @Override
  public void enterStaticImportOnDemandDeclaration(Java9Parser.StaticImportOnDemandDeclarationContext ctx) {
    enter(JavaNonTerminal.StaticImportOnDemandDeclaration);
  }

  @Override
  public void enterStaticInitializer(Java9Parser.StaticInitializerContext ctx) {
    enter(JavaNonTerminal.StaticInitializer);
  }

  @Override
  public void enterSuperclass(Java9Parser.SuperclassContext ctx) {
    enter(JavaNonTerminal.Superclass);
  }

  @Override
  public void enterSuperinterfaces(Java9Parser.SuperinterfacesContext ctx) {
    enter(JavaNonTerminal.Superinterfaces);
  }

  @Override
  public void enterSwitchBlock(Java9Parser.SwitchBlockContext ctx) {
    enter(JavaNonTerminal.SwitchBlock);
  }

  @Override
  public void enterSwitchBlockStatementGroup(Java9Parser.SwitchBlockStatementGroupContext ctx) {
    enter(JavaNonTerminal.SwitchBlockStatementGroup);
  }

  @Override
  public void enterSwitchLabel(Java9Parser.SwitchLabelContext ctx) {
    enter(JavaNonTerminal.SwitchLabel);
  }

  @Override
  public void enterSwitchLabels(Java9Parser.SwitchLabelsContext ctx) {
    enter(JavaNonTerminal.SwitchLabels);
  }

  @Override
  public void enterSwitchStatement(Java9Parser.SwitchStatementContext ctx) {
    enter(JavaNonTerminal.SwitchStatement);
  }

  @Override
  public void enterSynchronizedStatement(Java9Parser.SynchronizedStatementContext ctx) {
    enter(JavaNonTerminal.SynchronizedStatement);
  }

  @Override
  public void enterThrowStatement(Java9Parser.ThrowStatementContext ctx) {
    enter(JavaNonTerminal.ThrowStatement);
  }

  @Override
  public void enterThrows_(Java9Parser.Throws_Context ctx) {
    enter(JavaNonTerminal.Throws_);
  }

  @Override
  public void enterTryStatement(Java9Parser.TryStatementContext ctx) {
    enter(JavaNonTerminal.TryStatement);
  }

  @Override
  public void enterTryWithResourcesStatement(Java9Parser.TryWithResourcesStatementContext ctx) {
    enter(JavaNonTerminal.TryWithResourcesStatement);
  }

  @Override
  public void enterType(Java9Parser.TypeContext ctx) {
    enter(JavaNonTerminal.Type);
  }

  @Override
  public void enterTypeArgument(Java9Parser.TypeArgumentContext ctx) {
    enter(JavaNonTerminal.TypeArgument);
  }

  @Override
  public void enterTypeArgumentList(Java9Parser.TypeArgumentListContext ctx) {
    enter(JavaNonTerminal.TypeArgumentList);
  }

  @Override
  public void enterTypeArguments(Java9Parser.TypeArgumentsContext ctx) {
    enter(JavaNonTerminal.TypeArguments);
  }

  @Override
  public void enterTypeArgumentsOrDiamond(Java9Parser.TypeArgumentsOrDiamondContext ctx) {
    enter(JavaNonTerminal.TypeArgumentsOrDiamond);
  }

  @Override
  public void enterTypeBound(Java9Parser.TypeBoundContext ctx) {
    enter(JavaNonTerminal.TypeBound);
  }

  @Override
  public void enterTypeDeclaration(Java9Parser.TypeDeclarationContext ctx) {
    enter(JavaNonTerminal.TypeDeclaration);
  }

  @Override
  public void enterTypeImportOnDemandDeclaration(Java9Parser.TypeImportOnDemandDeclarationContext ctx) {
    enter(JavaNonTerminal.TypeImportOnDemandDeclaration);
  }

  @Override
  public void enterTypeName(Java9Parser.TypeNameContext ctx) {
    enter(JavaNonTerminal.TypeName);
  }

  @Override
  public void enterTypeParameter(Java9Parser.TypeParameterContext ctx) {
    enter(JavaNonTerminal.TypeParameter);
  }

  @Override
  public void enterTypeParameterList(Java9Parser.TypeParameterListContext ctx) {
    enter(JavaNonTerminal.TypeParameterList);
  }

  @Override
  public void enterTypeParameterModifier(Java9Parser.TypeParameterModifierContext ctx) {
    enter(JavaNonTerminal.TypeParameterModifier);
  }

  @Override
  public void enterTypeParameters(Java9Parser.TypeParametersContext ctx) {
    enter(JavaNonTerminal.TypeParameters);
  }

  @Override
  public void enterTypeVariable(Java9Parser.TypeVariableContext ctx) {
    enter(JavaNonTerminal.TypeVariable);
  }

  @Override
  public void enterUnannArrayType(Java9Parser.UnannArrayTypeContext ctx) {
    enter(JavaNonTerminal.UnannArrayType);
  }

  @Override
  public void enterUnannClassOrInterfaceType(Java9Parser.UnannClassOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.UnannClassOrInterfaceType);
  }

  @Override
  public void enterUnannClassType(Java9Parser.UnannClassTypeContext ctx) {
    enter(JavaNonTerminal.UnannClassType);
  }

  @Override
  public void enterUnannClassType_lf_unannClassOrInterfaceType(Java9Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.UnannClassType_lf_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannClassType_lfno_unannClassOrInterfaceType(Java9Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.UnannClassType_lfno_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType(Java9Parser.UnannInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.UnannInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(Java9Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.UnannInterfaceType_lf_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(Java9Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.UnannInterfaceType_lfno_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannPrimitiveType(Java9Parser.UnannPrimitiveTypeContext ctx) {
    enter(JavaNonTerminal.UnannPrimitiveType);
  }

  @Override
  public void enterUnannReferenceType(Java9Parser.UnannReferenceTypeContext ctx) {
    enter(JavaNonTerminal.UnannReferenceType);
  }

  @Override
  public void enterUnannType(Java9Parser.UnannTypeContext ctx) {
    enter(JavaNonTerminal.UnannType);
  }

  @Override
  public void enterUnannTypeVariable(Java9Parser.UnannTypeVariableContext ctx) {
    enter(JavaNonTerminal.UnannTypeVariable);
  }

  @Override
  public void enterUnaryExpression(Java9Parser.UnaryExpressionContext ctx) {
    enter(JavaNonTerminal.UnaryExpression);
  }

  @Override
  public void enterUnaryExpressionNotPlusMinus(Java9Parser.UnaryExpressionNotPlusMinusContext ctx) {
    enter(JavaNonTerminal.UnaryExpressionNotPlusMinus);
  }

  @Override
  public void enterVariableAccess(Java9Parser.VariableAccessContext ctx) {
    enter(JavaNonTerminal.VariableAccess);
  }

  @Override
  public void enterVariableDeclarator(Java9Parser.VariableDeclaratorContext ctx) {
    enter(JavaNonTerminal.VariableDeclarator);
  }

  @Override
  public void enterVariableDeclaratorId(Java9Parser.VariableDeclaratorIdContext ctx) {
    enter(JavaNonTerminal.VariableDeclaratorId);
  }

  @Override
  public void enterVariableDeclaratorList(Java9Parser.VariableDeclaratorListContext ctx) {
    enter(JavaNonTerminal.VariableDeclaratorList);
  }

  @Override
  public void enterVariableInitializer(Java9Parser.VariableInitializerContext ctx) {
    enter(JavaNonTerminal.VariableInitializer);
  }

  @Override
  public void enterVariableInitializerList(Java9Parser.VariableInitializerListContext ctx) {
    enter(JavaNonTerminal.VariableInitializerList);
  }

  @Override
  public void enterVariableModifier(Java9Parser.VariableModifierContext ctx) {
    enter(JavaNonTerminal.VariableModifier);
  }

  @Override
  public void enterWhileStatement(Java9Parser.WhileStatementContext ctx) {
    enter(JavaNonTerminal.WhileStatement);
  }

  @Override
  public void enterWhileStatementNoShortIf(Java9Parser.WhileStatementNoShortIfContext ctx) {
    enter(JavaNonTerminal.WhileStatementNoShortIf);
  }

  @Override
  public void enterWildcard(Java9Parser.WildcardContext ctx) {
    enter(JavaNonTerminal.Wildcard);
  }

  @Override
  public void enterWildcardBounds(Java9Parser.WildcardBoundsContext ctx) {
    enter(JavaNonTerminal.WildcardBounds);
  }
}
