package fourth;

import first.Task;
import third.Strategy;

public class CounterTaskRunner extends AbstractTaskRunner {

  private int local_counter;

  public CounterTaskRunner(Strategy strategy) {
    super(strategy);
    local_counter = 0;
  }

  public void afterExecution(Task task) {
    local_counter++;
  }

  public int getCounter() {
    return local_counter;
  }
}
