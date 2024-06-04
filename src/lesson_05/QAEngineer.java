package lesson_05;

public class QAEngineer extends Employee {

    public QAEngineer(String name, double salary) {
    super(name, salary);
    }

    public void work(){
        System.out.println(("I'm QAEngineer." + getName() + " I testing code"));
    }

    @Override
    public String toString() {
        return "QAEngineer{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
