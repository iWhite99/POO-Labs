package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public abstract class LoggerBase {
  private EnumSet<LogLevel> enumSet;
  private LoggerBase next = null;

  void setNext(LoggerBase loggerBase) {
    this.next = loggerBase;
  }

  protected abstract void writeMessage(String message);

  void message(String message, LogLevel severity) {
    LoggerBase current = this;
    while (current != null) {
      if (current.enumSet.contains(severity)) {
        current.writeMessage(message);
      }
      current = current.next;
    }
  }

  void setEnumSet(EnumSet<LogLevel> enumSet) {
    this.enumSet = enumSet;
  }
}
