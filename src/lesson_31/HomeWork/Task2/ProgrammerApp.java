package lesson_31.HomeWork.Task2;

import lesson_31.HomeWork.Task2.Exceptions.AllProgrammersAreBusyNowException;
import lesson_31.HomeWork.Task2.Exceptions.ProgrammerBusyException;
import lesson_31.HomeWork.Task2.Exceptions.ProgrammerUnavailableNowException;
import lesson_31.HomeWork.Task2.Exceptions.TeamLeadUnavailableNowException;

import java.util.Arrays;
import java.util.List;

public class ProgrammerApp {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Jack", "занят");
        Programmer programmer2 = new Programmer("John", "доступен");
        Programmer programmer3 = new Programmer("Jack", "не доступен");

        programmerDoWork(programmer1,"write code");
        programmerDoWork(programmer2,"Fix bugs");
        programmerDoWork(programmer3,"testing program");

        List<Programmer> team = Arrays.asList(programmer1,programmer2,programmer3);

        TeamLead teamLead = new TeamLead("Ann", "доступна", team);

        teamLeadDoTask(teamLead,"give work for programmer");
        teamLead.setStatus("не доступна");
        System.out.println(teamLead.getStatus());
        teamLeadDoTask(teamLead,"Update code");
    }

    private static void programmerDoWork(Programmer programmer, String taskMsg){
        try {
            String result = programmer.doWork(taskMsg);
            System.out.println(result);
        }catch (ProgrammerBusyException | ProgrammerUnavailableNowException e){
            System.out.println(e.getMessage());
        }
    }

    public static void teamLeadDoTask(TeamLead teamLead, String taskMsg){
        try {
            String result = teamLead.doTask(taskMsg);
            System.out.println(result);
        }catch (TeamLeadUnavailableNowException | AllProgrammersAreBusyNowException e){
            System.out.println(e.getMessage());
        }
    }
}
