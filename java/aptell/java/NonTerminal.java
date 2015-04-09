package aptell.java;

enum NonTerminal {

  CompilationUnit                   (1),
  PackageDeclaration                (2),
  ImportDeclaration                 (3),
  TypeDeclaration                   (4),
  Modifier                          (5),
  ClassOrInterfaceModifier          (6),
  VariableModifier                  (7),
  ClassDeclaration                  (8),
  TypeParameters                    (9),
  TypeParameter                     (10),
  TypeBound                         (11),
  EnumDeclaration                   (12),
  EnumConstants                     (13),
  EnumConstant                      (14),
  EnumBodyDeclarations              (15),
  InterfaceDeclaration              (16),
  TypeList                          (17),
  ClassBody                         (18),
  InterfaceBody                     (19),
  ClassBodyDeclaration              (20),
  MemberDeclaration                 (21),
  MethodDeclaration                 (22),
  GenericMethodDeclaration          (23),
  ConstructorDeclaration            (24),
  GenericConstructorDeclaration     (25),
  FieldDeclaration                  (26),
  InterfaceBodyDeclaration          (27),
  InterfaceMemberDeclaration        (28),
  ConstDeclaration                  (29),
  ConstantDeclarator                (30),
  InterfaceMethodDeclaration        (31),
  GenericInterfaceMethodDeclaration (32),
  VariableDeclarators               (33),
  VariableDeclarator                (34),
  VariableDeclaratorId              (35),
  VariableInitializer               (36),
  ArrayInitializer                  (37),
  EnumConstantName                  (38),
  Type                              (39),
  ClassOrInterfaceType              (40),
  PrimitiveType                     (41),
  TypeArguments                     (42),
  TypeArgument                      (43),
  QualifiedNameList                 (44),
  FormalParameters                  (45),
  FormalParameterList               (46),
  FormalParameter                   (47),
  LastFormalParameter               (48),
  MethodBody                        (49),
  ConstructorBody                   (50),
  QualifiedName                     (51),
  Literal                           (52),
  Annotation                        (53),
  AnnotationName                    (54),
  ElementValuePairs                 (55),
  ElementValuePair                  (56),
  ElementValue                      (57),
  ElementValueArrayInitializer      (58),
  AnnotationTypeDeclaration         (59),
  AnnotationTypeBody                (60),
  AnotationTypeElementDeclaration   (61),
  AnnotationTypeElementRest         (62),
  AnnotationMethodOrConstantRest    (63),
  AnnotationMethodRest              (64),
  AnnotationConstantRest            (65),
  DefaultValue                      (66),
  Block                             (67),
  BlockStatement                    (68),
  LocalVariableDeclarationStatement (69),
  LocalVariableDeclaration          (70),
  Statement                         (71),
  CatchClause                       (72),
  CatchType                         (73),
  FinallyBlock                      (74),
  ResourceSpecification             (75),
  Resources                         (76),
  ClassCreatorRest                  (77),
  ExplicitGenericInvocation         (78),
  NonWildcardTypeArguments          (79),
  TypeArgumentsOrDiamond            (80),
  NonWildcardTypeArgumentsOrDiamond (81),
  SuperSuffix                       (82),
  ExplicitGenericInvocationSuffix   (83),
  Arguments                         (84),
  Resource                          (85),
  AnnotationElementDeclaration      (86),
  SwitchBlockStatementGroup         (87),
  SwitchLabel                       (88),
  ForControl                        (89),
  ForInit                           (90),
  EnhancedForControl                (91),
  ForUpdate                         (92),
  ParExpression                     (93),
  ExpressionList                    (94),
  StatementExpression               (95),
  ConstantExpression                (96),
  Expression                        (97),
  Primary                           (98),
  Creator                           (99),
  CreatedName                       (100),
  InnerCreator                      (101),
  ArrayCreatorRest                  (102),
  ;

  final int code;

  private NonTerminal(int code) {
    this.code = code;
  }


}