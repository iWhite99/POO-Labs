package second;

import first.Task;

import java.util.ArrayList;

public class Queue extends DataStructure {

  public Queue() {
    this.setArrayList(new ArrayList<>());
  }

  public Task pop() {
    if (this.getArrayList().size() == 0) {
      return null;
    }
    Task task = this.getArrayList().get(0);
    this.getArrayList().remove(0);
    return task;
  }
}