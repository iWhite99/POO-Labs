package fourth;

import first.Task;
import third.Strategy;

import java.util.Calendar;

public class PrintTimeTaskRunner extends AbstractTaskRunner {
  
  public PrintTimeTaskRunner(Strategy strategy) {
    super(strategy);
  }

  protected void afterExecution(Task task) {
    System.out.println("Time: " + Calendar.HOUR + ":" + Calendar.MINUTE + ":" + Calendar.SECOND);
  }
}
