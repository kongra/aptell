package aptell.antlr4.java8.io;

import aptell.antlr4.IO;
import aptell.antlr4.java8.Java8BaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import static aptell.antlr4.java8.Java8Parser.*;

public class AptellWriter extends Java8BaseListener {

  private final IO io;

  public AptellWriter(IO io) {
    this.io = io;
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    io.pushLevel();
    io.writeTerminal(node.getSymbol());
    io.popLevel();
  }

  private void enter(NonTerminal nonTerm) {
    io.pushLevel();
    io.writeNonTerminal(nonTerm.code());
  }

  private void exit() {
    io.popLevel();
  }

  @Override
  public void exitEveryRule(ParserRuleContext ctx) {
    exit();
  }

  @Override
  public void enterLiteral(LiteralContext ctx) {
    enter(NonTerminal.Literal);
  }

  @Override
  public void enterType(TypeContext ctx) {
    enter(NonTerminal.Type);
  }

  @Override
  public void enterPrimitiveType(PrimitiveTypeContext ctx) {
    enter(NonTerminal.PrimitiveType);
  }

  @Override
  public void enterNumericType(NumericTypeContext ctx) {
    enter(NonTerminal.NumericType);
  }

  @Override
  public void enterIntegralType(IntegralTypeContext ctx) {
    enter(NonTerminal.IntegralType);
  }

  @Override
  public void enterFloatingPointType(FloatingPointTypeContext ctx) {
    enter(NonTerminal.FloatingPointType);
  }

  @Override
  public void enterReferenceType(ReferenceTypeContext ctx) {
    enter(NonTerminal.ReferenceType);
  }

