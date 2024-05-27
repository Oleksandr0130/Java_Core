package lesson_16.Hwtask2.ClassWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void selectEmployeeForBonus() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 2020));
        list.add(new Employee("Anna", 2016));
        list.add(new Employee("Jack", 1999));
        list.add(new Employee("Mark", 1995));
        list.add(new Employee("Mark", 1997));
        list.add(new Employee("Oleg", 2000));
        list.add(new Employee("Valerii", 2005));

        List<Employee> expectedList = new ArrayList<>();
        expectedList.add(new Employee("Mark", 1995));
        expectedList.add(new Employee("Mark", 1997));
        expectedList.add(new Employee("Jack", 1999));

        List<Employee> result = Main.selectEmployeeForBonus(list, 3);
        Assertions.assertEquals(expectedList, result);
    }
    @Test
    void selectEmployeeForBonusBy() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 2020, 8));
        list.add(new Employee("Anna", 2016, 7));
        list.add(new Employee("Jack", 1999, 10));
        list.add(new Employee("Mark", 1995, 14));
        list.add(new Employee("Mark", 1997, 12));
        list.add(new Employee("Oleg", 2000, 10));
        list.add(new Employee("Valerii", 2005, 9));

        List<Employee> expectedList = new ArrayList<>();
        expectedList.add(new Employee("Valerii", 2005, 9));
        expectedList.add(new Employee("Oleg", 2000, 10));
        expectedList.add(new Employee("Jack", 1999, 10));
        expectedList.add(new Employee("Mark", 1997, 12));
        expectedList.add(new Employee("Mark", 1995, 14));

        List<Employee> result1 = Main.selectEmployeeForBonusByYear(list);
        assertEquals(5, result1.size());
        for (Employee employee : result1) {
            assertTrue(employee.getYearOfWork() >= 9);
        }
    }
}