package lesson_16.Hwtask2.ClassWork;

import java.util.Comparator;

public class ComparatorEmployeeByYearOfWork implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getYearOfWork(), o2.getYearOfWork());
    }
}
