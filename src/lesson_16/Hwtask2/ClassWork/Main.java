package lesson_16.Hwtask2.ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 2020, 8));
        list.add(new Employee("Anna", 2016, 7));
        list.add(new Employee("Jack", 1999, 10));
        list.add(new Employee("Mark", 1995, 14));
        list.add(new Employee("Mark", 1997, 12));
        list.add(new Employee("Oleg", 2000, 10));
        list.add(new Employee("Valerii", 2005, 9));

        List<Employee> resultselectEmployeeForBonus = selectEmployeeForBonus(list, 3);
        List<Employee> resultselectEmployeeForBonusByYear = selectEmployeeForBonusByYear(list);
        System.out.println("-------------------------------------------------------------------------------\n");
        System.out.println(resultselectEmployeeForBonus);
        System.out.println("-------------------------------------------------------------------------------\n");
        System.out.println(resultselectEmployeeForBonusByYear);
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

    public static List<Employee> selectEmployeeForBonusByYear(List<Employee> employeeList){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList){
            if (employee.getYearOfWork() >= 9){
                result.add(employee);
            }
        }
        return result;
    };
}
