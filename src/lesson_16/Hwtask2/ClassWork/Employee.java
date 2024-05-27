package lesson_16.Hwtask2.ClassWork;

import java.util.Objects;

/*
Дан List<Employee>.
У каждого Employee задано имя и год, с которого сотрудник работает в фирме.
Руководство решило премировать N сотрудников, которые работают дольше всех.
Напишите метод, который вернет новый List<Employee> премируемых сотрудников.
Реализовать тесты.

 */
public class Employee {
    private String name;
    private int year;
    private int yearOfWork;

    public Employee(String name, int year, int yearOfWork) {
        this.name = name;
        this.year = year;
        this.yearOfWork = yearOfWork;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getYearOfWork() {
        return yearOfWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return year == employee.year && yearOfWork == employee.yearOfWork && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, yearOfWork);
    }

    @Override
    public String toString() {
        return  name + " (" + year + ") " + yearOfWork;
    }
}
