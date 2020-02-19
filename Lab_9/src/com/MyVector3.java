package com;

public class MyVector3 implements Sumabil {
  private int[] coordinates = new int[3];
  private int value = 0;

  @Override
  public void addValue(Sumabil value) {
    this.value += value.getValue();
  }

  @Override
  public int getValue() {
    return this.value;
  }

  public int[] getCoordinates() {
    return coordinates;
  }

  void setCoordinates(int[] coordinates) {
    this.coordinates = coordinates;
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += coordinates[i];
    }
    this.value = sum;
  }
}
