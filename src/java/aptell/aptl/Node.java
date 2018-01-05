package aptell.aptl;

/**
 * @author kongra
 * @created 2018-01-05
 */
public interface Node<R extends Enum<R>> {

  @Override
  int hashCode();

  @Override
  boolean equals(Object other);
}
