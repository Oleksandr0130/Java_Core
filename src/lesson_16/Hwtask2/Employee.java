package lesson_16.Hwtask2;

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

    public Employee(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return  name + " -> (" + year + ")";
    }
}
