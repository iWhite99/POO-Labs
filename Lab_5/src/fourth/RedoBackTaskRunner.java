package fourth;

import first.Task;
import second.Container;
import second.Stack;
import third.ContainerFactory;
import third.Strategy;

public class RedoBackTaskRunner extends AbstractTaskRunner {

  private Container reversed;

  public RedoBackTaskRunner(Strategy strategy) {
    super(strategy);
    if (strategy.equals(Strategy.FIFO)) {
      this.reversed = ContainerFactory.INSTANCE.createContainer(Strategy.LIFO);
    } else {
      this.reversed = ContainerFactory.INSTANCE.createContainer(Strategy.FIFO);
    }
  }

  protected void afterExecution(Task task) {
    this.reversed.push(task);
  }

  public void redo() {
    while (!reversed.isEmpty()) {
      this.addTask(reversed.pop());
    }
    this.executeAll();
  }
}
