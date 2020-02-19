package com;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

class MyHashMap {
  private static class Entry<K, V> {
    K key;
    V value;

    Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  private List<List<Entry<Object, Object>>> entries = new ArrayList<>(10);

  MyHashMap() {
    for (int i = 0; i < 10; i++) {
      this.entries.add(new ArrayList<>());
    }
  }

  void put(Object key, Object value) {
    int k = abs(key.hashCode() % 10);
    boolean found = false;
    List<Entry<Object, Object>> arrayList = this.entries.get(k);
    for (Entry<Object, Object> entry : arrayList) {
      if (entry.key.equals(key)) {
        found = true;
        entry.value = value;
      }
    }
    if (!found){
      arrayList.add(new Entry<>(key, value));
    }
  }

  Object get(Object key) {
    int k = abs(key.hashCode() % 10);
    List<Entry<Object, Object>> arrayList = this.entries.get(k);
    for (Entry<Object, Object> entry : arrayList) {
      if (entry.key.equals(key)) {
        return entry.value;
      }
    }
    return null;
  }
}
