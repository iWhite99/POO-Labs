package first;

public class CounterOutTask implements Task {

  private static int counter = 0;

  public CounterOutTask() {

  }

  public void execute() {
    counter++;
    System.out.println(counter);
  }
}
