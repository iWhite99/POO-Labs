package first;

import java.util.Random;

public class RandomOutTask implements Task {

  private int number;

  public RandomOutTask() {
    Random random = new Random();
    this.number = random.nextInt(20);
  }

  public void execute() {
    System.out.println("Random: " + this.number);
  }
}
