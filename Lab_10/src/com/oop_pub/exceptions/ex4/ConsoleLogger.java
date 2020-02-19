package com.oop_pub.exceptions.ex4;

public class ConsoleLogger extends LoggerBase {
  ConsoleLogger() {
    this.setEnumSet(LogLevel.all());
  }

  @Override
  protected void writeMessage(String message) {
    System.out.println("[Console] " + message);
  }
}
