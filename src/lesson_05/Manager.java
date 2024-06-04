package lesson_05;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println(("I'm Manager." + getName() + " I kicks all employees"));
    }

    public void salary(){
        System.out.println((getName() + " get the salary " + getSalary() + " bonus " + bonus));
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }
}
