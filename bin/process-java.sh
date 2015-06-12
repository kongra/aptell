#!/bin/sh

java -Xms128m -Xmx512m \
    -classpath ../lib/antlr-4.5-complete.jar:../lib/aptell.jar \
    aptell.java.Processor $1 $2 `find "$1" -name "*.java"`

# Running
# ./process-java.sh srcDir targetDir
