package lesson_22.HomeWork.Task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> backendStudents = new ArrayList<>();
        backendStudents.add(new Student("Jack", 1));
        backendStudents.add(new Student("John", 1));
        backendStudents.add(new Student("Ann", 2));
        backendStudents.add(new Student("Alice", 2));
        backendStudents.add(new Student("Natali", 1));
        backendStudents.add(new Student("Karl", 2));
        backendStudents.add(new Student("Oleg", 2));

        List<Student> frontendStudents = new ArrayList<>();
        frontendStudents.add(new Student("Ann", 2));
        frontendStudents.add(new Student("Alice", 2));
        frontendStudents.add(new Student("Karl", 2));
        frontendStudents.add(new Student("Oleg", 2));
        frontendStudents.add(new Student("Ivan", 3));
        frontendStudents.add(new Student("Denis", 4));

        List<Student> qaStudents = new ArrayList<>();
        qaStudents.add(new Student("Alice", 2));
        qaStudents.add(new Student("Karl", 2));
        qaStudents.add(new Student("Oleg", 2));
        qaStudents.add(new Student("Ivan", 3));
        qaStudents.add(new Student("Natali", 1));
        qaStudents.add(new Student("Denis", 4));

        List<Student> allCourseStudents = studentsInAllCourses(backendStudents, frontendStudents, qaStudents);
        for (Student student : allCourseStudents) {
            System.out.println(student);
        }
    }

    public static List<Student> studentsInAllCourses(List<Student> backend, List<Student> frontend, List<Student> qa) {
        Set<Student> backendSet = new HashSet<>(backend);
        Set<Student> frontendSet = new HashSet<>(frontend);
        Set<Student> qaSet = new HashSet<>(qa);

        backendSet.retainAll(frontendSet);
        backendSet.retainAll(qaSet);

        return new ArrayList<>(backendSet);
    }
}
