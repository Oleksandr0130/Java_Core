package lesson_5;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        List<Employee>employees = new ArrayList<>();
        employees.add(new Programmer("Jack", 5000));
        employees.add(new QAEngineer("John", 6000));
        employees.add(new Manager("Alex", 20_000, 5000));

        System.out.println(employees);

        System.out.println("-------------------------");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println("------- " + employees.get(i).getName());
            employees.get(i).salary();
        }
        System.out.println("-------------------------");

        Manager manager1 = new Manager("Robert", 2000, 1000);
        Employee manager2 = new Manager("Robert", 2000, 1000);

        manager1.salary();
        manager2.salary();
    }
}
