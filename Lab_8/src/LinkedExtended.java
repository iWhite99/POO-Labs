import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedExtended<I extends Integer> extends TreeSet<Integer> {
  @Override
  public boolean add(Integer integer) {
    if (integer % 2 == 0) {
      return super.add(integer);
    }
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Integer> c) {
    return super.addAll(c);
  }
}
