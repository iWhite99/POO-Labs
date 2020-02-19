package com;

public class MyMatrix implements Sumabil {
  private int[][] elements = new int[4][4];
  private int value = 0;

  @Override
  public void addValue(Sumabil value) {
    this.value += value.getValue();
  }

  @Override
  public int getValue() {
    return this.value;
  }

  public int[][] getElements() {
    return elements;
  }

  void setElements(int[][] elements) {
    this.elements = elements;
    int sum = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        sum += elements[i][j];
      }
    }
    this.value = sum;
  }
}
