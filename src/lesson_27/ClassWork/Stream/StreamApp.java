package lesson_27.ClassWork.Stream;

import lesson_27.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {
    public static void main(String[] args) {
        List<Integer> integers = List.of(4, 7, -7, 1, 9, 2, 0, -1);
        List<Integer> list1 = integers.stream()
                .filter(integer -> integer > 0)
                .sorted((integers1,integers2)-> integers2-integers1)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list1);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jack", 20));
        personList.add(new Person("Ann", 30));
        personList.add(new Person("Nickolai", 35));
        personList.add(new Person("Ivan", 15));
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Aleksander", 40));
        personList.add(new Person("Kiril", 28));

        List<String> names = personList.stream()
                .filter(person -> person.getAge() > 20)
                .map(person -> person.getName())
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
