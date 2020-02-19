package com;

import java.util.Objects;

public class Element {
  private int age;
  private String name;

  Element(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Element)) return false;
    Element element = (Element) o;
    return age == element.age &&
            Objects.equals(name, element.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public String toString() {
    return "Element{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }
}
