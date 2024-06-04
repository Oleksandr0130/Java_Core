package lesson_05;

public class Programmer extends Employee{


    public Programmer(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(("I'm programmer." + getName() + " I write code"));
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
