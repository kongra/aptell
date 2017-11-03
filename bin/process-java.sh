#!/bin/bash

java -Xms128m -Xmx4G \
    -classpath lib/antlr-4.7-complete.jar:lib/aptell.jar \
    aptell.antlr4.JavaProcessor $1 $2

# Running
# bin/process-java.sh srcDir targetDir
