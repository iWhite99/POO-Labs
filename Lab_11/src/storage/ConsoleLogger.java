package storage;

import java.util.Observable;

public class ConsoleLogger implements java.util.Observer {
  @Override
  public void update(Observable observable, Object o) {
    System.out.println(o.toString());
  }
}
