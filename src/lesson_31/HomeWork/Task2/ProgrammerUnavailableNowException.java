package lesson_31.HomeWork.Task2;

public class ProgrammerUnavailableNowException extends Exception {
    public ProgrammerUnavailableNowException(){
        super("Программист не доступен");
    }
}
