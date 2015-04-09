package aptell.java;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import aptell.IO;
import static aptell.java.JavaParser.*;

/**
 * @author kongra
 * @created 2015-04-08
 */
final class JavaAptellGen extends JavaBaseListener {
  
  private final IO io;

  JavaAptellGen(IO io) {
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
  public void enterCompilationUnit(CompilationUnitContext ctx) {
    enter(NonTerminal.CompilationUnit);
  }

  @Override
  public void enterPackageDeclaration(PackageDeclarationContext ctx) {
    enter(NonTerminal.PackageDeclaration);
  }

  @Override
  public void enterImportDeclaration(ImportDeclarationContext ctx) {
    enter(NonTerminal.ImportDeclaration);
  }

  @Override
  public void enterTypeDeclaration(TypeDeclarationContext ctx) {
    enter(NonTerminal.TypeDeclaration);
  }

  @Override
  public void enterModifier(ModifierContext ctx) {
    enter(NonTerminal.Modifier);
  }

  @Override
  public void enterClassOrInterfaceModifier(ClassOrInterfaceModifierContext ctx) {
    enter(NonTerminal.ClassOrInterfaceModifier);
  }

  @Override
  public void enterVariableModifier(VariableModifierContext ctx) {
    enter(NonTerminal.VariableModifier);
  }

  @Override
  public void enterClassDeclaration(ClassDeclarationContext ctx) {
    enter(NonTerminal.ClassDeclaration);
  }

  @Override
  public void enterTypeParameters(TypeParametersContext ctx) {
    enter(NonTerminal.TypeParameters);
  }

  @Override
  public void enterTypeParameter(TypeParameterContext ctx) {
    enter(NonTerminal.TypeParameter);
  }

  @Override
  public void enterTypeBound(TypeBoundContext ctx) {
    enter(NonTerminal.TypeBound);
  }

  @Override
  public void enterEnumDeclaration(EnumDeclarationContext ctx) {
    enter(NonTerminal.EnumDeclaration);
  }

  @Override
  public void enterEnumConstants(EnumConstantsContext ctx) {
    enter(NonTerminal.EnumConstants);
  }

  @Override
  public void enterEnumConstant(EnumConstantContext ctx) {
    enter(NonTerminal.EnumConstant);
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
  public void enterTypeList(TypeListContext ctx) {
    enter(NonTerminal.TypeList);
  }

  @Override
  public void enterClassBody(ClassBodyContext ctx) {
    enter(NonTerminal.ClassBody);
  }

  @Override
  public void enterInterfaceBody(InterfaceBodyContext ctx) {
    enter(NonTerminal.InterfaceBody);
  }

  @Override
  public void enterClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
    enter(NonTerminal.ClassBodyDeclaration);
  }

  @Override
  public void enterMemberDeclaration(MemberDeclarationContext ctx) {
    enter(NonTerminal.MemberDeclaration);
  }

  @Override
  public void enterMethodDeclaration(MethodDeclarationContext ctx) {
    enter(NonTerminal.MethodDeclaration);
  }

  @Override
  public void enterGenericMethodDeclaration(GenericMethodDeclarationContext ctx) {
    enter(NonTerminal.GenericMethodDeclaration);
  }

  @Override
  public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
    enter(NonTerminal.ConstructorDeclaration);
  }

  @Override
  public void enterGenericConstructorDeclaration(
      GenericConstructorDeclarationContext ctx) {
    enter(NonTerminal.GenericConstructorDeclaration);
  }

  @Override
  public void enterFieldDeclaration(FieldDeclarationContext ctx) {
    enter(NonTerminal.FieldDeclaration);
  }

  @Override
  public void enterInterfaceBodyDeclaration(InterfaceBodyDeclarationContext ctx) {
    enter(NonTerminal.InterfaceBodyDeclaration);
  }

  @Override
  public void enterInterfaceMemberDeclaration(
      InterfaceMemberDeclarationContext ctx) {
    enter(NonTerminal.InterfaceMemberDeclaration);
  }

  @Override
  public void enterConstDeclaration(ConstDeclarationContext ctx) {
    enter(NonTerminal.ConstDeclaration);
  }

  @Override
  public void enterConstantDeclarator(ConstantDeclaratorContext ctx) {
    enter(NonTerminal.ConstantDeclarator);
  }

  @Override
  public void enterInterfaceMethodDeclaration(
      InterfaceMethodDeclarationContext ctx) {
    enter(NonTerminal.InterfaceMethodDeclaration);
  }

