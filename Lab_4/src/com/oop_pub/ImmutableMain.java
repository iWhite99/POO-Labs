package com.oop_pub;

import java.util.ArrayList;

public class ImmutableMain {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(0);
    arrayList.add(2);
    arrayList.add(0);
    arrayList.add(2);
    arrayList.add(0);
    arrayList.add(2);
    arrayList.add(0);
    arrayList.add(2);
    System.out.println(arrayList);

    MyImmutableArray myImmutableArray = new MyImmutableArray(arrayList);

    System.out.println(myImmutableArray.getImmutableArray());

    myImmutableArray.getImmutableArray().remove(1);

    System.out.println(myImmutableArray.getImmutableArray());

////    ArrayList<Integer> immutableArray = myImmutableArray.getImmutableArray();
//    immutableArray.remove(1);
//    System.out.println(immutableArray);
  }
}
