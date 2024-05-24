package lesson_15.HomeWork.Task1;

import java.util.Arrays;
import java.util.List;

public class PersonListApp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("John,18", "Anna,25", "Oleg, 35");
        List<Person> people = PersonParse.parsePerson(list);

        System.out.println(people);

        for (Person person : people){
            System.out.println(person);
        }
    }
}
