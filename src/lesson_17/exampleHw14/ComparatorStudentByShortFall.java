package lesson_17.exampleHw14;

import java.util.Comparator;

public class ComparatorStudentByShortFall implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getShortfall() - o2.getShortfall();
    }
}
