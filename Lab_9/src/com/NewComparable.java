package com;

public class NewComparable implements Comparable<NewComparable> {
  private int key;

  public NewComparable(int key) {
    this.key = key;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  @Override
  public int compareTo(NewComparable newComparable) {
    return this.key - newComparable.key;
  }
}
