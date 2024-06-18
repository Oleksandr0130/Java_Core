package lesson_31.HomeWork.Task2;

import java.util.List;
/*
 Допустим, у вас в программе есть TeamLead, который  тоже может быть «доступен» и «не доступен»,
 что определяется текущим значением поля status.
 Еще у него есть поле List<Programmer> team, которое содержит список программистов.
 Реализовать метод String doTask(String taskMsg), который пытается «поручить» задачу первому доступному программисту
 ( вызвав у него doWork(String taskMsg) и вернут результат, либо кидает TeamLeadUnavailableNowException (TeamLead не доступен)
 либо AllProgrammersAreBusyNowException (не нашлось доступных пронраммистов).
 В зависимости от результата, вызывающий main выводить результат работы
 или сообщение «Нам не хватает программистов!» или «Почему TeamLead не на месте».
 */
public class TeamLead {
    private String name;
    private String status;
    private List<Programmer> team;

    public TeamLead(String name, String status, List<Programmer> team) {
        this.name = name;
        this.status = status;
        this.team = team;
    }
    public String doTask(String taskMsg) throws TeamLeadUnavailableNowException, AllProgrammersAreBusyNowException{
        if ("не доступна".equals(status)){
            throw new TeamLeadUnavailableNowException();
        }
        for (Programmer programmer : team){
            try {
                return programmer.doWork(taskMsg);
            }catch (ProgrammerBusyException | ProgrammerUnavailableNowException e){}
        }
        throw new AllProgrammersAreBusyNowException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Programmer> getTeam() {
        return team;
    }

    public void setTeam(List<Programmer> team) {
        this.team = team;
    }
}
