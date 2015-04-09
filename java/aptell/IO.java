package aptell;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.antlr.v4.runtime.Token;

/**
 * @author kongra
 * @created 2015-04-02
 */
public class IO {

  public IO(DataOutputStream out) {
    this.out = out;
  }

  public IO(OutputStream out) {
    this(new DataOutputStream(out));
  }

  public void writeNonTerminal(int code) {
    try {
      out.writeInt(level);
      out.writeInt(code);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void writeTerminal(int line, int pos, String content) {
    try {
      out.writeInt(level);
      out.writeInt(0); // By convention code 0 means a terminal.
      out.writeInt(line);
      out.writeInt(pos);

      byte[] bytes = content == null ? NOBYTES : content.getBytes(CHARSET);
      out.writeInt(bytes.length);
      out.write(bytes, 0, bytes.length);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void writeTerminal(Token tok) {
    writeTerminal(tok.getLine(), tok.getCharPositionInLine(), tok.getText());
  }

  public void pushLevel() {
    level++;
  }

  public void popLevel() {
    level--;
  }

  public static final String CHARSET = "UTF-8";

  private static final byte[] NOBYTES = {};

  private final DataOutputStream out;

  private int level;
}
