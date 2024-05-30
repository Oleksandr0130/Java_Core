package lesson_17.exampleHw14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 6, 9, 10, 2, 4, 8, 7));
        students.add(new Student("Jack", 3, 6, 3, 1, 10, 10, 7));
        students.add(new Student("Kate", 6, 5, 1, 1, 8, 8, 3));
        students.add(new Student("Ivan", 10, 10, 10, 4, 10, 3, 3));
        students.add(new Student("Mark", 6, 9, 10, 2, 4, 8, 7, 10, 9, 10));
        students.add(new Student("Olga", 6, 9, 10, 2, 4, 8, 7, 10, 10, 10));

//        System.out.println(students);
//        Collections.sort(students, new ComparatorStudentByShortFall());
//        System.out.println(listToString(students));
        System.out.println(studentToString(students));


//        Student student = new Student("John");
//        student.addGrade(8);
//        student.addGrade(10);
//        student.addGrade(1);
//        student.addGrade(0, 4, 5, 7, 9, 10, 5, 5);
//        List<Integer> grades = student.getGrades();
//        grades.add(100);
//
//        System.out.println(student);
//        student.getSumOfGrades();
    }
    
    public static String studentToString(List<Student> studentList){
        List<Student> sortedList = createSortedCopy(studentList,new ComparatorStudentByShortFall());
        return listToString(sortedList);
    }

    private static List<Student> createSortedCopy(List<Student> list, Comparator<Student> comparator) {
        ArrayList<Student> result = new ArrayList<>(list);
        Collections.sort(result, comparator);
        return result;
    }

    public static String listToString(List<Student> studentList){
        StringBuilder sb = new StringBuilder();
        for (Student student : studentList){
            sb.append(student.getName()).append(" - ").append(student.getShortfall()).append(";");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
