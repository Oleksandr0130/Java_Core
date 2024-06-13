package lesson_28.HomeWork.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
Дан список групп Cohort (String title, List<Persons> students).
У каждого студента задан список контактных email-ов: Student{String name, List<String> emails}
Руководство поставило задачу организовать рассылку email-ов.
Необходимо написать метод, который возвращает список всех емэйлов без повторов.

 */
public class CohortApp {
    public static void main(String[] args) {
        List<Cohort> cohorts = List.of(
                new Cohort("Group 1", Arrays.asList(
                        new Cohort.Student("Jack", Arrays.asList("jack@example.com", "jack@example.com")),
                        new Cohort.Student("Ann", Arrays.asList("ann@example.com", "ann@example.com"))
                )),
                new Cohort("Group 2", Arrays.asList(
                        new Cohort.Student("John", Arrays.asList("john@example.com", "john@example.com")),
                        new Cohort.Student("Lena", Arrays.asList("Lena@example.com", "jack@example.com"))
                )));
        System.out.println(cohorts);
        System.out.println(getUniqueEmails(cohorts));
    }

    public static List<String> getUniqueEmails(List<Cohort> cohorts) {
        return cohorts.stream()
                .flatMap(cohort -> cohort.getStudents().stream())
                .flatMap(student -> student.geteMails().stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
