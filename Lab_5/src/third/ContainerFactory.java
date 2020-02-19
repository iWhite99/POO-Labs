package third;

import second.Container;
import second.Queue;
import second.Stack;

public class ContainerFactory implements IFactory {

  public static final ContainerFactory INSTANCE = new ContainerFactory();

  private ContainerFactory() {
  }

  public Container createContainer(Strategy strategy) {
    Container container;
    if (strategy.equals(Strategy.LIFO)) {
      container = new Stack();
    } else {
      container = new Queue();
    }
    return container;
  }
}