  @Override
  public void enterGenericInterfaceMethodDeclaration(
      GenericInterfaceMethodDeclarationContext ctx) {
    enter(NonTerminal.GenericInterfaceMethodDeclaration);
  }

  @Override
  public void enterVariableDeclarators(VariableDeclaratorsContext ctx) {
    enter(NonTerminal.VariableDeclarators);
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
  public void enterArrayInitializer(ArrayInitializerContext ctx) {
    enter(NonTerminal.ArrayInitializer);
  }

  @Override
  public void enterEnumConstantName(EnumConstantNameContext ctx) {
    enter(NonTerminal.EnumConstantName);
  }

  @Override
  public void enterType(TypeContext ctx) {
    enter(NonTerminal.Type);
  }

  @Override
  public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
    enter(NonTerminal.ClassOrInterfaceType);
  }

  @Override
  public void enterPrimitiveType(PrimitiveTypeContext ctx) {
    enter(NonTerminal.PrimitiveType);
  }

  @Override
  public void enterTypeArguments(TypeArgumentsContext ctx) {
    enter(NonTerminal.TypeArguments);
  }

  @Override
  public void enterTypeArgument(TypeArgumentContext ctx) {
    enter(NonTerminal.TypeArgument);
  }

  @Override
  public void enterQualifiedNameList(QualifiedNameListContext ctx) {
    enter(NonTerminal.QualifiedNameList);
  }

  @Override
  public void enterFormalParameters(FormalParametersContext ctx) {
    enter(NonTerminal.FormalParameters);
  }

  @Override
  public void enterFormalParameterList(FormalParameterListContext ctx) {
    enter(NonTerminal.FormalParameterList);
  }

  @Override
  public void enterFormalParameter(FormalParameterContext ctx) {
    enter(NonTerminal.FormalParameter);
  }

  @Override
  public void enterLastFormalParameter(LastFormalParameterContext ctx) {
    enter(NonTerminal.LastFormalParameter);
  }

  @Override
  public void enterMethodBody(MethodBodyContext ctx) {
    enter(NonTerminal.MethodBody);
  }

  @Override
  public void enterConstructorBody(ConstructorBodyContext ctx) {
    enter(NonTerminal.ConstructorBody);
  }

  @Override
  public void enterQualifiedName(QualifiedNameContext ctx) {
    enter(NonTerminal.QualifiedName);
  }

  @Override
  public void enterLiteral(LiteralContext ctx) {
    enter(NonTerminal.Literal);
  }

  @Override
  public void enterAnnotation(AnnotationContext ctx) {
    enter(NonTerminal.Annotation);
  }

  @Override
  public void enterAnnotationName(AnnotationNameContext ctx) {
    enter(NonTerminal.AnnotationName);
  }

  @Override
  public void enterElementValuePairs(ElementValuePairsContext ctx) {
    enter(NonTerminal.ElementValuePairs);
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
  public void enterElementValueArrayInitializer(
      ElementValueArrayInitializerContext ctx) {
    enter(NonTerminal.ElementValueArrayInitializer);
  }

  @Override
  public void enterAnnotationTypeDeclaration(
      AnnotationTypeDeclarationContext ctx) {
    enter(NonTerminal.AnnotationTypeDeclaration);
  }

  @Override
  public void enterAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
    enter(NonTerminal.AnnotationTypeBody);
  }

