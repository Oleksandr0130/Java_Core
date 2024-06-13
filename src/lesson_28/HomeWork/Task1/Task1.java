package lesson_28.HomeWork.Task1;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Дан список Person (String firstName, String lastName, int age).
Необходимо используя стрим реализовать метод, который вернет список String,
где в алфавитном порядке будут перечислены все  ФИО людей (в виде Иванов И.) старше 18 лет.

 */
public class Task1 {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Jack", "Jackson", 25),
                new Person("John", "Jonson", 15),
                new Person("Anna", "Jackson", 18),
                new Person("Nick", "Karlson", 16),
                new Person("Tom", "Tompson", 30),
                new Person("Karl", "Smith", 32),
                new Person("Mick", "Tyson", 45)
        );

        System.out.println(filter(personList, person -> person.getAge() > 18));
    }

    public static List<String> filter(List<Person> personList, Predicate<Person> predicate ){
        return personList.stream()
                .filter(predicate)
                .map(p -> String.format("%s %s. (%d)",p.getlName(),p.getfName().charAt(0),p.getAge()))
                .sorted()
                .collect(Collectors.toList());
    }
}
