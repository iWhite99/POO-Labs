package com.oop_pub;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyImmutableArray {
  private final ArrayList<Integer> immutableArray;

  public MyImmutableArray(final ArrayList<Integer> immutableArray) {
    this.immutableArray = new ArrayList<>(immutableArray);
  }

  public ArrayList<Integer> getImmutableArray() {
    return new ArrayList<>(this.immutableArray);
  }
}
