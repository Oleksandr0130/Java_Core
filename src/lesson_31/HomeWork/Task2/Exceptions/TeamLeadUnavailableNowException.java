package lesson_31.HomeWork.Task2.Exceptions;

public class TeamLeadUnavailableNowException extends Exception {
    public TeamLeadUnavailableNowException(){
        super("Почему TeamLead не на месте");
    }
}
