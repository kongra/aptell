package aptell.aptl;

import java.util.Objects;

/**
 * @author kongra
 * @created 2018-01-05
 */
public class Term<R extends Enum<R>> implements Node<R> {

  public Term(long line, long pos, String text) {
    Objects.requireNonNull(text);
    this.line = line;
    this.pos = pos;
    this.text = text;
  }

  public final long line() {
    return this.line;
  }

  public final long pos() {
    return this.pos;
  }

  public final String text() {
    return this.text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Term)) return false;

    Term<?> term = (Term<?>) o;

    if (line != term.line) return false;
    if (pos  != term.pos ) return false;
    return text.equals(term.text);
  }

  @Override
  public int hashCode() {
    int result = (int) (line ^ (line >>> 32));
    result = 31 * result + (int) (pos ^ (pos >>> 32));
    result = 31 * result + text.hashCode();
    return result;
  }

  private final long line;

  private final long pos;

  private final String text;
}
