package kongra.aptell.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import kongra.aptell.Stopwatch;
import kongra.aptell.java.JavaParser.CompilationUnitContext;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author kongra
 * @created 2015-04-02
 */
public class Processor {

  public static void process(String file, String srcDir, String targetDir) {
    System.out.print("Processing " + file + " ... ");
    Stopwatch timer = Stopwatch.start();

    try (InputStream in = new FileInputStream(new File(file))) {
      JavaLexer lexer = new JavaLexer(new ANTLRInputStream(in));
      CommonTokenStream tokStream = new CommonTokenStream(lexer);
      JavaParser parser = new JavaParser(tokStream);
      CompilationUnitContext tree = parser.compilationUnit();
      ParseTreeWalker walker = new ParseTreeWalker();

      // TODO: instrument to make an .apt (parse-tree) file.

      JavaBaseListener listener = new JavaBaseListener();
      walker.walk(listener, tree);
      System.out.println("done in " + timer.elapsedMsecs() + " msecs.");
    }
    catch (IOException e) {
      System.out.println("error " + e + ".");
    }
  }

  public static void main(String... args) {
    String srcDir = args[0];
    String targetDir = args[1];
    for(int i = 2; i < args.length; i++) {
      process(args[i], srcDir, targetDir);
    }
  }
}
