package aptell;

/**
 * @author  kongra
 * @created 2009-09-21
 */
public class Stopwatch {

  public static Stopwatch start() {
    return new Stopwatch();
  }

  public double elapsedMsecs() {
    return (System.nanoTime() - start) / 1000000.0d;
  }

  private final long start;

  private Stopwatch() {
    this.start = System.nanoTime();
  }

}
