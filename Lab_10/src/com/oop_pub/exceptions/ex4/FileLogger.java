package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public class FileLogger extends LoggerBase {
  FileLogger() {
    this.setEnumSet(EnumSet.of(LogLevel.Warning, LogLevel.Error));
  }

  @Override
  protected void writeMessage(String message) {
    System.out.println("[File] " + message);
  }
}
