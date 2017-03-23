package aptell.antlr4.java8.io;

import aptell.antlr4.java8.Java8Parser;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public enum NonTerminal {

  Literal(1),
  Type(2),
  PrimitiveType(3),
  NumericType(4),
  IntegralType(5),
  FloatingPointType(6),
  ReferenceType(7),
  ClassOrInterfaceType(8),
  ClassType(9),
  ClassType_lf_classOrInterfaceType(10),
  ClassType_lfno_classOrInterfaceType(11),
  InterfaceType(12),
  InterfaceType_lf_classOrInterfaceType(13),
  InterfaceType_lfno_classOrInterfaceType(14),
  TypeVariable(15),
  ArrayType(16),
  Dims(17),
  TypeParameter(18),
  TypeParameterModifier(19),
  TypeBound(20),
  AdditionalBound(21),
  TypeArguments(22),
  TypeArgumentList(23),
  TypeArgument(24),
  Wildcard(25),
  WildcardBounds(26),
  PackageName(27),
  TypeName(28),
  PackageOrTypeName(29),
  ExpressionName(30),
  MethodName(31),
  AmbiguousName(32),
  CompilationUnit(33),
  PackageDeclaration(34),
  PackageModifier(35),
  ImportDeclaration(36),
  SingleTypeImportDeclaration(37),
  TypeImportOnDemandDeclaration(38),
  SingleStaticImportDeclaration(39),
  StaticImportOnDemandDeclaration(40),
  TypeDeclaration(41),
  ClassDeclaration(42),
  NormalClassDeclaration(43),
  ClassModifier(44),
  TypeParameters(45),
  TypeParameterList(46),
  Superclass(47),
  Superinterfaces(48),
  InterfaceTypeList(49),
  ClassBody(50),
  ClassBodyDeclaration(51),
  ClassMemberDeclaration(52),
  FieldDeclaration(53),
  FieldModifier(54),
  VariableDeclaratorList(55),
  VariableDeclarator(56),
  VariableDeclaratorId(57),
  VariableInitializer(58),
  UnannType(59),
  UnannPrimitiveType(60),
  UnannReferenceType(61),
  UnannClassOrInterfaceType(62),
  UnannClassType(63),
  UnannClassType_lf_unannClassOrInterfaceType(64),
  UnannClassType_lfno_unannClassOrInterfaceType(65),
  UnannInterfaceType(66),
  UnannInterfaceType_lf_unannClassOrInterfaceType(67),
  UnannInterfaceType_lfno_unannClassOrInterfaceType(68),
  UnannTypeVariable(69),
  UnannArrayType(70),
  MethodDeclaration(71),
  MethodModifier(72),
  MethodHeader(73),
  Result(74),
  MethodDeclarator(75),
  FormalParameterList(76),
  FormalParameters(77),
  FormalParameter(78),
  VariableModifier(79),
  LastFormalParameter(80),
  ReceiverParameter(81),
  Throws_(82),
  ExceptionTypeList(83),
  ExceptionType(84),
  MethodBody(85),
  InstanceInitializer(86),
  StaticInitializer(87),
  ConstructorDeclaration(88),
  ConstructorModifier(89),
  ConstructorDeclarator(90),
  SimpleTypeName(91),
  ConstructorBody(92),
  ExplicitConstructorInvocation(93),
  EnumDeclaration(94),
  EnumBody(95),
  EnumConstantList(96),
  EnumConstant(97),
  EnumConstantModifier(98),
  EnumBodyDeclarations(99),
  InterfaceDeclaration(100),
  NormalInterfaceDeclaration(101),
  InterfaceModifier(102),
  ExtendsInterfaces(103),
  InterfaceBody(104),
  InterfaceMemberDeclaration(105),
  ConstantDeclaration(106),
  ConstantModifier(107),
  InterfaceMethodDeclaration(108),
  InterfaceMethodModifier(109),
  AnnotationTypeDeclaration(110),
  AnnotationTypeBody(111),
  AnnotationTypeMemberDeclaration(112),
  AnnotationTypeElementDeclaration(113),
  AnnotationTypeElementModifier(114),
  DefaultValue(115),
  Annotation(116),
  NormalAnnotation(117),
  ElementValuePairList(118),
  ElementValuePair(119),
  ElementValue(120),
  ElementValueArrayInitializer(121),
  ElementValueList(122),
  MarkerAnnotation(123),
  SingleElementAnnotation(124),
  ArrayInitializer(125),
  VariableInitializerList(126),
  Block(127),
  BlockStatements(128),
  BlockStatement(129),
  LocalVariableDeclarationStatement(130),
  LocalVariableDeclaration(131),
  Statement(132),
  StatementNoShortIf(133),
  StatementWithoutTrailingSubstatement(134),
  EmptyStatement(135),
  LabeledStatement(136),
  LabeledStatementNoShortIf(137),
  ExpressionStatement(138),
  StatementExpression(139),
  IfThenStatement(140),
  IfThenElseStatement(141),
  IfThenElseStatementNoShortIf(142),
  AssertStatement(143),
  SwitchStatement(144),
  SwitchBlock(145),
  SwitchBlockStatementGroup(146),
  SwitchLabels(147),
  SwitchLabel(148),
  EnumConstantName(149),
  WhileStatement(150),
  WhileStatementNoShortIf(151),
  DoStatement(152),
  ForStatement(153),
  ForStatementNoShortIf(154),
  BasicForStatement(155),
  BasicForStatementNoShortIf(156),
  ForInit(157),
  ForUpdate(158),
  StatementExpressionList(159),
  EnhancedForStatement(160),
  EnhancedForStatementNoShortIf(161),
  BreakStatement(162),
  ContinueStatement(163),
  ReturnStatement(164),
  ThrowStatement(165),
  SynchronizedStatement(166),
  TryStatement(167),
  Catches(168),
  CatchClause(169),
  CatchFormalParameter(170),
  CatchType(171),
  Finally_(172),
  TryWithResourcesStatement(173),
  ResourceSpecification(174),
  ResourceList(175),
  Resource(176),
  Primary(177),
  PrimaryNoNewArray(178),
  PrimaryNoNewArray_lf_arrayAccess(179),
  PrimaryNoNewArray_lfno_arrayAccess(180),
  PrimaryNoNewArray_lf_primary(181),
  PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(182),
  PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(183),
  PrimaryNoNewArray_lfno_primary(184),
  PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(185),
  PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(186),
  ClassInstanceCreationExpression(187),
  ClassInstanceCreationExpression_lf_primary(188),
  ClassInstanceCreationExpression_lfno_primary(189),
  TypeArgumentsOrDiamond(190),
  FieldAccess(191),
  FieldAccess_lf_primary(192),
  FieldAccess_lfno_primary(193),
  ArrayAccess(194),
  ArrayAccess_lf_primary(195),
  ArrayAccess_lfno_primary(196),
  MethodInvocation(197),
  MethodInvocation_lf_primary(198),
  MethodInvocation_lfno_primary(199),
  ArgumentList(200),
  MethodReference(201),
  MethodReference_lf_primary(202),
  MethodReference_lfno_primary(203),
  ArrayCreationExpression(204),
  DimExprs(205),
  DimExpr(206),
  ConstantExpression(207),
  Expression(208),
  LambdaExpression(209),
  LambdaParameters(210),
  InferredFormalParameterList(211),
  LambdaBody(212),
  AssignmentExpression(213),
  Assignment(214),
  LeftHandSide(215),
  AssignmentOperator(216),
  ConditionalExpression(217),
  ConditionalOrExpression(218),
  ConditionalAndExpression(219),
  InclusiveOrExpression(220),
  ExclusiveOrExpression(221),
  AndExpression(222),
  EqualityExpression(223),
  RelationalExpression(224),
  ShiftExpression(225),
  AdditiveExpression(226),
  MultiplicativeExpression(227),
  UnaryExpression(228),
  PreIncrementExpression(229),
  PreDecrementExpression(230),
  UnaryExpressionNotPlusMinus(231),
  PostfixExpression(232),
  PostIncrementExpression(233),
  PostIncrementExpression_lf_postfixExpression(234),
  PostDecrementExpression(235),
  PostDecrementExpression_lf_postfixExpression(236),
  CastExpression(237);

  private final int code;

  NonTerminal(int code) {
    this.code = code;
  }

  public int code() {
    return this.code;
  }

  private Method parseMethod() {
    char[] chs = this.name().toCharArray();
    chs[0] = Character.toLowerCase(chs[0]);
    String name = new String(chs);
    try {
      return Java8Parser.class.getMethod(name);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e); // CAN'T HAPPEN
    }
  }

  public static List<Method> parseMethods() {
    NonTerminal[] vals = NonTerminal.values();
    List<Method> methods = new ArrayList<>(vals.length);
    for(NonTerminal v : vals) {
      methods.add(v.parseMethod());
    }
    return methods;
  }

}