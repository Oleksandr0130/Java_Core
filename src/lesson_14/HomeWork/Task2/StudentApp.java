package lesson_14.HomeWork.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Oleg", Arrays.asList(5, 4, 6, 7, 8, 10, 10, 2, 3, 10)),
                new Student("Aleksandr", Arrays.asList(3, 6, 6, 1, 10, 10, 6, 4, 2, 10)),
                new Student("Katia", Arrays.asList(5, 4, 0, 3, 10, 10, 1, 8, 10, 10)),
                new Student("Andrey", Arrays.asList(5, 10, 6, 7, 8, 10, 3, 5, 6, 9))
        ));
        System.out.println(grades(students));
    }

    public static String grades(List<Student> students) {
        Collections.sort(students, (student1, student2) -> Integer.compare(student1.getMissedGrades(), student2.getMissedGrades()));

        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.getName())
                    .append(" - ")
                    .append(student.getMissedGrades())
                    .append(";");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}

