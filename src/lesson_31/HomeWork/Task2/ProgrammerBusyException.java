package lesson_31.HomeWork.Task2;

public class ProgrammerBusyException extends Exception {
    public ProgrammerBusyException(){
        super("Программист занят другой задачей");
    }
}
