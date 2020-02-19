package first;

public class OutTask implements Task {

  private String string;

  public OutTask(String string) {
    this.string = string;
  }

  public void execute() {
    System.out.println("Out: " + this.string);
  }
}
