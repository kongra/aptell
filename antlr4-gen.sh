#!/bin/bash

# Java8
java -jar lib/antlr-4.7-complete.jar src/antlr4/Java9.g4
TARGET_DIR=src/java/aptell/antlr4/java9/
rm    -rf $TARGET_DIR/*.java
mkdir -p  $TARGET_DIR
mv src/antlr4/*.java $TARGET_DIR
rm -f src/antlr4/*.tokens