  @Override
  public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.ClassOrInterfaceType);
  }

  @Override
  public void enterClassType(ClassTypeContext ctx) {
    enter(NonTerminal.ClassType);
  }

  @Override
  public void enterClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.ClassType_lf_classOrInterfaceType);
  }

  @Override
  public void enterClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.ClassType_lfno_classOrInterfaceType);
  }

  @Override
  public void enterInterfaceType(InterfaceTypeContext ctx) {
    enter(NonTerminal.InterfaceType);
  }

  @Override
  public void enterInterfaceType_lf_classOrInterfaceType(InterfaceType_lf_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.InterfaceType_lf_classOrInterfaceType);
  }

  @Override
  public void enterInterfaceType_lfno_classOrInterfaceType(InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
    enter(NonTerminal.InterfaceType_lfno_classOrInterfaceType);
  }

  @Override
  public void enterTypeVariable(TypeVariableContext ctx) {
    enter(NonTerminal.TypeVariable);
  }

  @Override
  public void enterArrayType(ArrayTypeContext ctx) {
    enter(NonTerminal.ArrayType);
  }

  @Override
  public void enterDims(DimsContext ctx) {
    enter(NonTerminal.Dims);
  }

  @Override
  public void enterTypeParameter(TypeParameterContext ctx) {
    enter(NonTerminal.TypeParameter);
  }

  @Override
  public void enterTypeParameterModifier(TypeParameterModifierContext ctx) {
    enter(NonTerminal.TypeParameterModifier);
  }

  @Override
  public void enterTypeBound(TypeBoundContext ctx) {
    enter(NonTerminal.TypeBound);
  }

  @Override
  public void enterAdditionalBound(AdditionalBoundContext ctx) {
    enter(NonTerminal.AdditionalBound);
  }

  @Override
  public void enterTypeArguments(TypeArgumentsContext ctx) {
    enter(NonTerminal.TypeArguments);
  }

  @Override
  public void enterTypeArgumentList(TypeArgumentListContext ctx) {
    enter(NonTerminal.TypeArgumentList);
  }

  @Override
  public void enterTypeArgument(TypeArgumentContext ctx) {
    enter(NonTerminal.TypeArgument);
  }

  @Override
  public void enterWildcard(WildcardContext ctx) {
    enter(NonTerminal.Wildcard);
  }

  @Override
  public void enterWildcardBounds(WildcardBoundsContext ctx) {
    enter(NonTerminal.WildcardBounds);
  }

  @Override
  public void enterPackageName(PackageNameContext ctx) {
    enter(NonTerminal.PackageName);
  }

  @Override
  public void enterTypeName(TypeNameContext ctx) {
    enter(NonTerminal.TypeName);
  }

  @Override
  public void enterPackageOrTypeName(PackageOrTypeNameContext ctx) {
    enter(NonTerminal.PackageOrTypeName);
  }

  @Override
  public void enterExpressionName(ExpressionNameContext ctx) {
    enter(NonTerminal.ExpressionName);
  }

  @Override
  public void enterMethodName(MethodNameContext ctx) {
    enter(NonTerminal.MethodName);
  }

  @Override
  public void enterAmbiguousName(AmbiguousNameContext ctx) {
    enter(NonTerminal.AmbiguousName);
  }

  @Override
  public void enterCompilationUnit(CompilationUnitContext ctx) {
    enter(NonTerminal.CompilationUnit);
  }

  @Override
  public void enterPackageDeclaration(PackageDeclarationContext ctx) {
    enter(NonTerminal.PackageDeclaration);
  }

  @Override
  public void enterPackageModifier(PackageModifierContext ctx) {
    enter(NonTerminal.PackageModifier);
  }

  @Override
  public void enterImportDeclaration(ImportDeclarationContext ctx) {
    enter(NonTerminal.ImportDeclaration);
  }

  @Override
  public void enterSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {
    enter(NonTerminal.SingleTypeImportDeclaration);
  }

  @Override
  public void enterTypeImportOnDemandDeclaration(TypeImportOnDemandDeclarationContext ctx) {
    enter(NonTerminal.TypeImportOnDemandDeclaration);
  }

  @Override
  public void enterSingleStaticImportDeclaration(SingleStaticImportDeclarationContext ctx) {
    enter(NonTerminal.SingleStaticImportDeclaration);
  }

  @Override
  public void enterStaticImportOnDemandDeclaration(StaticImportOnDemandDeclarationContext ctx) {
    enter(NonTerminal.StaticImportOnDemandDeclaration);
  }

  @Override
  public void enterTypeDeclaration(TypeDeclarationContext ctx) {
    enter(NonTerminal.TypeDeclaration);
  }

  @Override
  public void enterClassDeclaration(ClassDeclarationContext ctx) {
    enter(NonTerminal.ClassDeclaration);
  }

  @Override
  public void enterNormalClassDeclaration(NormalClassDeclarationContext ctx) {
    enter(NonTerminal.NormalClassDeclaration);
  }

  @Override
  public void enterClassModifier(ClassModifierContext ctx) {
    enter(NonTerminal.ClassModifier);
  }

  @Override
  public void enterTypeParameters(TypeParametersContext ctx) {
    enter(NonTerminal.TypeParameters);
  }

  @Override
  public void enterTypeParameterList(TypeParameterListContext ctx) {
    enter(NonTerminal.TypeParameterList);
  }

  @Override
  public void enterSuperclass(SuperclassContext ctx) {
    enter(NonTerminal.Superclass);
  }

  @Override
  public void enterSuperinterfaces(SuperinterfacesContext ctx) {
    enter(NonTerminal.Superinterfaces);
  }

  @Override
  public void enterInterfaceTypeList(InterfaceTypeListContext ctx) {
    enter(NonTerminal.InterfaceTypeList);
  }

  @Override
  public void enterClassBody(ClassBodyContext ctx) {
    enter(NonTerminal.ClassBody);
  }

  @Override
  public void enterClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
    enter(NonTerminal.ClassBodyDeclaration);
  }

  @Override
  public void enterClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
    enter(NonTerminal.ClassMemberDeclaration);
  }

  @Override
  public void enterFieldDeclaration(FieldDeclarationContext ctx) {
    enter(NonTerminal.FieldDeclaration);
  }

  @Override
  public void enterFieldModifier(FieldModifierContext ctx) {
    enter(NonTerminal.FieldModifier);
  }

  @Override
  public void enterVariableDeclaratorList(VariableDeclaratorListContext ctx) {
    enter(NonTerminal.VariableDeclaratorList);
  }

  @Override
  public void enterVariableDeclarator(VariableDeclaratorContext ctx) {
    enter(NonTerminal.VariableDeclarator);
  }

  @Override
  public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
    enter(NonTerminal.VariableDeclaratorId);
  }

  @Override
  public void enterVariableInitializer(VariableInitializerContext ctx) {
    enter(NonTerminal.VariableInitializer);
  }

  @Override
  public void enterUnannType(UnannTypeContext ctx) {
    enter(NonTerminal.UnannType);
  }

  @Override
  public void enterUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {
    enter(NonTerminal.UnannPrimitiveType);
  }

  @Override
  public void enterUnannReferenceType(UnannReferenceTypeContext ctx) {
    enter(NonTerminal.UnannReferenceType);
  }

  @Override
  public void enterUnannClassOrInterfaceType(UnannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannClassOrInterfaceType);
  }

  @Override
  public void enterUnannClassType(UnannClassTypeContext ctx) {
    enter(NonTerminal.UnannClassType);
  }

  @Override
  public void enterUnannClassType_lf_unannClassOrInterfaceType(UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannClassType_lf_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannClassType_lfno_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType(UnannInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannInterfaceType_lf_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.UnannInterfaceType_lfno_unannClassOrInterfaceType);
  }

  @Override
  public void enterUnannTypeVariable(UnannTypeVariableContext ctx) {
    enter(NonTerminal.UnannTypeVariable);
  }

  @Override
  public void enterUnannArrayType(UnannArrayTypeContext ctx) {
    enter(NonTerminal.UnannArrayType);
  }

  @Override
  public void enterMethodDeclaration(MethodDeclarationContext ctx) {
    enter(NonTerminal.MethodDeclaration);
  }

  @Override
  public void enterMethodModifier(MethodModifierContext ctx) {
    enter(NonTerminal.MethodModifier);
  }

  @Override
  public void enterMethodHeader(MethodHeaderContext ctx) {
    enter(NonTerminal.MethodHeader);
  }

  @Override
  public void enterResult(ResultContext ctx) {
    enter(NonTerminal.Result);
  }

  @Override
  public void enterMethodDeclarator(MethodDeclaratorContext ctx) {
    enter(NonTerminal.MethodDeclarator);
  }

  @Override
  public void enterFormalParameterList(FormalParameterListContext ctx) {
    enter(NonTerminal.FormalParameterList);
  }

  @Override
  public void enterFormalParameters(FormalParametersContext ctx) {
    enter(NonTerminal.FormalParameters);
  }

  @Override
  public void enterFormalParameter(FormalParameterContext ctx) {
    enter(NonTerminal.FormalParameter);
  }

  @Override
  public void enterVariableModifier(VariableModifierContext ctx) {
    enter(NonTerminal.VariableModifier);
  }

  @Override
  public void enterLastFormalParameter(LastFormalParameterContext ctx) {
    enter(NonTerminal.LastFormalParameter);
  }

  @Override
  public void enterReceiverParameter(ReceiverParameterContext ctx) {
    enter(NonTerminal.ReceiverParameter);
  }

  @Override
  public void enterThrows_(Throws_Context ctx) {
    enter(NonTerminal.Throws_);
  }

  @Override
  public void enterExceptionTypeList(ExceptionTypeListContext ctx) {
    enter(NonTerminal.ExceptionTypeList);
  }

  @Override
  public void enterExceptionType(ExceptionTypeContext ctx) {
    enter(NonTerminal.ExceptionType);
  }

  @Override
  public void enterMethodBody(MethodBodyContext ctx) {
    enter(NonTerminal.MethodBody);
  }

  @Override
  public void enterInstanceInitializer(InstanceInitializerContext ctx) {
    enter(NonTerminal.InstanceInitializer);
  }

  @Override
  public void enterStaticInitializer(StaticInitializerContext ctx) {
    enter(NonTerminal.StaticInitializer);
  }

  @Override
  public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
    enter(NonTerminal.ConstructorDeclaration);
  }

  @Override
  public void enterConstructorModifier(ConstructorModifierContext ctx) {
    enter(NonTerminal.ConstructorModifier);
  }

  @Override
  public void enterConstructorDeclarator(ConstructorDeclaratorContext ctx) {
    enter(NonTerminal.ConstructorDeclarator);
  }

  @Override
  public void enterSimpleTypeName(SimpleTypeNameContext ctx) {
    enter(NonTerminal.SimpleTypeName);
  }

  @Override
  public void enterConstructorBody(ConstructorBodyContext ctx) {
    enter(NonTerminal.ConstructorBody);
  }

  @Override
  public void enterExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {
    enter(NonTerminal.ExplicitConstructorInvocation);
  }

  @Override
  public void enterEnumDeclaration(EnumDeclarationContext ctx) {
    enter(NonTerminal.EnumDeclaration);
  }

  @Override
  public void enterEnumBody(EnumBodyContext ctx) {
    enter(NonTerminal.EnumBody);
  }

  @Override
  public void enterEnumConstantList(EnumConstantListContext ctx) {
    enter(NonTerminal.EnumConstantList);
  }

  @Override
  public void enterEnumConstant(EnumConstantContext ctx) {
    enter(NonTerminal.EnumConstant);
  }

  @Override
  public void enterEnumConstantModifier(EnumConstantModifierContext ctx) {
    enter(NonTerminal.EnumConstantModifier);
  }

  @Override
  public void enterEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
    enter(NonTerminal.EnumBodyDeclarations);
  }

  @Override
  public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
    enter(NonTerminal.InterfaceDeclaration);
  }

  @Override
  public void enterNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
    enter(NonTerminal.NormalInterfaceDeclaration);
  }

  @Override
  public void enterInterfaceModifier(InterfaceModifierContext ctx) {
    enter(NonTerminal.InterfaceModifier);
  }

  @Override
  public void enterExtendsInterfaces(ExtendsInterfacesContext ctx) {
    enter(NonTerminal.ExtendsInterfaces);
  }

  @Override
  public void enterInterfaceBody(InterfaceBodyContext ctx) {
    enter(NonTerminal.InterfaceBody);
  }

  @Override
  public void enterInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
    enter(NonTerminal.InterfaceMemberDeclaration);
  }

  @Override
  public void enterConstantDeclaration(ConstantDeclarationContext ctx) {
    enter(NonTerminal.ConstantDeclaration);
  }

  @Override
  public void enterConstantModifier(ConstantModifierContext ctx) {
    enter(NonTerminal.ConstantModifier);
  }

  @Override
  public void enterInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
    enter(NonTerminal.InterfaceMethodDeclaration);
  }

  @Override
  public void enterInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {
    enter(NonTerminal.InterfaceMethodModifier);
  }

  @Override
  public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
    enter(NonTerminal.AnnotationTypeDeclaration);
  }

  @Override
  public void enterAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
    enter(NonTerminal.AnnotationTypeBody);
  }

  @Override
  public void enterAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclarationContext ctx) {
    enter(NonTerminal.AnnotationTypeMemberDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
    enter(NonTerminal.AnnotationTypeElementDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementModifier(AnnotationTypeElementModifierContext ctx) {
    enter(NonTerminal.AnnotationTypeElementModifier);
  }

  @Override
  public void enterDefaultValue(DefaultValueContext ctx) {
    enter(NonTerminal.DefaultValue);
  }

  @Override
  public void enterAnnotation(AnnotationContext ctx) {
    enter(NonTerminal.Annotation);
  }

  @Override
  public void enterNormalAnnotation(NormalAnnotationContext ctx) {
    enter(NonTerminal.NormalAnnotation);
  }

  @Override
  public void enterElementValuePairList(ElementValuePairListContext ctx) {
    enter(NonTerminal.ElementValuePairList);
  }

  @Override
  public void enterElementValuePair(ElementValuePairContext ctx) {
    enter(NonTerminal.ElementValuePair);
  }

  @Override
  public void enterElementValue(ElementValueContext ctx) {
    enter(NonTerminal.ElementValue);
  }

  @Override
  public void enterElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
    enter(NonTerminal.ElementValueArrayInitializer);
  }

  @Override
  public void enterElementValueList(ElementValueListContext ctx) {
    enter(NonTerminal.ElementValueList);
  }

  @Override
  public void enterMarkerAnnotation(MarkerAnnotationContext ctx) {
    enter(NonTerminal.MarkerAnnotation);
  }

  @Override
  public void enterSingleElementAnnotation(SingleElementAnnotationContext ctx) {
    enter(NonTerminal.SingleElementAnnotation);
  }

  @Override
  public void enterArrayInitializer(ArrayInitializerContext ctx) {
    enter(NonTerminal.ArrayInitializer);
  }

  @Override
  public void enterVariableInitializerList(VariableInitializerListContext ctx) {
    enter(NonTerminal.VariableInitializerList);
  }

  @Override
  public void enterBlock(BlockContext ctx) {
    enter(NonTerminal.Block);
  }

  @Override
  public void enterBlockStatements(BlockStatementsContext ctx) {
    enter(NonTerminal.BlockStatements);
  }

  @Override
  public void enterBlockStatement(BlockStatementContext ctx) {
    enter(NonTerminal.BlockStatement);
  }

  @Override
  public void enterLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
    enter(NonTerminal.LocalVariableDeclarationStatement);
  }

  @Override
  public void enterLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
    enter(NonTerminal.LocalVariableDeclaration);
  }

  @Override
  public void enterStatement(StatementContext ctx) {
    enter(NonTerminal.Statement);
  }

  @Override
  public void enterStatementNoShortIf(StatementNoShortIfContext ctx) {
    enter(NonTerminal.StatementNoShortIf);
  }

  @Override
  public void enterStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatementContext ctx) {
    enter(NonTerminal.StatementWithoutTrailingSubstatement);
  }

  @Override
  public void enterEmptyStatement(EmptyStatementContext ctx) {
    enter(NonTerminal.EmptyStatement);
  }

  @Override
  public void enterLabeledStatement(LabeledStatementContext ctx) {
    enter(NonTerminal.LabeledStatement);
  }

  @Override
  public void enterLabeledStatementNoShortIf(LabeledStatementNoShortIfContext ctx) {
    enter(NonTerminal.LabeledStatementNoShortIf);
  }

  @Override
  public void enterExpressionStatement(ExpressionStatementContext ctx) {
    enter(NonTerminal.ExpressionStatement);
  }

  @Override
  public void enterStatementExpression(StatementExpressionContext ctx) {
    enter(NonTerminal.StatementExpression);
  }

  @Override
  public void enterIfThenStatement(IfThenStatementContext ctx) {
    enter(NonTerminal.IfThenStatement);
  }

  @Override
  public void enterIfThenElseStatement(IfThenElseStatementContext ctx) {
    enter(NonTerminal.IfThenElseStatement);
  }

  @Override
  public void enterIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIfContext ctx) {
    enter(NonTerminal.IfThenElseStatementNoShortIf);
  }

  @Override
  public void enterAssertStatement(AssertStatementContext ctx) {
    enter(NonTerminal.AssertStatement);
  }

  @Override
  public void enterSwitchStatement(SwitchStatementContext ctx) {
    enter(NonTerminal.SwitchStatement);
  }

  @Override
  public void enterSwitchBlock(SwitchBlockContext ctx) {
    enter(NonTerminal.SwitchBlock);
  }

  @Override
  public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
    enter(NonTerminal.SwitchBlockStatementGroup);
  }

  @Override
  public void enterSwitchLabels(SwitchLabelsContext ctx) {
    enter(NonTerminal.SwitchLabels);
  }

  @Override
  public void enterSwitchLabel(SwitchLabelContext ctx) {
    enter(NonTerminal.SwitchLabel);
  }

  @Override
  public void enterEnumConstantName(EnumConstantNameContext ctx) {
    enter(NonTerminal.EnumConstantName);
  }

  @Override
  public void enterWhileStatement(WhileStatementContext ctx) {
    enter(NonTerminal.WhileStatement);
  }

  @Override
  public void enterWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {
    enter(NonTerminal.WhileStatementNoShortIf);
  }

  @Override
  public void enterDoStatement(DoStatementContext ctx) {
    enter(NonTerminal.DoStatement);
  }

  @Override
  public void enterForStatement(ForStatementContext ctx) {
    enter(NonTerminal.ForStatement);
  }

  @Override
  public void enterForStatementNoShortIf(ForStatementNoShortIfContext ctx) {
    enter(NonTerminal.ForStatementNoShortIf);
  }

  @Override
  public void enterBasicForStatement(BasicForStatementContext ctx) {
    enter(NonTerminal.BasicForStatement);
  }

  @Override
  public void enterBasicForStatementNoShortIf(BasicForStatementNoShortIfContext ctx) {
    enter(NonTerminal.BasicForStatementNoShortIf);
  }

  @Override
  public void enterForInit(ForInitContext ctx) {
    enter(NonTerminal.ForInit);
  }

  @Override
  public void enterForUpdate(ForUpdateContext ctx) {
    enter(NonTerminal.ForUpdate);
  }

  @Override
  public void enterStatementExpressionList(StatementExpressionListContext ctx) {
    enter(NonTerminal.StatementExpressionList);
  }

  @Override
  public void enterEnhancedForStatement(EnhancedForStatementContext ctx) {
    enter(NonTerminal.EnhancedForStatement);
  }

  @Override
  public void enterEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIfContext ctx) {
    enter(NonTerminal.EnhancedForStatementNoShortIf);
  }

  @Override
  public void enterBreakStatement(BreakStatementContext ctx) {
    enter(NonTerminal.BreakStatement);
  }

  @Override
  public void enterContinueStatement(ContinueStatementContext ctx) {
    enter(NonTerminal.ContinueStatement);
  }

  @Override
  public void enterReturnStatement(ReturnStatementContext ctx) {
    enter(NonTerminal.ReturnStatement);
  }

  @Override
  public void enterThrowStatement(ThrowStatementContext ctx) {
    enter(NonTerminal.ThrowStatement);
  }

  @Override
  public void enterSynchronizedStatement(SynchronizedStatementContext ctx) {
    enter(NonTerminal.SynchronizedStatement);
  }

  @Override
  public void enterTryStatement(TryStatementContext ctx) {
    enter(NonTerminal.TryStatement);
  }

  @Override
  public void enterCatches(CatchesContext ctx) {
    enter(NonTerminal.Catches);
  }

  @Override
  public void enterCatchClause(CatchClauseContext ctx) {
    enter(NonTerminal.CatchClause);
  }

  @Override
  public void enterCatchFormalParameter(CatchFormalParameterContext ctx) {
    enter(NonTerminal.CatchFormalParameter);
  }

  @Override
  public void enterCatchType(CatchTypeContext ctx) {
    enter(NonTerminal.CatchType);
  }

  @Override
  public void enterFinally_(Finally_Context ctx) {
    enter(NonTerminal.Finally_);
  }

  @Override
  public void enterTryWithResourcesStatement(TryWithResourcesStatementContext ctx) {
    enter(NonTerminal.TryWithResourcesStatement);
  }

  @Override
  public void enterResourceSpecification(ResourceSpecificationContext ctx) {
    enter(NonTerminal.ResourceSpecification);
  }

  @Override
  public void enterResourceList(ResourceListContext ctx) {
    enter(NonTerminal.ResourceList);
  }

  @Override
  public void enterResource(ResourceContext ctx) {
    enter(NonTerminal.Resource);
  }

  @Override
  public void enterPrimary(PrimaryContext ctx) {
    enter(NonTerminal.Primary);
  }

  @Override
  public void enterPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_arrayAccess(PrimaryNoNewArray_lf_arrayAccessContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_arrayAccess);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_arrayAccess(PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_arrayAccess);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary(PrimaryNoNewArray_lf_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
  }

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
  }

  @Override
  public void enterClassInstanceCreationExpression(ClassInstanceCreationExpressionContext ctx) {
    enter(NonTerminal.ClassInstanceCreationExpression);
  }

  @Override
  public void enterClassInstanceCreationExpression_lf_primary(ClassInstanceCreationExpression_lf_primaryContext ctx) {
    enter(NonTerminal.ClassInstanceCreationExpression_lf_primary);
  }

  @Override
  public void enterClassInstanceCreationExpression_lfno_primary(ClassInstanceCreationExpression_lfno_primaryContext ctx) {
    enter(NonTerminal.ClassInstanceCreationExpression_lfno_primary);
  }

  @Override
  public void enterTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
    enter(NonTerminal.TypeArgumentsOrDiamond);
  }

  @Override
  public void enterFieldAccess(FieldAccessContext ctx) {
    enter(NonTerminal.FieldAccess);
  }

  @Override
  public void enterFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {
    enter(NonTerminal.FieldAccess_lf_primary);
  }

  @Override
  public void enterFieldAccess_lfno_primary(FieldAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.FieldAccess_lfno_primary);
  }

  @Override
  public void enterArrayAccess(ArrayAccessContext ctx) {
    enter(NonTerminal.ArrayAccess);
  }

  @Override
  public void enterArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {
    enter(NonTerminal.ArrayAccess_lf_primary);
  }

  @Override
  public void enterArrayAccess_lfno_primary(ArrayAccess_lfno_primaryContext ctx) {
    enter(NonTerminal.ArrayAccess_lfno_primary);
  }

  @Override
  public void enterMethodInvocation(MethodInvocationContext ctx) {
    enter(NonTerminal.MethodInvocation);
  }

  @Override
  public void enterMethodInvocation_lf_primary(MethodInvocation_lf_primaryContext ctx) {
    enter(NonTerminal.MethodInvocation_lf_primary);
  }

  @Override
  public void enterMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext ctx) {
    enter(NonTerminal.MethodInvocation_lfno_primary);
  }

  @Override
  public void enterArgumentList(ArgumentListContext ctx) {
    enter(NonTerminal.ArgumentList);
  }

  @Override
  public void enterMethodReference(MethodReferenceContext ctx) {
    enter(NonTerminal.MethodReference);
  }

  @Override
  public void enterMethodReference_lf_primary(MethodReference_lf_primaryContext ctx) {
    enter(NonTerminal.MethodReference_lf_primary);
  }

  @Override
  public void enterMethodReference_lfno_primary(MethodReference_lfno_primaryContext ctx) {
    enter(NonTerminal.MethodReference_lfno_primary);
  }

  @Override
  public void enterArrayCreationExpression(ArrayCreationExpressionContext ctx) {
    enter(NonTerminal.ArrayCreationExpression);
  }

  @Override
  public void enterDimExprs(DimExprsContext ctx) {
    enter(NonTerminal.DimExprs);
  }

  @Override
  public void enterDimExpr(DimExprContext ctx) {
    enter(NonTerminal.DimExpr);
  }

  @Override
  public void enterConstantExpression(ConstantExpressionContext ctx) {
    enter(NonTerminal.ConstantExpression);
  }

  @Override
  public void enterExpression(ExpressionContext ctx) {
    enter(NonTerminal.Expression);
  }

  @Override
  public void enterLambdaExpression(LambdaExpressionContext ctx) {
    enter(NonTerminal.LambdaExpression);
  }

  @Override
  public void enterLambdaParameters(LambdaParametersContext ctx) {
    enter(NonTerminal.LambdaParameters);
  }

  @Override
  public void enterInferredFormalParameterList(InferredFormalParameterListContext ctx) {
    enter(NonTerminal.InferredFormalParameterList);
  }

  @Override
  public void enterLambdaBody(LambdaBodyContext ctx) {
    enter(NonTerminal.LambdaBody);
  }

  @Override
  public void enterAssignmentExpression(AssignmentExpressionContext ctx) {
    enter(NonTerminal.AssignmentExpression);
  }

  @Override
  public void enterAssignment(AssignmentContext ctx) {
    enter(NonTerminal.Assignment);
  }

  @Override
  public void enterLeftHandSide(LeftHandSideContext ctx) {
    enter(NonTerminal.LeftHandSide);
  }

  @Override
  public void enterAssignmentOperator(AssignmentOperatorContext ctx) {
    enter(NonTerminal.AssignmentOperator);
  }

  @Override
  public void enterConditionalExpression(ConditionalExpressionContext ctx) {
    enter(NonTerminal.ConditionalExpression);
  }

  @Override
  public void enterConditionalOrExpression(ConditionalOrExpressionContext ctx) {
    enter(NonTerminal.ConditionalOrExpression);
  }

  @Override
  public void enterConditionalAndExpression(ConditionalAndExpressionContext ctx) {
    enter(NonTerminal.ConditionalAndExpression);
  }

  @Override
  public void enterInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
    enter(NonTerminal.InclusiveOrExpression);
  }

  @Override
  public void enterExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
    enter(NonTerminal.ExclusiveOrExpression);
  }

  @Override
  public void enterAndExpression(AndExpressionContext ctx) {
    enter(NonTerminal.AndExpression);
  }

  @Override
  public void enterEqualityExpression(EqualityExpressionContext ctx) {
    enter(NonTerminal.EqualityExpression);
  }

  @Override
  public void enterRelationalExpression(RelationalExpressionContext ctx) {
    enter(NonTerminal.RelationalExpression);
  }

  @Override
  public void enterShiftExpression(ShiftExpressionContext ctx) {
    enter(NonTerminal.ShiftExpression);
  }

  @Override
  public void enterAdditiveExpression(AdditiveExpressionContext ctx) {
    enter(NonTerminal.AdditiveExpression);
  }

  @Override
  public void enterMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
    enter(NonTerminal.MultiplicativeExpression);
  }

  @Override
  public void enterUnaryExpression(UnaryExpressionContext ctx) {
    enter(NonTerminal.UnaryExpression);
  }

  @Override
  public void enterPreIncrementExpression(PreIncrementExpressionContext ctx) {
    enter(NonTerminal.PreIncrementExpression);
  }

  @Override
  public void enterPreDecrementExpression(PreDecrementExpressionContext ctx) {
    enter(NonTerminal.PreDecrementExpression);
  }

  @Override
  public void enterUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinusContext ctx) {
    enter(NonTerminal.UnaryExpressionNotPlusMinus);
  }

  @Override
  public void enterPostfixExpression(PostfixExpressionContext ctx) {
    enter(NonTerminal.PostfixExpression);
  }

  @Override
  public void enterPostIncrementExpression(PostIncrementExpressionContext ctx) {
    enter(NonTerminal.PostIncrementExpression);
  }

  @Override
  public void enterPostIncrementExpression_lf_postfixExpression(PostIncrementExpression_lf_postfixExpressionContext ctx) {
    enter(NonTerminal.PostIncrementExpression_lf_postfixExpression);
  }

  @Override
  public void enterPostDecrementExpression(PostDecrementExpressionContext ctx) {
    enter(NonTerminal.PostDecrementExpression);
  }

  @Override
  public void enterPostDecrementExpression_lf_postfixExpression(PostDecrementExpression_lf_postfixExpressionContext ctx) {
    enter(NonTerminal.PostDecrementExpression_lf_postfixExpression);
  }

  @Override
  public void enterCastExpression(CastExpressionContext ctx) {
    enter(NonTerminal.CastExpression);
  }

}
