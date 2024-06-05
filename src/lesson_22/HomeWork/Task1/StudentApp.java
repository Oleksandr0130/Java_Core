package lesson_22.HomeWork.Task1;

import java.util.*;

/*
Предположим, вы пишете программу учета студентов компьютерных курсов.
У вас есть списки студентов нескольких групп (т.е. несколько List<Student>).
Некоторые студенты посещают занятия в нескольких группах.
Ваша задача получить список (List) всех студентов школы.
 */

public class StudentApp {
    public static void main(String[] args) {
        List<Student> cohort1 = new ArrayList<>();
        cohort1.add(new Student("Jack", 1));
        cohort1.add(new Student("John", 1));
        cohort1.add(new Student("Ann", 2));
        cohort1.add(new Student("Alice", 2));
        cohort1.add(new Student("Natali", 1));
        cohort1.add(new Student("Karl", 2));
        cohort1.add(new Student("Oleg", 2));

        List<Student> cohort2 = new ArrayList<>();
        cohort2.add(new Student("Ann", 2));
        cohort2.add(new Student("Alice", 2));
        cohort2.add(new Student("Karl", 2));
        cohort2.add(new Student("Oleg", 2));
        cohort2.add(new Student("Ivan", 3));
        cohort2.add(new Student("Denis", 4));


        Set<Student> listWithAllStudents = new HashSet<>();
        listWithAllStudents.addAll(cohort1);
        listWithAllStudents.addAll(cohort2);
        allStudentsInList(listWithAllStudents);

    }
    public static void allStudentsInList(Set<Student> listWithAllStudents){
        List<Student> allStudents = new ArrayList<>(listWithAllStudents);
        for (Student student : allStudents){
            System.out.println(student);
        }

    }
}
