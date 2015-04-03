#!/bin/sh

java -Xms128m -Xmx512m \
    -classpath ../lib/antlr-4.5-complete.jar:../lib/aptell.jar \
    kongra.aptell.java.Processor $1 $2 `find "$1" -name "*.java"`
