package second;

import first.Task;

import java.util.ArrayList;

public abstract class DataStructure implements Container {

  private ArrayList<Task> arrayList;

  ArrayList<Task> getArrayList() {
    return arrayList;
  }

  void setArrayList(ArrayList<Task> arrayList) {
    this.arrayList = arrayList;
  }

  public abstract Task pop();

  public void push(Task task) {
    this.arrayList.add(task);
  }

  public int size() {
    return this.arrayList.size();
  }

  public boolean isEmpty() {
    return this.arrayList.size() == 0;
  }

  public void transferFrom(Container container) {
    while (!container.isEmpty()) {
      this.arrayList.add(container.pop());
    }
  }
}
