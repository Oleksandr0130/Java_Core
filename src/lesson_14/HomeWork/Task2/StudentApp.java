package lesson_14.HomeWork.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Oleg", Arrays.asList(5,4,6,7,8,25,16)),
                new Student("Aleksandr", Arrays.asList(3,6,6,1,10,40,26)),
                new Student("Oleg", Arrays.asList(5,4,0,3,18,15,36)),
                new Student("Oleg", Arrays.asList(5,40,6,7,8,25))
        ));
        System.out.println(students.toString());
    }
}
