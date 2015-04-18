{-# LANGUAGE Trustworthy #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Java
-- Copyright   : (c) 2015 Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2015-04-10
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Java
    (
      -- * Core
      Rule (..)
    , parseTree

      -- * Presentation, printing.
    , toString
    , toStringD
    , fileToString
    , fileToStringD
    , printFile
    , printFileD
    )
    where

import           Aptell.Data
import qualified Aptell.Print as P
import           Control.Monad (liftM)

-- | Represents ANTLR rules (non-terminals) for Java.g4 grammar.
data Rule =
  CompilationUnit
  | PackageDeclaration
  | ImportDeclaration
  | TypeDeclaration
  | Modifier
  | ClassOrInterfaceModifier
  | VariableModifier
  | ClassDeclaration
  | TypeParameters
  | TypeParameter
  | TypeBound
  | EnumDeclaration
  | EnumConstants
  | EnumConstant
  | EnumBodyDeclarations
  | InterfaceDeclaration
  | TypeList
  | ClassBody
  | InterfaceBody
  | ClassBodyDeclaration
  | MemberDeclaration
  | MethodDeclaration
  | GenericMethodDeclaration
  | ConstructorDeclaration
  | GenericConstructorDeclaration
  | FieldDeclaration
  | InterfaceBodyDeclaration
  | InterfaceMemberDeclaration
  | ConstDeclaration
  | ConstantDeclarator
  | InterfaceMethodDeclaration
  | GenericInterfaceMethodDeclaration
  | VariableDeclarators
  | VariableDeclarator
  | VariableDeclaratorId
  | VariableInitializer
  | ArrayInitializer
  | EnumConstantName
  | Type
  | ClassOrInterfaceType
  | PrimitiveType
  | TypeArguments
  | TypeArgument
  | QualifiedNameList
  | FormalParameters
  | FormalParameterList
  | FormalParameter
  | LastFormalParameter
  | MethodBody
  | ConstructorBody
  | QualifiedName
  | Literal
  | Annotation
  | AnnotationName
  | ElementValuePairs
  | ElementValuePair
  | ElementValue
  | ElementValueArrayInitializer
  | AnnotationTypeDeclaration
  | AnnotationTypeBody
  | AnotationTypeElementDeclaration
  | AnnotationTypeElementRest
  | AnnotationMethodOrConstantRest
  | AnnotationMethodRest
  | AnnotationConstantRest
  | DefaultValue
  | Block
  | BlockStatement
  | LocalVariableDeclarationStatement
  | LocalVariableDeclaration
  | Statement
  | CatchClause
  | CatchType
  | FinallyBlock
  | ResourceSpecification
  | Resources
  | ClassCreatorRest
  | ExplicitGenericInvocation
  | NonWildcardTypeArguments
  | TypeArgumentsOrDiamond
  | NonWildcardTypeArgumentsOrDiamond
  | SuperSuffix
  | ExplicitGenericInvocationSuffix
  | Arguments
  | Resource
  | AnnotationElementDeclaration
  | SwitchBlockStatementGroup
  | SwitchLabel
  | ForControl
  | ForInit
  | EnhancedForControl
  | ForUpdate
  | ParExpression
  | ExpressionList
  | StatementExpression
  | ConstantExpression
  | Expression
  | Primary
  | Creator
  | CreatedName
  | InnerCreator
  | ArrayCreatorRest deriving Show

javaRule :: Code2Rule Rule
javaRule 1   = CompilationUnit
javaRule 2   = PackageDeclaration
javaRule 3   = ImportDeclaration
javaRule 4   = TypeDeclaration
javaRule 5   = Modifier
javaRule 6   = ClassOrInterfaceModifier
javaRule 7   = VariableModifier
javaRule 8   = ClassDeclaration
javaRule 9   = TypeParameters
javaRule 10  = TypeParameter
javaRule 11  = TypeBound
javaRule 12  = EnumDeclaration
javaRule 13  = EnumConstants
javaRule 14  = EnumConstant
javaRule 15  = EnumBodyDeclarations
javaRule 16  = InterfaceDeclaration
javaRule 17  = TypeList
javaRule 18  = ClassBody
javaRule 19  = InterfaceBody
javaRule 20  = ClassBodyDeclaration
javaRule 21  = MemberDeclaration
javaRule 22  = MethodDeclaration
javaRule 23  = GenericMethodDeclaration
javaRule 24  = ConstructorDeclaration
javaRule 25  = GenericConstructorDeclaration
javaRule 26  = FieldDeclaration
javaRule 27  = InterfaceBodyDeclaration
javaRule 28  = InterfaceMemberDeclaration
javaRule 29  = ConstDeclaration
javaRule 30  = ConstantDeclarator
javaRule 31  = InterfaceMethodDeclaration
javaRule 32  = GenericInterfaceMethodDeclaration
javaRule 33  = VariableDeclarators
javaRule 34  = VariableDeclarator
javaRule 35  = VariableDeclaratorId
javaRule 36  = VariableInitializer
javaRule 37  = ArrayInitializer
javaRule 38  = EnumConstantName
javaRule 39  = Type
javaRule 40  = ClassOrInterfaceType
javaRule 41  = PrimitiveType
javaRule 42  = TypeArguments
javaRule 43  = TypeArgument
javaRule 44  = QualifiedNameList
javaRule 45  = FormalParameters
javaRule 46  = FormalParameterList
javaRule 47  = FormalParameter
javaRule 48  = LastFormalParameter
javaRule 49  = MethodBody
javaRule 50  = ConstructorBody
javaRule 51  = QualifiedName
javaRule 52  = Literal
javaRule 53  = Annotation
javaRule 54  = AnnotationName
javaRule 55  = ElementValuePairs
javaRule 56  = ElementValuePair
javaRule 57  = ElementValue
javaRule 58  = ElementValueArrayInitializer
javaRule 59  = AnnotationTypeDeclaration
javaRule 60  = AnnotationTypeBody
javaRule 61  = AnotationTypeElementDeclaration
javaRule 62  = AnnotationTypeElementRest
javaRule 63  = AnnotationMethodOrConstantRest
javaRule 64  = AnnotationMethodRest
javaRule 65  = AnnotationConstantRest
javaRule 66  = DefaultValue
javaRule 67  = Block
javaRule 68  = BlockStatement
javaRule 69  = LocalVariableDeclarationStatement
javaRule 70  = LocalVariableDeclaration
javaRule 71  = Statement
javaRule 72  = CatchClause
javaRule 73  = CatchType
javaRule 74  = FinallyBlock
javaRule 75  = ResourceSpecification
javaRule 76  = Resources
javaRule 77  = ClassCreatorRest
javaRule 78  = ExplicitGenericInvocation
javaRule 79  = NonWildcardTypeArguments
javaRule 80  = TypeArgumentsOrDiamond
javaRule 81  = NonWildcardTypeArgumentsOrDiamond
javaRule 82  = SuperSuffix
javaRule 83  = ExplicitGenericInvocationSuffix
javaRule 84  = Arguments
javaRule 85  = Resource
javaRule 86  = AnnotationElementDeclaration
javaRule 87  = SwitchBlockStatementGroup
javaRule 88  = SwitchLabel
javaRule 89  = ForControl
javaRule 90  = ForInit
javaRule 91  = EnhancedForControl
javaRule 92  = ForUpdate
javaRule 93  = ParExpression
javaRule 94  = ExpressionList
javaRule 95  = StatementExpression
javaRule 96  = ConstantExpression
javaRule 97  = Expression
javaRule 98  = Primary
javaRule 99  = Creator
javaRule 100 = CreatedName
javaRule 101 = InnerCreator
javaRule 102 = ArrayCreatorRest
javaRule c   = error ("aptell PANIC (1): ILLEGAL CODE " ++ show c)

-- | Returns a Java parse tree read from an aptell file.
parseTree :: String -> IO (Node Rule)
parseTree = liftM head . parseForest javaRule

-- | Returns a pretty-printed tree represented by the root node.
toString :: Bool -> Node Rule -> String
toString = P.toString shows

-- | Works like toString but allows to pass a maximal depth.
toStringD :: Int -> Bool -> Node Rule -> String
toStringD = P.toStringD shows

-- | Returns a pretty-printed tree from the file.
fileToString :: Bool -> String -> IO String
fileToString printLocations = liftM (toString printLocations) . parseTree

-- | Works like fileToString but allows to pass a maximal depth.
fileToStringD :: Int -> Bool -> String -> IO String
fileToStringD depth printLocations =
  liftM (toStringD depth printLocations) . parseTree

-- | Prints a pretty-printed tree from the file.
printFile :: Bool -> String -> IO ()
printFile printLocations file = fileToString printLocations file >>= putStrLn

-- | Works like printFile but allows to pass a maximal depth.
printFileD :: Int -> Bool -> String -> IO ()
printFileD depth printLocations file =
  fileToStringD depth printLocations file >>= putStrLn
