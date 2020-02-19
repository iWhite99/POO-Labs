import java.util.*;
import java.lang.*;

public class Student implements Comparable<Student> {
    private long id;
    private String name;
    private String surname;
    private double averageGrade;

    public Student(long id, String name, String surname, double averageGrade) {
        this.id = id; 
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                Double.compare(student.getAverageGrade(), getAverageGrade()) == 0 &&
                getName().equals(student.getName()) &&
                getSurname().equals(student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getAverageGrade());
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.averageGrade == student.averageGrade) {
            if (this.surname.equals(student.surname)) {
                return this.name.compareTo(student.name);
            }
            return this.surname.compareTo(student.surname);
        }
        return Double.compare(this.averageGrade, student.averageGrade);
    }
}