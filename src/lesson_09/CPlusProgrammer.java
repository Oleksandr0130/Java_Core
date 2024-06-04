package lesson_09;

public class CPlusProgrammer extends Employee implements Programmer{

    public CPlusProgrammer(String name, int salary) {
        super(name, salary);
    }

    public void writeCode(){
        System.out.println("пишу код на c++");
    }
    @Override
    public void work() {
        System.out.println("C++ Программист");
    }
}
