package com;

public class Main {
  public static void main(String[] args) {
    MyHashMap newMap = new MyHashMap();
    Element element0 = new Element(20, "marius");
    Element element1 = new Element(14, "constantin");
    Element element2 = new Element(16, "neagu");
    Element element3 = new Element(11, "gigel");
    Element element4 = new Element(24, "andrei");

    newMap.put(0, element0);
    newMap.put(1, element1);
    newMap.put(2, element2);
    newMap.put(3, element3);
    newMap.put(4, element4);

    newMap.put(element0, 0);
    newMap.put(element1, 1);
    newMap.put(element2, 2);
    newMap.put(element3, 3);
    newMap.put(element4, 4);

    System.out.println(newMap.get(0).toString());
    System.out.println(newMap.get(1).toString());
    System.out.println(newMap.get(2).toString());
    System.out.println(newMap.get(3).toString());
    System.out.println(newMap.get(4).toString());

    System.out.println(newMap.get(element0).toString());
    System.out.println(newMap.get(element1).toString());
    System.out.println(newMap.get(element2).toString());
    System.out.println(newMap.get(element3).toString());
    System.out.println(newMap.get(element4).toString());
  }
}