  public void enterAnotationTypeElementDeclaration(
      AnnotationTypeElementDeclarationContext ctx) {
    enter(NonTerminal.AnotationTypeElementDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementRest(
      AnnotationTypeElementRestContext ctx) {
    enter(NonTerminal.AnnotationTypeElementRest);
  }

  @Override
  public void enterAnnotationMethodOrConstantRest(
      AnnotationMethodOrConstantRestContext ctx) {
    enter(NonTerminal.AnnotationMethodOrConstantRest);
  }

  @Override
  public void enterAnnotationMethodRest(AnnotationMethodRestContext ctx) {
    enter(NonTerminal.AnnotationMethodRest);
  }

  @Override
  public void enterAnnotationConstantRest(AnnotationConstantRestContext ctx) {
    enter(NonTerminal.AnnotationConstantRest);
  }

  @Override
  public void enterDefaultValue(DefaultValueContext ctx) {
    enter(NonTerminal.DefaultValue);
  }

  @Override
  public void enterBlock(BlockContext ctx) {
    enter(NonTerminal.Block);
  }

  @Override
  public void enterBlockStatement(BlockStatementContext ctx) {
    enter(NonTerminal.BlockStatement);
  }

  @Override
  public void enterLocalVariableDeclarationStatement(
      LocalVariableDeclarationStatementContext ctx) {
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
  public void enterCatchClause(CatchClauseContext ctx) {
    enter(NonTerminal.CatchClause);
  }

  @Override
  public void enterCatchType(CatchTypeContext ctx) {
    enter(NonTerminal.CatchType);
  }

  @Override
  public void enterFinallyBlock(FinallyBlockContext ctx) {
    enter(NonTerminal.FinallyBlock);
  }

  @Override
  public void enterResourceSpecification(ResourceSpecificationContext ctx) {
    enter(NonTerminal.ResourceSpecification);
  }

  @Override
  public void enterResources(ResourcesContext ctx) {
    enter(NonTerminal.Resources);
  }

  @Override
  public void enterClassCreatorRest(ClassCreatorRestContext ctx) {
    enter(NonTerminal.ClassCreatorRest);
  }

  @Override
  public void enterExplicitGenericInvocation(
      ExplicitGenericInvocationContext ctx) {
    enter(NonTerminal.ExplicitGenericInvocation);
  }

  @Override
  public void enterNonWildcardTypeArguments(NonWildcardTypeArgumentsContext ctx) {
    enter(NonTerminal.NonWildcardTypeArguments);
  }

  @Override
  public void enterTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
    enter(NonTerminal.TypeArgumentsOrDiamond);
  }

  @Override
  public void enterNonWildcardTypeArgumentsOrDiamond(
      NonWildcardTypeArgumentsOrDiamondContext ctx) {
    enter(NonTerminal.NonWildcardTypeArgumentsOrDiamond);
  }

  @Override
  public void enterSuperSuffix(SuperSuffixContext ctx) {
    enter(NonTerminal.SuperSuffix);
  }

  @Override
  public void enterExplicitGenericInvocationSuffix(
      ExplicitGenericInvocationSuffixContext ctx) {
    enter(NonTerminal.ExplicitGenericInvocationSuffix);
  }

  @Override
  public void enterArguments(ArgumentsContext ctx) {
    enter(NonTerminal.Arguments);
  }

  @Override
  public void enterAnnotationTypeElementDeclaration(
      AnnotationTypeElementDeclarationContext ctx) {
    enter(NonTerminal.AnnotationElementDeclaration);
  }

  @Override
  public void enterResource(ResourceContext ctx) {
    enter(NonTerminal.Resource);
  }

  @Override
  public void enterSwitchBlockStatementGroup(
      SwitchBlockStatementGroupContext ctx) {
    enter(NonTerminal.SwitchBlockStatementGroup);
  }

  @Override
  public void enterSwitchLabel(SwitchLabelContext ctx) {
    enter(NonTerminal.SwitchLabel);
  }

  @Override
  public void enterForControl(ForControlContext ctx) {
    enter(NonTerminal.ForControl);
  }

  @Override
  public void enterForInit(ForInitContext ctx) {
    enter(NonTerminal.ForInit);
  }

  @Override
  public void enterEnhancedForControl(EnhancedForControlContext ctx) {
    enter(NonTerminal.EnhancedForControl);
  }

  @Override
  public void enterForUpdate(ForUpdateContext ctx) {
    enter(NonTerminal.ForUpdate);
  }

  @Override
  public void enterParExpression(ParExpressionContext ctx) {
    enter(NonTerminal.ParExpression);
  }

  @Override
  public void enterExpressionList(ExpressionListContext ctx) {
    enter(NonTerminal.ExpressionList);
  }

  @Override
  public void enterStatementExpression(StatementExpressionContext ctx) {
    enter(NonTerminal.StatementExpression);
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
  public void enterPrimary(PrimaryContext ctx) {
    enter(NonTerminal.Primary);
  }

  @Override
  public void enterCreator(CreatorContext ctx) {
    enter(NonTerminal.Creator);
  }

  @Override
  public void enterCreatedName(CreatedNameContext ctx) {
    enter(NonTerminal.CreatedName);
  }

  @Override
  public void enterInnerCreator(InnerCreatorContext ctx) {
    enter(NonTerminal.InnerCreator);
  }

  @Override
  public void enterArrayCreatorRest(ArrayCreatorRestContext ctx) {
    enter(NonTerminal.ArrayCreatorRest);
  }

}
