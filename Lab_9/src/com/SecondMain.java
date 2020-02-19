package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class SecondMain {
  public static void main(String[] args) {
    int[][] matrix0 = new int[4][4];
    int[][] matrix1 = new int[4][4];
    Random random = new Random();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix0[i][j] = random.nextInt(5);
        matrix1[i][j] = random.nextInt(5);
      }
    }
    MyMatrix myMatrix0 = new MyMatrix();
    MyMatrix myMatrix1 = new MyMatrix();
    myMatrix0.setElements(matrix0);
    myMatrix1.setElements(matrix1);

    int[] vector0 = new int[3];
    int[] vector1 = new int[3];
    for (int i = 0; i < 3; i++) {
      vector0[i] = random.nextInt(5);
      vector1[i] = random.nextInt(5);
    }
    MyVector3 myVector30 = new MyVector3();
    MyVector3 myVector31 = new MyVector3();
    myVector30.setCoordinates(vector0);
    myVector31.setCoordinates(vector1);

    Collection<Sumabil> collection = new ArrayList<Sumabil>();
    collection.add(myMatrix0);
    collection.add(myMatrix1);
    collection.add(myVector30);
    collection.add(myVector31);

    System.out.println(tryToAdd(collection));
  }

  private static int tryToAdd(Collection<? extends Sumabil> collection) {
    Iterator<? extends Sumabil> iterator= collection.iterator();
    Sumabil first = iterator.next();
    while (iterator.hasNext()) {
      first.addValue(iterator.next());
    }
    return first.getValue();
  }
}
