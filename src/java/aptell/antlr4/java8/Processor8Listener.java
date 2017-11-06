package aptell.antlr4.java8;

import aptell.antlr4.IO;
import aptell.antlr4.JavaNonTerminal;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author kongra
 * @created 2017-10-30
 */
public class Processor8Listener extends Java8ParserBaseListener {

  private final IO io;

  public Processor8Listener(IO io) {
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
  public void enterAnnotation(Java8Parser.AnnotationContext ctx) {
    enter(JavaNonTerminal.Annotation);
  }

  @Override
  public void enterAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeBody);
  }

  @Override
  public void enterAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeDeclaration);
  }

  @Override
  public void enterAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeElementDeclaration);
  }

  @Override
  public void enterArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
    enter(JavaNonTerminal.ArrayInitializer);
  }

  @Override
  public void enterBlock(Java8Parser.BlockContext ctx) {
    enter(JavaNonTerminal.Block);
  }

  @Override
  public void enterBlockStatement(Java8Parser.BlockStatementContext ctx) {
    enter(JavaNonTerminal.BlockStatement);
  }

  @Override
  public void enterCatchClause(Java8Parser.CatchClauseContext ctx) {
    enter(JavaNonTerminal.CatchClause);
  }

  @Override
  public void enterCatchType(Java8Parser.CatchTypeContext ctx) {
    enter(JavaNonTerminal.CatchType);
  }

  @Override
  public void enterClassBody(Java8Parser.ClassBodyContext ctx) {
    enter(JavaNonTerminal.ClassBody);
  }

  @Override
  public void enterClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
    enter(JavaNonTerminal.ClassBodyDeclaration);
  }

  @Override
  public void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
    enter(JavaNonTerminal.ClassDeclaration);
  }

  @Override
  public void enterClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx) {
    enter(JavaNonTerminal.ClassOrInterfaceType);
  }

  @Override
  public void enterClassType(Java8Parser.ClassTypeContext ctx) {
    enter(JavaNonTerminal.ClassType);
  }

  @Override
  public void enterCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
    enter(JavaNonTerminal.CompilationUnit);
  }

  @Override
  public void enterConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
    enter(JavaNonTerminal.ConstructorDeclaration);
  }

  @Override
  public void enterDefaultValue(Java8Parser.DefaultValueContext ctx) {
    enter(JavaNonTerminal.DefaultValue);
  }

  @Override
  public void enterElementValue(Java8Parser.ElementValueContext ctx) {
    enter(JavaNonTerminal.ElementValue);
  }

  @Override
  public void enterElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx) {
    enter(JavaNonTerminal.ElementValueArrayInitializer);
  }

  @Override
  public void enterElementValuePair(Java8Parser.ElementValuePairContext ctx) {
    enter(JavaNonTerminal.ElementValuePair);
  }

  @Override
  public void enterEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx) {
    enter(JavaNonTerminal.EnumBodyDeclarations);
  }

  @Override
  public void enterEnumConstant(Java8Parser.EnumConstantContext ctx) {
    enter(JavaNonTerminal.EnumConstant);
  }

  @Override
  public void enterEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
    enter(JavaNonTerminal.EnumDeclaration);
  }

  @Override
  public void enterExpression(Java8Parser.ExpressionContext ctx) {
    enter(JavaNonTerminal.Expression);
  }

  @Override
  public void enterFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
    enter(JavaNonTerminal.FieldDeclaration);
  }

  @Override
  public void enterForInit(Java8Parser.ForInitContext ctx) {
    enter(JavaNonTerminal.ForInit);
  }

  @Override
  public void enterFormalParameter(Java8Parser.FormalParameterContext ctx) {
    enter(JavaNonTerminal.FormalParameter);
  }

  @Override
  public void enterFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
    enter(JavaNonTerminal.FormalParameterList);
  }

  @Override
  public void enterFormalParameters(Java8Parser.FormalParametersContext ctx) {
    enter(JavaNonTerminal.FormalParameters);
  }

  @Override
  public void enterImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
    enter(JavaNonTerminal.ImportDeclaration);
  }

  @Override
  public void enterInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
    enter(JavaNonTerminal.InterfaceBody);
  }

  @Override
  public void enterInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
    enter(JavaNonTerminal.InterfaceDeclaration);
  }

  @Override
  public void enterInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
    enter(JavaNonTerminal.InterfaceMemberDeclaration);
  }

  @Override
  public void enterInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
    enter(JavaNonTerminal.InterfaceMethodDeclaration);
  }

  @Override
  public void enterInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
    enter(JavaNonTerminal.InterfaceMethodModifier);
  }

  @Override
  public void enterLambdaBody(Java8Parser.LambdaBodyContext ctx) {
    enter(JavaNonTerminal.LambdaBody);
  }

  @Override
  public void enterLambdaExpression(Java8Parser.LambdaExpressionContext ctx) {
    enter(JavaNonTerminal.LambdaExpression);
  }

  @Override
  public void enterLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
    enter(JavaNonTerminal.LambdaParameters);
  }

  @Override
  public void enterLastFormalParameter(Java8Parser.LastFormalParameterContext ctx) {
    enter(JavaNonTerminal.LastFormalParameter);
  }

  @Override
  public void enterLiteral(Java8Parser.LiteralContext ctx) {
    enter(JavaNonTerminal.Literal);
  }

  @Override
  public void enterLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
    enter(JavaNonTerminal.LocalVariableDeclaration);
  }

  @Override
  public void enterMethodBody(Java8Parser.MethodBodyContext ctx) {
    enter(JavaNonTerminal.MethodBody);
  }

  @Override
  public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
    enter(JavaNonTerminal.MethodDeclaration);
  }

  @Override
  public void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
    enter(JavaNonTerminal.PackageDeclaration);
  }

  @Override
  public void enterPrimary(Java8Parser.PrimaryContext ctx) {
    enter(JavaNonTerminal.Primary);
  }

  @Override
  public void enterPrimitiveType(Java8Parser.PrimitiveTypeContext ctx) {
    enter(JavaNonTerminal.PrimitiveType);
  }


  @Override
  public void enterResource(Java8Parser.ResourceContext ctx) {
    enter(JavaNonTerminal.Resource);
  }


  @Override
  public void enterResourceSpecification(Java8Parser.ResourceSpecificationContext ctx) {
    enter(JavaNonTerminal.ResourceSpecification);
  }


  @Override
  public void enterStatement(Java8Parser.StatementContext ctx) {
    enter(JavaNonTerminal.Statement);
  }


  @Override
  public void enterSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx) {
    enter(JavaNonTerminal.SwitchBlockStatementGroup);
  }

  @Override
  public void enterSwitchLabel(Java8Parser.SwitchLabelContext ctx) {
    enter(JavaNonTerminal.SwitchLabel);
  }

  @Override
  public void enterTypeArgument(Java8Parser.TypeArgumentContext ctx) {
    enter(JavaNonTerminal.TypeArgument);
  }

  @Override
  public void enterTypeArguments(Java8Parser.TypeArgumentsContext ctx) {
    enter(JavaNonTerminal.TypeArguments);
  }

  @Override
  public void enterTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx) {
    enter(JavaNonTerminal.TypeArgumentsOrDiamond);
  }

  @Override
  public void enterTypeBound(Java8Parser.TypeBoundContext ctx) {
    enter(JavaNonTerminal.TypeBound);
  }

  @Override
  public void enterTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
    enter(JavaNonTerminal.TypeDeclaration);
  }

  @Override
  public void enterTypeParameter(Java8Parser.TypeParameterContext ctx) {
    enter(JavaNonTerminal.TypeParameter);
  }

  @Override
  public void enterTypeParameters(Java8Parser.TypeParametersContext ctx) {
    enter(JavaNonTerminal.TypeParameters);
  }

  @Override
  public void enterVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
    enter(JavaNonTerminal.VariableDeclarator);
  }

  @Override
  public void enterVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
    enter(JavaNonTerminal.VariableDeclaratorId);
  }

  @Override
  public void enterVariableInitializer(Java8Parser.VariableInitializerContext ctx) {
    enter(JavaNonTerminal.VariableInitializer);
  }

  @Override
  public void enterVariableModifier(Java8Parser.VariableModifierContext ctx) {
    enter(JavaNonTerminal.VariableModifier);
  }

  @Override
  public void enterModifier(Java8Parser.ModifierContext ctx) {
    enter(JavaNonTerminal.Modifier);
  }

  @Override
  public void enterClassOrInterfaceModifier(Java8Parser.ClassOrInterfaceModifierContext ctx) {
    enter(JavaNonTerminal.ClassOrInterfaceModifier);
  }

  @Override
  public void enterEnumConstants(Java8Parser.EnumConstantsContext ctx) {
    enter(JavaNonTerminal.EnumConstants);
  }

  @Override
  public void enterMemberDeclaration(Java8Parser.MemberDeclarationContext ctx) {
    enter(JavaNonTerminal.MemberDeclaration);
  }

  @Override
  public void enterTypeTypeOrVoid(Java8Parser.TypeTypeOrVoidContext ctx) {
    enter(JavaNonTerminal.TypeTypeOrVoid);
  }

  @Override
  public void enterGenericMethodDeclaration(Java8Parser.GenericMethodDeclarationContext ctx) {
    enter(JavaNonTerminal.GenericMethodDeclaration);
  }

  @Override
  public void enterGenericConstructorDeclaration(Java8Parser.GenericConstructorDeclarationContext ctx) {
    enter(JavaNonTerminal.GenericConstructorDeclaration);
  }

  @Override
  public void enterInterfaceBodyDeclaration(Java8Parser.InterfaceBodyDeclarationContext ctx) {
    enter(JavaNonTerminal.InterfaceBodyDeclaration);
  }

  @Override
  public void enterConstDeclaration(Java8Parser.ConstDeclarationContext ctx) {
    enter(JavaNonTerminal.ConstDeclaration);
  }

  @Override
  public void enterConstantDeclarator(Java8Parser.ConstantDeclaratorContext ctx) {
    enter(JavaNonTerminal.ConstantDeclarator);
  }

  @Override
  public void enterGenericInterfaceMethodDeclaration(Java8Parser.GenericInterfaceMethodDeclarationContext ctx) {
    enter(JavaNonTerminal.GenericInterfaceMethodDeclaration);
  }

  @Override
  public void enterVariableDeclarators(Java8Parser.VariableDeclaratorsContext ctx) {
    enter(JavaNonTerminal.VariableDeclarators);
  }

  @Override
  public void enterQualifiedNameList(Java8Parser.QualifiedNameListContext ctx) {
    enter(JavaNonTerminal.QualifiedNameList);
  }

  @Override
  public void enterQualifiedName(Java8Parser.QualifiedNameContext ctx) {
    enter(JavaNonTerminal.QualifiedName);
  }

  @Override
  public void enterIntegerLiteral(Java8Parser.IntegerLiteralContext ctx) {
    enter(JavaNonTerminal.IntegerLiteral);
  }

  @Override
  public void enterFloatLiteral(Java8Parser.FloatLiteralContext ctx) {
    enter(JavaNonTerminal.FloatLiteral);
  }

  @Override
  public void enterElementValuePairs(Java8Parser.ElementValuePairsContext ctx) {
    enter(JavaNonTerminal.ElementValuePairs);
  }

  @Override
  public void enterAnnotationTypeElementRest(Java8Parser.AnnotationTypeElementRestContext ctx) {
    enter(JavaNonTerminal.AnnotationTypeElementRest);
  }

  @Override
  public void enterAnnotationMethodOrConstantRest(Java8Parser.AnnotationMethodOrConstantRestContext ctx) {
    enter(JavaNonTerminal.AnnotationMethodOrConstantRest);
  }

  @Override
  public void enterAnnotationMethodRest(Java8Parser.AnnotationMethodRestContext ctx) {
    enter(JavaNonTerminal.AnnotationMethodRest);
  }

  @Override
  public void enterAnnotationConstantRest(Java8Parser.AnnotationConstantRestContext ctx) {
    enter(JavaNonTerminal.AnnotationConstantRest);
  }

  @Override
  public void enterLocalTypeDeclaration(Java8Parser.LocalTypeDeclarationContext ctx) {
    enter(JavaNonTerminal.LocalTypeDeclaration);
  }

  @Override
  public void enterFinallyBlock(Java8Parser.FinallyBlockContext ctx) {
    enter(JavaNonTerminal.FinallyBlock);
  }

  @Override
  public void enterResources(Java8Parser.ResourcesContext ctx) {
    enter(JavaNonTerminal.Resources);
  }

  @Override
  public void enterForControl(Java8Parser.ForControlContext ctx) {
    enter(JavaNonTerminal.ForControl);
  }

  @Override
  public void enterEnhancedForControl(Java8Parser.EnhancedForControlContext ctx) {
    enter(JavaNonTerminal.EnhancedForControl);
  }

  @Override
  public void enterParExpression(Java8Parser.ParExpressionContext ctx) {
    enter(JavaNonTerminal.ParExpression);
  }

  @Override
  public void enterExpressionList(Java8Parser.ExpressionListContext ctx) {
    enter(JavaNonTerminal.ExpressionList);
  }

  @Override
  public void enterCreator(Java8Parser.CreatorContext ctx) {
    enter(JavaNonTerminal.Creator);
  }

  @Override
  public void enterCreatedName(Java8Parser.CreatedNameContext ctx) {
    enter(JavaNonTerminal.CreatedName);
  }

  @Override
  public void enterInnerCreator(Java8Parser.InnerCreatorContext ctx) {
    enter(JavaNonTerminal.InnerCreator);
  }

  @Override
  public void enterArrayCreatorRest(Java8Parser.ArrayCreatorRestContext ctx) {
    enter(JavaNonTerminal.ArrayCreatorRest);
  }

  @Override
  public void enterClassCreatorRest(Java8Parser.ClassCreatorRestContext ctx) {
    enter(JavaNonTerminal.ClassCreatorRest);
  }

  @Override
  public void enterExplicitGenericInvocation(Java8Parser.ExplicitGenericInvocationContext ctx) {
    enter(JavaNonTerminal.ExplicitGenericInvocation);
  }

  @Override
  public void enterNonWildcardTypeArgumentsOrDiamond(Java8Parser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
    enter(JavaNonTerminal.NonWildcardTypeArgumentsOrDiamond);
  }

  @Override
  public void enterNonWildcardTypeArguments(Java8Parser.NonWildcardTypeArgumentsContext ctx) {
    enter(JavaNonTerminal.NonWildcardTypeArguments);
  }

  @Override
  public void enterTypeList(Java8Parser.TypeListContext ctx) {
    enter(JavaNonTerminal.TypeList);
  }

  @Override
  public void enterTypeType(Java8Parser.TypeTypeContext ctx) {
    enter(JavaNonTerminal.TypeType);
  }

  @Override
  public void enterSuperSuffix(Java8Parser.SuperSuffixContext ctx) {
    enter(JavaNonTerminal.SuperSuffix);
  }

  @Override
  public void enterExplicitGenericInvocationSuffix(Java8Parser.ExplicitGenericInvocationSuffixContext ctx) {
    enter(JavaNonTerminal.ExplicitGenericInvocationSuffix);
  }

  @Override
  public void enterArguments(Java8Parser.ArgumentsContext ctx) {
    enter(JavaNonTerminal.Arguments);
  }

}
