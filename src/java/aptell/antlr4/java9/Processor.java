package aptell.antlr4.java9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import aptell.antlr4.IO;
import aptell.Stopwatch;
import aptell.antlr4.java9.Java9Parser.CompilationUnitContext;

/**
 * @author kongra
 * @created 2015-04-02
 */
public class Processor {

  private static void process(String file, int i, int n, String srcDir,
      String targetDir) {
    System.out.print("Processing " + i + "/" + n + " " + file + " ... ");
    Stopwatch timer = Stopwatch.start();

    try (InputStream in = new FileInputStream(new File(file))) {
      Java9Lexer lexer = new Java9Lexer(CharStreams.fromStream(in));
      CommonTokenStream tokStream = new CommonTokenStream(lexer);
      Java9Parser parser = new Java9Parser(tokStream);

      CompilationUnitContext tree = parser.compilationUnit();
      ParseTreeWalker walker = new ParseTreeWalker();

      File aptellFile =
          new File(targetDir + file.substring(srcDir.length()) + ".aptl");
      if (aptellFile.exists()) {
        throw new RuntimeException("File already exists " + aptellFile);
      }
      aptellFile.getParentFile().mkdirs();
      aptellFile.createNewFile();

      try (FileOutputStream out = new FileOutputStream(aptellFile)) {
        walker.walk(new ProcessorListener(new IO(out)), tree);
      }
      System.out.println("done in " + timer.elapsedMsecs() + " msecs.");
    }
    catch (IOException e) {
      throw new RuntimeException(e);
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

//    for (int i = 2; i < args.length; i++) {
//      process(args[i], i, args.length, srcDir, targetDir);
//    }
  }
}
