package lesson_16.Hwtask2.ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Employee> selectEmployeeForBonus(List<Employee> list, int N){
        List<Employee> result = new ArrayList<>();
        List<Employee> sortedList = sort(list,new ComparatorEmployeeByYear());
        for (int i = 0; i < Math.min(N,sortedList.size()); i++) {
            result.add(sortedList.get(i));
        }
        return result;
    }
    public static List<Employee> sort(List<Employee> list, Comparator<Employee> comparator){
        ArrayList<Employee> sortedEmployees = new ArrayList<>(list);
        Collections.sort(sortedEmployees,comparator);
        return sortedEmployees;
    }
}
