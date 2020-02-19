package second;

import first.Task;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Stack extends DataStructure {

  public Stack() {
    this.setArrayList(new ArrayList<>());
  }

  public Task pop() {
    if (this.getArrayList().size() == 0) {
      return null;
    }
    Task task = this.getArrayList().get(this.getArrayList().size() - 1);
    this.getArrayList().remove(this.getArrayList().size() - 1);
    return task;
  }
}