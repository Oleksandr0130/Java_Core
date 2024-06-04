package lesson_09;

public class Manager extends Employee{
    private String name;
    private int salary;

    public Manager(String name, int salary, String name1, int salary1) {
        super(name, salary);
        this.name = name1;
        this.salary = salary1;
    }

    @Override
    public void work() {

    }
}
