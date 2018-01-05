package aptell.aptl;

import java.io.DataInputStream;
import java.io.InputStream;

/**
 * @author kongra
 * @created 2018-01-05
 */
public final class IO {

  public IO(DataInputStream in) {
    this.in = in;
  }

  public IO(InputStream in) {
    this(new DataInputStream(in));
  }

  private final DataInputStream in;

}
