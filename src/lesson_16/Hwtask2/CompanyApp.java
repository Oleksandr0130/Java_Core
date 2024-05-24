package lesson_16.Hwtask2;

import java.util.Arrays;
import java.util.List;

public class CompanyApp {
    public static void main(String[] args) {
    List<Employee> employeeList = Arrays.asList(
            new Employee("John", 2020),
            new Employee("Anna", 2016),
            new Employee("Jack", 1999),
            new Employee("Mark", 1995),
            new Employee("Oleg", 2000),
            new Employee("Valerii", 2005)
    );
        for (Employee employee : employeeList){
            System.out.println(employee);
        }

    }
}
