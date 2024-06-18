package lesson_31.HomeWork.Task2.Exceptions;

public class ProgrammerUnavailableNowException extends Exception {
    public ProgrammerUnavailableNowException(){
        super("Программист не доступен");
    }
}
