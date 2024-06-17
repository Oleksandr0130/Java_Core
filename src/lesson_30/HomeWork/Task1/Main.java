package lesson_30.HomeWork.Task1;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", "john@mail.com"),
                new Person("Jack", "jack@mail.com"),
                new Person("Jack", "j145@mail.com"),
                new Person("Lena", "lena@mail.com"),
                new Person("Ann", "ann@mail.com")
        );
        System.out.println(people);

        System.out.println(find(people, "j145@mail.com"));
    }

    public static boolean find(List<Person> list, Person findPerson){
        return list.indexOf(findPerson)>=0;
    }

    public static boolean find(List<Person> list, String eMail){
        Optional<Person> find = list.stream()
                .filter(person -> person != null && person.geteMail().equals(eMail))
                .findAny();
        return find.isPresent();
    }
}
