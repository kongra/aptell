{-# LANGUAGE Safe #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Aptl.Java
-- Copyright   : (c) 2015 Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2015-04-10
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Aptl.Java
    (
      -- * Core
      Rule (..)
    , parseTree

      -- * Presentation, printing.
    , fileToString
    , fileToStringD
    , printFile
    , printFileD
    )
    where

import           Aptell.Aptl
import qualified Aptell.Aptl.Print as P
import           Kask.Data.Tree.Print (Depth)

-- | Represents ANTLR rules (non-terminals) for Java.g4 grammar.
data Rule =
    Annotation
  | AnnotationTypeBody
  | AnnotationTypeDeclaration
  | AnnotationTypeElementDeclaration
  | ArrayInitializer
  | Block
  | BlockStatement
  | CatchClause
  | CatchType
  | ClassBody
  | ClassBodyDeclaration
  | ClassDeclaration
  | ClassOrInterfaceType
  | ClassType
  | CompilationUnit
  | ConstructorDeclaration
  | DefaultValue
  | ElementValue
  | ElementValueArrayInitializer
  | ElementValuePair
  | EnumBodyDeclarations
  | EnumConstant
  | EnumDeclaration
  | Expression
  | FieldDeclaration
  | ForInit
  | FormalParameter
  | FormalParameterList
  | FormalParameters
  | ImportDeclaration
  | InterfaceBody
  | InterfaceDeclaration
  | InterfaceMemberDeclaration
  | InterfaceMethodDeclaration
  | InterfaceMethodModifier
  | LambdaBody
  | LambdaExpression
  | LambdaParameters
  | LastFormalParameter
  | Literal
  | LocalVariableDeclaration
  | MethodBody
  | MethodDeclaration
  | PackageDeclaration
  | Primary
  | PrimitiveType
  | Resource
  | ResourceSpecification
  | Statement
  | SwitchBlockStatementGroup
  | SwitchLabel
  | TypeArgument
  | TypeArguments
  | TypeArgumentsOrDiamond
  | TypeBound
  | TypeDeclaration
  | TypeParameter
  | TypeParameters
  | VariableDeclarator
  | VariableDeclaratorId
  | VariableInitializer
  | VariableModifier

    -- Java 8
  | AnnotationConstantRest
  | AnnotationMethodOrConstantRest
  | AnnotationMethodRest
  | AnnotationTypeElementRest
  | Arguments
  | ArrayCreatorRest
  | ClassCreatorRest
  | ClassOrInterfaceModifier
  | ConstDeclaration
  | ConstantDeclarator
  | CreatedName
  | Creator
  | ElementValuePairs
  | EnhancedForControl
  | EnumConstants
  | ExplicitGenericInvocation
  | ExplicitGenericInvocationSuffix
  | ExpressionList
  | FinallyBlock
  | FloatLiteral
  | ForControl
  | GenericConstructorDeclaration
  | GenericInterfaceMethodDeclaration
  | GenericMethodDeclaration
  | InnerCreator
  | IntegerLiteral
  | InterfaceBodyDeclaration
  | LocalTypeDeclaration
  | MemberDeclaration
  | Modifier
  | NonWildcardTypeArguments
  | NonWildcardTypeArgumentsOrDiamond
  | ParExpression
  | QualifiedName
  | QualifiedNameList
  | Resources
  | SuperSuffix
  | TypeList
  | TypeType
  | TypeTypeOrVoid
  | VariableDeclarators

    -- Java 9
  | AdditionalBound
  | AdditiveExpression
  | AmbiguousName
  | AndExpression
  | AnnotationTypeElementModifier
  | AnnotationTypeMemberDeclaration
  | ArgumentList
  | ArrayAccess
  | ArrayAccesslfprimary
  | ArrayAccesslfnoprimary
  | ArrayCreationExpression
  | ArrayType
  | AssertStatement
  | Assignment
  | AssignmentExpression
  | AssignmentOperator
  | BasicForStatement
  | BasicForStatementNoShortIf
  | BlockStatements
  | BreakStatement
  | CastExpression
  | CatchFormalParameter
  | Catches
  | ClassInstanceCreationExpression
  | ClassInstanceCreationExpressionlfprimary
  | ClassInstanceCreationExpressionlfnoprimary
  | ClassLiteral
  | ClassMemberDeclaration
  | ClassModifier
  | ClassTypelfclassOrInterfaceType
  | ClassTypelfnoclassOrInterfaceType
  | ConditionalAndExpression
  | ConditionalExpression
  | ConditionalOrExpression
  | ConstantDeclaration
  | ConstantExpression
  | ConstantModifier
  | ConstructorBody
  | ConstructorDeclarator
  | ConstructorModifier
  | ContinueStatement
  | DimExpr
  | DimExprs
  | Dims
  | DoStatement
  | ElementValueList
  | ElementValuePairList
  | EmptyStatement
  | EnhancedForStatement
  | EnhancedForStatementNoShortIf
  | EnumBody
  | EnumConstantList
  | EnumConstantModifier
  | EnumConstantName
  | EqualityExpression
  | ExceptionType
  | ExceptionTypeList
  | ExclusiveOrExpression
  | ExplicitConstructorInvocation
  | ExpressionName
  | ExpressionStatement
  | ExtendsInterfaces
  | FieldAccess
  | FieldAccesslfprimary
  | FieldAccesslfnoprimary
  | FieldModifier
  | Finally
  | FloatingPointType
  | ForStatement
  | ForStatementNoShortIf
  | ForUpdate
  | IfThenElseStatement
  | IfThenElseStatementNoShortIf
  | IfThenStatement
  | InclusiveOrExpression
  | InferredFormalParameterList
  | InstanceInitializer
  | IntegralType
  | InterfaceModifier
  | InterfaceType
  | InterfaceTypeList
  | InterfaceTypelfclassOrInterfaceType
  | InterfaceTypelfnoclassOrInterfaceType
  | LabeledStatement
  | LabeledStatementNoShortIf
  | LeftHandSide
  | LocalVariableDeclarationStatement
  | MarkerAnnotation
  | MethodDeclarator
  | MethodHeader
  | MethodInvocation
  | MethodInvocationlfprimary
  | MethodInvocationlfnoprimary
  | MethodModifier
  | MethodName
  | MethodReference
  | MethodReferencelfprimary
  | MethodReferencelfnoprimary
  | ModularCompilation
  | ModuleDeclaration
  | ModuleDirective
  | ModuleName
  | MultiplicativeExpression
  | NormalAnnotation
  | NormalClassDeclaration
  | NormalInterfaceDeclaration
  | NumericType
  | OrdinaryCompilation
  | PackageModifier
  | PackageName
  | PackageOrTypeName
  | PostDecrementExpression
  | PostDecrementExpressionlfpostfixExpression
  | PostIncrementExpression
  | PostIncrementExpressionlfpostfixExpression
  | PostfixExpression
  | PreDecrementExpression
  | PreIncrementExpression
  | PrimaryNoNewArray
  | PrimaryNoNewArraylfarrayAccess
  | PrimaryNoNewArraylfprimary
  | PrimaryNoNewArraylfprimarylfarrayAccesslfprimary
  | PrimaryNoNewArraylfprimarylfnoarrayAccesslfprimary
  | PrimaryNoNewArraylfnoarrayAccess
  | PrimaryNoNewArraylfnoprimary
  | PrimaryNoNewArraylfnoprimarylfarrayAccesslfnoprimary
  | PrimaryNoNewArraylfnoprimarylfnoarrayAccesslfnoprimary
  | ReceiverParameter
  | ReferenceType
  | RelationalExpression
  | RequiresModifier
  | ResourceList
  | Result
  | ReturnStatement
  | ShiftExpression
  | SimpleTypeName
  | SingleElementAnnotation
  | SingleStaticImportDeclaration
  | SingleTypeImportDeclaration
  | StatementExpression
  | StatementExpressionList
  | StatementNoShortIf
  | StatementWithoutTrailingSubstatement
  | StaticImportOnDemandDeclaration
  | StaticInitializer
  | Superclass
  | Superinterfaces
  | SwitchBlock
  | SwitchLabels
  | SwitchStatement
  | SynchronizedStatement
  | ThrowStatement
  | Throws
  | TryStatement
  | TryWithResourcesStatement
  | Type
  | TypeArgumentList
  | TypeImportOnDemandDeclaration
  | TypeName
  | TypeParameterList
  | TypeParameterModifier
  | TypeVariable
  | UnannArrayType
  | UnannClassOrInterfaceType
  | UnannClassType
  | UnannClassTypelfunannClassOrInterfaceType
  | UnannClassTypelfnounannClassOrInterfaceType
  | UnannInterfaceType
  | UnannInterfaceTypelfunannClassOrInterfaceType
  | UnannInterfaceTypelfnounannClassOrInterfaceType
  | UnannPrimitiveType
  | UnannReferenceType
  | UnannType
  | UnannTypeVariable
  | UnaryExpression
  | UnaryExpressionNotPlusMinus
  | VariableAccess
  | VariableDeclaratorList
  | VariableInitializerList
  | WhileStatement
  | WhileStatementNoShortIf
  | Wildcard
  | WildcardBounds deriving (Show)

javaRule :: Code2Rule Rule
javaRule 1   = Annotation
javaRule 2   = AnnotationTypeBody
javaRule 3   = AnnotationTypeDeclaration
javaRule 4   = AnnotationTypeElementDeclaration
javaRule 5   = ArrayInitializer
javaRule 6   = Block
javaRule 7   = BlockStatement
javaRule 8   = CatchClause
javaRule 9   = CatchType
javaRule 10  = ClassBody
javaRule 11  = ClassBodyDeclaration
javaRule 12  = ClassDeclaration
javaRule 13  = ClassOrInterfaceType
javaRule 14  = ClassType
javaRule 15  = CompilationUnit
javaRule 16  = ConstructorDeclaration
javaRule 17  = DefaultValue
javaRule 18  = ElementValue
javaRule 19  = ElementValueArrayInitializer
javaRule 20  = ElementValuePair
javaRule 21  = EnumBodyDeclarations
javaRule 22  = EnumConstant
javaRule 23  = EnumDeclaration
javaRule 24  = Expression
javaRule 25  = FieldDeclaration
javaRule 26  = ForInit
javaRule 27  = FormalParameter
javaRule 28  = FormalParameterList
javaRule 29  = FormalParameters
javaRule 30  = ImportDeclaration
javaRule 31  = InterfaceBody
javaRule 32  = InterfaceDeclaration
javaRule 33  = InterfaceMemberDeclaration
javaRule 34  = InterfaceMethodDeclaration
javaRule 35  = InterfaceMethodModifier
javaRule 36  = LambdaBody
javaRule 37  = LambdaExpression
javaRule 38  = LambdaParameters
javaRule 39  = LastFormalParameter
javaRule 40  = Literal
javaRule 41  = LocalVariableDeclaration
javaRule 42  = MethodBody
javaRule 43  = MethodDeclaration
javaRule 44  = PackageDeclaration
javaRule 45  = Primary
javaRule 46  = PrimitiveType
javaRule 47  = Resource
javaRule 48  = ResourceSpecification
javaRule 49  = Statement
javaRule 50  = SwitchBlockStatementGroup
javaRule 51  = SwitchLabel
javaRule 52  = TypeArgument
javaRule 53  = TypeArguments
javaRule 54  = TypeArgumentsOrDiamond
javaRule 55  = TypeBound
javaRule 56  = TypeDeclaration
javaRule 57  = TypeParameter
javaRule 58  = TypeParameters
javaRule 59  = VariableDeclarator
javaRule 60  = VariableDeclaratorId
javaRule 61  = VariableInitializer
javaRule 62  = VariableModifier
javaRule 63  = AnnotationConstantRest
javaRule 64  = AnnotationMethodOrConstantRest
javaRule 65  = AnnotationMethodRest
javaRule 66  = AnnotationTypeElementRest
javaRule 67  = Arguments
javaRule 68  = ArrayCreatorRest
javaRule 69  = ClassCreatorRest
javaRule 70  = ClassOrInterfaceModifier
javaRule 71  = ConstDeclaration
javaRule 72  = ConstantDeclarator
javaRule 73  = CreatedName
javaRule 74  = Creator
javaRule 75  = ElementValuePairs
javaRule 76  = EnhancedForControl
javaRule 77  = EnumConstants
javaRule 79  = ExplicitGenericInvocation
javaRule 80  = ExplicitGenericInvocationSuffix
javaRule 81  = ExpressionList
javaRule 82  = FinallyBlock
javaRule 83  = FloatLiteral
javaRule 84  = ForControl
javaRule 85  = GenericConstructorDeclaration
javaRule 86  = GenericInterfaceMethodDeclaration
javaRule 87  = GenericMethodDeclaration
javaRule 88  = InnerCreator
javaRule 89  = IntegerLiteral
javaRule 90  = InterfaceBodyDeclaration
javaRule 91  = LocalTypeDeclaration
javaRule 92  = MemberDeclaration
javaRule 93  = Modifier
javaRule 94  = NonWildcardTypeArguments
javaRule 95  = NonWildcardTypeArgumentsOrDiamond
javaRule 96  = ParExpression
javaRule 97  = QualifiedName
javaRule 98  = QualifiedNameList
javaRule 99  = Resources
javaRule 100 = SuperSuffix
javaRule 101 = TypeList
javaRule 102 = TypeType
javaRule 103 = TypeTypeOrVoid
javaRule 104 = VariableDeclarators
javaRule 105 = AdditionalBound
javaRule 106 = AdditiveExpression
javaRule 107 = AmbiguousName
javaRule 108 = AndExpression
javaRule 109 = AnnotationTypeElementModifier
javaRule 110 = AnnotationTypeMemberDeclaration
javaRule 111 = ArgumentList
javaRule 112 = ArrayAccess
javaRule 113 = ArrayAccesslfprimary
javaRule 114 = ArrayAccesslfnoprimary
javaRule 115 = ArrayCreationExpression
javaRule 116 = ArrayType
javaRule 117 = AssertStatement
javaRule 118 = Assignment
javaRule 119 = AssignmentExpression
javaRule 120 = AssignmentOperator
javaRule 121 = BasicForStatement
javaRule 122 = BasicForStatementNoShortIf
javaRule 123 = BlockStatements
javaRule 124 = BreakStatement
javaRule 125 = CastExpression
javaRule 126 = CatchFormalParameter
javaRule 127 = Catches
javaRule 128 = ClassInstanceCreationExpression
javaRule 129 = ClassInstanceCreationExpressionlfprimary
javaRule 130 = ClassInstanceCreationExpressionlfnoprimary
javaRule 131 = ClassLiteral
javaRule 132 = ClassMemberDeclaration
javaRule 133 = ClassModifier
javaRule 134 = ClassTypelfclassOrInterfaceType
javaRule 135 = ClassTypelfnoclassOrInterfaceType
javaRule 136 = ConditionalAndExpression
javaRule 137 = ConditionalExpression
javaRule 138 = ConditionalOrExpression
javaRule 139 = ConstantDeclaration
javaRule 140 = ConstantExpression
javaRule 141 = ConstantModifier
javaRule 142 = ConstructorBody
javaRule 143 = ConstructorDeclarator
javaRule 144 = ConstructorModifier
javaRule 145 = ContinueStatement
javaRule 146 = DimExpr
javaRule 147 = DimExprs
javaRule 148 = Dims
javaRule 149 = DoStatement
javaRule 150 = ElementValueList
javaRule 151 = ElementValuePairList
javaRule 152 = EmptyStatement
javaRule 153 = EnhancedForStatement
javaRule 154 = EnhancedForStatementNoShortIf
javaRule 155 = EnumBody
javaRule 156 = EnumConstantList
javaRule 157 = EnumConstantModifier
javaRule 158 = EnumConstantName
javaRule 159 = EqualityExpression
javaRule 160 = ExceptionType
javaRule 161 = ExceptionTypeList
javaRule 162 = ExclusiveOrExpression
javaRule 163 = ExplicitConstructorInvocation
javaRule 164 = ExpressionName
javaRule 165 = ExpressionStatement
javaRule 166 = ExtendsInterfaces
javaRule 167 = FieldAccess
javaRule 168 = FieldAccesslfprimary
javaRule 169 = FieldAccesslfnoprimary
javaRule 170 = FieldModifier
javaRule 171 = Finally
javaRule 172 = FloatingPointType
javaRule 173 = ForStatement
javaRule 174 = ForStatementNoShortIf
javaRule 175 = ForUpdate
javaRule 176 = IfThenElseStatement
javaRule 177 = IfThenElseStatementNoShortIf
javaRule 178 = IfThenStatement
javaRule 179 = InclusiveOrExpression
javaRule 180 = InferredFormalParameterList
javaRule 181 = InstanceInitializer
javaRule 182 = IntegralType
javaRule 183 = InterfaceModifier
javaRule 184 = InterfaceType
javaRule 185 = InterfaceTypeList
javaRule 186 = InterfaceTypelfclassOrInterfaceType
javaRule 187 = InterfaceTypelfnoclassOrInterfaceType
javaRule 188 = LabeledStatement
javaRule 189 = LabeledStatementNoShortIf
javaRule 190 = LeftHandSide
javaRule 191 = LocalVariableDeclarationStatement
javaRule 192 = MarkerAnnotation
javaRule 193 = MethodDeclarator
javaRule 194 = MethodHeader
javaRule 195 = MethodInvocation
javaRule 196 = MethodInvocationlfprimary
javaRule 197 = MethodInvocationlfnoprimary
javaRule 198 = MethodModifier
javaRule 199 = MethodName
javaRule 200 = MethodReference
javaRule 201 = MethodReferencelfprimary
javaRule 202 = MethodReferencelfnoprimary
javaRule 203 = ModularCompilation
javaRule 204 = ModuleDeclaration
javaRule 205 = ModuleDirective
javaRule 206 = ModuleName
javaRule 207 = MultiplicativeExpression
javaRule 208 = NormalAnnotation
javaRule 209 = NormalClassDeclaration
javaRule 210 = NormalInterfaceDeclaration
javaRule 211 = NumericType
javaRule 212 = OrdinaryCompilation
javaRule 213 = PackageModifier
javaRule 214 = PackageName
javaRule 215 = PackageOrTypeName
javaRule 216 = PostDecrementExpression
javaRule 217 = PostDecrementExpressionlfpostfixExpression
javaRule 218 = PostIncrementExpression
javaRule 219 = PostIncrementExpressionlfpostfixExpression
javaRule 220 = PostfixExpression
javaRule 221 = PreDecrementExpression
javaRule 222 = PreIncrementExpression
javaRule 223 = PrimaryNoNewArray
javaRule 224 = PrimaryNoNewArraylfarrayAccess
javaRule 225 = PrimaryNoNewArraylfprimary
javaRule 226 = PrimaryNoNewArraylfprimarylfarrayAccesslfprimary
javaRule 227 = PrimaryNoNewArraylfprimarylfnoarrayAccesslfprimary
javaRule 228 = PrimaryNoNewArraylfnoarrayAccess
javaRule 229 = PrimaryNoNewArraylfnoprimary
javaRule 230 = PrimaryNoNewArraylfnoprimarylfarrayAccesslfnoprimary
javaRule 231 = PrimaryNoNewArraylfnoprimarylfnoarrayAccesslfnoprimary
javaRule 232 = ReceiverParameter
javaRule 233 = ReferenceType
javaRule 234 = RelationalExpression
javaRule 235 = RequiresModifier
javaRule 236 = ResourceList
javaRule 237 = Result
javaRule 238 = ReturnStatement
javaRule 239 = ShiftExpression
javaRule 240 = SimpleTypeName
javaRule 241 = SingleElementAnnotation
javaRule 242 = SingleStaticImportDeclaration
javaRule 243 = SingleTypeImportDeclaration
javaRule 244 = StatementExpression
javaRule 245 = StatementExpressionList
javaRule 246 = StatementNoShortIf
javaRule 247 = StatementWithoutTrailingSubstatement
javaRule 248 = StaticImportOnDemandDeclaration
javaRule 249 = StaticInitializer
javaRule 250 = Superclass
javaRule 251 = Superinterfaces
javaRule 252 = SwitchBlock
javaRule 253 = SwitchLabels
javaRule 254 = SwitchStatement
javaRule 255 = SynchronizedStatement
javaRule 256 = ThrowStatement
javaRule 257 = Throws
javaRule 258 = TryStatement
javaRule 259 = TryWithResourcesStatement
javaRule 260 = Type
javaRule 261 = TypeArgumentList
javaRule 262 = TypeImportOnDemandDeclaration
javaRule 263 = TypeName
javaRule 264 = TypeParameterList
javaRule 265 = TypeParameterModifier
javaRule 266 = TypeVariable
javaRule 267 = UnannArrayType
javaRule 268 = UnannClassOrInterfaceType
javaRule 269 = UnannClassType
javaRule 270 = UnannClassTypelfunannClassOrInterfaceType
javaRule 271 = UnannClassTypelfnounannClassOrInterfaceType
javaRule 272 = UnannInterfaceType
javaRule 273 = UnannInterfaceTypelfunannClassOrInterfaceType
javaRule 274 = UnannInterfaceTypelfnounannClassOrInterfaceType
javaRule 275 = UnannPrimitiveType
javaRule 276 = UnannReferenceType
javaRule 277 = UnannType
javaRule 278 = UnannTypeVariable
javaRule 279 = UnaryExpression
javaRule 280 = UnaryExpressionNotPlusMinus
javaRule 281 = VariableAccess
javaRule 282 = VariableDeclaratorList
javaRule 283 = VariableInitializerList
javaRule 284 = WhileStatement
javaRule 285 = WhileStatementNoShortIf
javaRule 286 = Wildcard
javaRule 287 = WildcardBounds
javaRule n   = error("aptell ERROR (1): illegal code " ++ show n)

-- | Returns a Java parse tree read from an aptell file.
parseTree :: String -> IO (Node Rule)
parseTree = fmap head . parseForest javaRule

-- | Returns a pretty-printed tree from the file.
fileToString :: String -> IO String
fileToString f = fmap P.toString (parseTree f)

-- -- | Works like fileToString but allows to pass a maximal depth.
fileToStringD :: Depth -> String -> IO String
fileToStringD maxDepth f = do
  node <- parseTree f
  return $ P.toStringD node (Just maxDepth)

-- | Prints a pretty-printed tree from the file.
printFile :: String -> IO ()
printFile f = fileToString f >>= putStrLn

-- | Works like printFile but allows to pass a maximal depth.
printFileD :: Depth -> String -> IO ()
printFileD maxDepth f =
  fileToStringD maxDepth f >>= putStrLn
