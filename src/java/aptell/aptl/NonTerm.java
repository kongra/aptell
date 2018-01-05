package aptell.aptl;

import java.util.List;
import java.util.Objects;

/**
 * @author kongra
 * @created 2018-01-05
 */
public class NonTerm<R extends Enum<R>> implements Node<R> {

  public NonTerm(R rule, List<Node<R>> children) {
    Objects.requireNonNull(rule);
    Objects.requireNonNull(children);
    this.rule = rule;
    this.children = children;
  }

  public final R rule() {
    return this.rule;
  }

  public final List<Node<R>> children() {
    return this.children;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof NonTerm)) return false;

    NonTerm<?> nonTerm = (NonTerm<?>) o;

    if (!rule.equals(nonTerm.rule)) return false;
    return children.equals(nonTerm.children);
  }

  @Override
  public int hashCode() {
    int result = rule.hashCode();
    result = 31 * result + children.hashCode();
    return result;
  }

  private final R rule;

  private final List<Node<R>> children;

}
