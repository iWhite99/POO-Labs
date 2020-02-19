package task2;

public class Test {
  public static void main(String[] args) {
    Student[] students = new Student[4];
    for (int i = 0; i < students.length; i++) {
      students[i] = new Student();
//      students[i].year = i;
//      students[i].name = String.valueOf(i) + String.valueOf(i + 1);
      students[i].setYear(i);
      students[i].setName(String.valueOf(i) + String.valueOf(i + 1));
    }
    Course course = new Course();
//    course.title = "POO";
//    course.description = "poo";
//    course.students = students;
    course.setTitle("POO");
    course.setDescription("poo");
    course.setStudents(students);
    int year = Integer.parseInt(args[0]);
    Student[] year_students = course.filterYear(students, year);
    for (Student student : year_students) {
      System.out.println(student.getYear() + " " + student.getName());
    }
    Student student0 = new Student();
    Student student1 = new Student();
//    student0.name = "poo";
//    student1.name = "poo";
//    student0.year = 1;
//    student1.year = 1;
    student0.setName("poo");
    student1.setName("poo");
    student0.setYear(1);
    student1.setYear(1);
    System.out.println(student0.equals(student1));
  }
}
