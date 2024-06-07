package lesson_23.Task1_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

class AppStudentTest {

    @Test
    void getAllStudents() {
        List<Student> list1 = List.of(
                new Student("Jan", "Jackobson"),
                new Student("Petr", "Peterson"),
                new Student("Mark", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Poul", "Worker")
        );

        List<Student> list2 = List.of(
                new Student("Garry", "Potter"),
                new Student("Petr", "Peterson"),
                new Student("John", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );

        List<Student> list3 = List.of(
                new Student("Maria", "Simpson"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );

        List<Student> expectedList = List.of(
                new Student("Jan", "Jackobson"),
                new Student("Petr", "Peterson"),
                new Student("Mark", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Poul", "Worker"),
                new Student("Garry", "Potter"),
                new Student("John", "Karlson"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );

        List<Student> actualResult = AppStudent.getAllStudents(list1, list2, list3);
        Assertions.assertEquals(expectedList.size(),actualResult.size());
        Assertions.assertEquals(new HashSet<>(expectedList), new HashSet<>(actualResult));
    }

    @Test
    void getAllCoursesStudents() {
        List<Student> backEnd = List.of(
                new Student("Jan", "Jackobson"),
                new Student("Petr", "Peterson"),
                new Student("Mark", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Poul", "Worker")
        );

        List<Student> frontEnd = List.of(
                new Student("Garry", "Potter"),
                new Student("Petr", "Peterson"),
                new Student("John", "Karlson"),
                new Student("Maria", "Simpson"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );

        List<Student> qa = List.of(
                new Student("Sasha", "Garsone"),
                new Student("Maria", "Simpson"),
                new Student("Mike", "Tayson"),
                new Student("Lena", "Smith")
        );
        List<Student> expectedList = List.of(
                new Student("Maria", "Simpson")
        );
        List<Student> actualResult = AppStudent.getAllCoursesStudents(backEnd, frontEnd, qa);
        Assertions.assertEquals(expectedList.size(),actualResult.size());
        Assertions.assertEquals(new HashSet<>(expectedList), new HashSet<>(actualResult));
    }
}