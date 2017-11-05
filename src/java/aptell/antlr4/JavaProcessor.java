package aptell.antlr4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

import aptell.antlr4.java8.Java8Lexer;
import aptell.antlr4.java8.Java8Parser;
import aptell.antlr4.java8.Processor8Listener;
import aptell.antlr4.java9.Java9Lexer;
import aptell.antlr4.java9.Java9Parser;
import aptell.antlr4.java9.Processor9Listener;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import aptell.Stopwatch;

/**
 * @author kongra
 * @created 2015-04-02
 */
public class JavaProcessor {

  private static boolean process(String file, int i, int n, String srcDir,
                                 String targetDir) {
    System.out.print("Processing " + i + "/" + n + " " + file + " ... ");
    Stopwatch timer = Stopwatch.start();

    if (!tryProcessJava8(file, srcDir, targetDir)) {
      System.out.println("Using Java 9 parser ...");
      tryProcessJava9(file, srcDir, targetDir);
    }

    System.out.println("done in " + timer.elapsedMsecs() + " msecs.");
    return true;
  }

  private static boolean tryProcessJava8(String file, String srcDir, String targetDir) {
    try (InputStream in = new FileInputStream(new File(file))) {
      Java8Lexer lexer = new Java8Lexer(CharStreams.fromStream(in));
      CommonTokenStream tokStream = new CommonTokenStream(lexer);
      Java8Parser parser = new Java8Parser(tokStream);
      parser.removeErrorListeners();
      parser.setErrorHandler(new BailErrorStrategy());

      Java8Parser.CompilationUnitContext tree = parser.compilationUnit();
      ParseTreeWalker walker = new ParseTreeWalker();

      File aptellFile =
          new File(targetDir + file.substring(srcDir.length()) + ".aptl");
      if (aptellFile.exists()) {
        throw new RuntimeException("File already exists " + aptellFile);
      }
      aptellFile.getParentFile().mkdirs();
      aptellFile.createNewFile();

      try (FileOutputStream out = new FileOutputStream(aptellFile)) {
        walker.walk(new Processor8Listener(new IO(out)), tree);
      }
      return true;
    }
    catch (Throwable e) {
      System.err.println(e.getMessage());
      return false;
    }
  }

  private static boolean tryProcessJava9(String file, String srcDir, String targetDir) {
    try (InputStream in = new FileInputStream(new File(file))) {
      Java9Lexer lexer = new Java9Lexer(CharStreams.fromStream(in));
      CommonTokenStream tokStream = new CommonTokenStream(lexer);
      Java9Parser parser = new Java9Parser(tokStream);
      parser.removeErrorListeners();
      parser.setErrorHandler(new BailErrorStrategy());

      Java9Parser.CompilationUnitContext tree = parser.compilationUnit();
      ParseTreeWalker walker = new ParseTreeWalker();

      File aptellFile =
          new File(targetDir + file.substring(srcDir.length()) + ".aptl");
      if (aptellFile.exists()) {
        throw new RuntimeException("File already exists " + aptellFile);
      }
      aptellFile.getParentFile().mkdirs();
      aptellFile.createNewFile();

      try (FileOutputStream out = new FileOutputStream(aptellFile)) {
        walker.walk(new Processor9Listener(new IO(out)), tree);
      }
      return true;
    }
    catch (Throwable e) {
      System.err.println(e.getMessage());
      return false;
    }
  }

  public static void main(String... args) {
    String srcDir    = args[0];
    String targetDir = args[1];

    try {
      final AtomicInteger count = new AtomicInteger(0);
      Files.walk(Paths.get(srcDir)).filter(Files::isRegularFile).forEach((Path p) -> {
        if (p.toFile().getName().endsWith(".java")) count.incrementAndGet();
      });

      final AtomicInteger i = new AtomicInteger(0);
      Files.walk(Paths.get(srcDir)).filter(Files::isRegularFile).forEach((Path p) -> {
        if (p.toFile().getName().endsWith(".java")) {
          process(p.toString(), i.incrementAndGet(), count.get(), srcDir, targetDir);
        }
      });

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
