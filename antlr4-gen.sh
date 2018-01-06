#!/bin/bash

# Java8
java -jar lib/antlr-4.7.1-complete.jar src/antlr4/Java8Lexer.g4
mv src/antlr4/Java8Lexer.tokens ./
java -jar lib/antlr-4.7.1-complete.jar src/antlr4/Java8Parser.g4
TARGET_DIR=src/java/aptell/antlr4/java8/
rm -rf $TARGET_DIR/Java8*.java
# mkdir -p  $TARGET_DIR
mv src/antlr4/*.java $TARGET_DIR
rm -f ./Java8Lexer.tokens

# Java9
java -jar lib/antlr-4.7.1-complete.jar src/antlr4/Java9.g4
TARGET_DIR=src/java/aptell/antlr4/java9/
rm -rf $TARGET_DIR/Java9*.java
# mkdir -p  $TARGET_DIR
mv src/antlr4/*.java $TARGET_DIR
rm -f src/antlr4/*.tokens
