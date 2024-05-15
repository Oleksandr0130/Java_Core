package lesson_9;

public class JavaProgrammer extends Employee implements Programmer{
    public JavaProgrammer(String name, int salary) {
        super(name, salary);
    }
    public void writeCode(){
        System.out.println("пишу код на Java");
    }

    @Override
    public void work() {
        System.out.println("Java Программист");
    }
}
