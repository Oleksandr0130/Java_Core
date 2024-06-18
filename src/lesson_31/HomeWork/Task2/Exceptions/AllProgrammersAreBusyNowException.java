package lesson_31.HomeWork.Task2.Exceptions;

public class AllProgrammersAreBusyNowException extends Exception {
    public AllProgrammersAreBusyNowException(){
        super("Нам не хватает программистов!");
    }
}
