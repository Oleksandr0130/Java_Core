package lesson_9.HomeWork.Task2;

import java.util.ArrayList;
import java.util.List;

public class PersonListProcessor {
    private List<Person> people;

    public PersonListProcessor(List<Person> people) {
        this.people = people;
    }

    public List<String> getFirstNames(){
    List<String> firstNames = new ArrayList<>();
        for (Person person : people) {
        firstNames.add(person.getfName());
    }
     return firstNames;
    }

    public List<String> getfNamelName(){
    List<String> fNamelName = new ArrayList<>();
        for (Person person : people) {
        fNamelName.add(person.processFnameLName());
    }
     return fNamelName;
    }

    public List<String> getEmails(){
    List<String> emails = new ArrayList<>();
        for (Person person : people) {
        emails.add(person.getEmail());
    }
     return emails;
    }

    public List<String> getFullNameEmails(){
    List<String> fullNameEmails = new ArrayList<>();
        for (Person person : people) {
        fullNameEmails.add(person.process());
    }
     return fullNameEmails;
    }
}
