package lesson_09;

public class GoProgrammer extends Employee implements Programmer{
    public GoProgrammer(String name, int salary) {
        super(name, salary);
    }

    public void writeCode(){
        System.out.println("пишу код на Go");
    }

    @Override
    public void work() {
        System.out.println("Go Программист");
    }
}
