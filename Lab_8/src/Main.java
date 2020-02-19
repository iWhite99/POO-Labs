import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> arrayList = new ArrayList<>();
    arrayList.add(new Student(0, "marius", "iftimie", 8));
    arrayList.add(new Student(4, "andrei", "ast", 9));
    arrayList.add(new Student(2, "marius", "capta", 8));
    arrayList.add(new Student(3, "john", "dorian", 10));
    arrayList.add(new Student(1, "mirel", "patol", 8));
    Collections.sort(arrayList);
    for (Student student : arrayList) {
      System.out.println(student.toString());
    }
    System.out.println();
    PriorityQueue<Student> priorityQueue = new PriorityQueue<>(arrayList.size(),
            Comparator.comparingLong(Student::getId));
    priorityQueue.addAll(arrayList);

    while (priorityQueue.peek() != null) {
      Student student = priorityQueue.poll();
      System.out.println(student.toString());
    }

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("mate");
    linkedList.add("fizica");
    linkedList.add("sport");
    HashMap<Student, LinkedList<String>> hashMap = new HashMap<>();
    for (Student student : arrayList) {
      hashMap.put(student, linkedList);
    }
    System.out.println();

    Set<Map.Entry<Student, LinkedList<String>>> set = hashMap.entrySet();
    for (Map.Entry<Student, LinkedList<String>> it: set) {
      System.out.println(it.getKey() + " = " + it.getValue());
    }
    System.out.println();

    LinkedExtended<Integer> linkedExtended = new LinkedExtended<>();
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    arrayList1.add(0);
    arrayList1.add(1);
    arrayList1.add(6);
    arrayList1.add(7);
    linkedExtended.add(5);
    linkedExtended.add(4);
    linkedExtended.add(2);
    linkedExtended.add(3);
    linkedExtended.addAll(arrayList1);
    for (Integer integer : linkedExtended) {
      System.out.println(integer);
    }
  }
}
