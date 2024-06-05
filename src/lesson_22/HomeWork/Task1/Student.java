package lesson_22.HomeWork.Task1;

import java.util.Objects;

public class Student {
    private String name;
    private int cohort;

    public Student(String name, int cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return cohort == student.cohort && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cohort);
    }

    @Override
    public String toString() {
        return "Student: " + name + " / Cohort: " + cohort;
    }
}
