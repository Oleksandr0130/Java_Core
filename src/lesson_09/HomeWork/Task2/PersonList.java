package lesson_09.HomeWork.Task2;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack", "Johnson", 30, "jack@mail.com"));
        people.add(new Person("John", "Doe", 25, "john@mail.com"));
        people.add(new Person("Jane", "Smith", 28, "jane@mail.com"));

        PersonListProcessor processor = new PersonListProcessor(people);

        List<String> fNamelName = processor.getfNamelName();
        List<String> firstName = processor.getFirstNames();
        List<String> email = processor.getEmails();
        List<String> fullNameEmail = processor.getFullNameEmails();

        System.out.println("First Name and Last Name " + fNamelName);
        System.out.println("First Names: " + firstName);
        System.out.println("Emails: " + email);
        System.out.println("First Name and Emails: " + fullNameEmail);

    }
}
