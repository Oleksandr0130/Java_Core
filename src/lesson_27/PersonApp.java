package lesson_27;


/*
Объявите функциональный интерфейс MyPredicate, в котором должен быть единственный метод boolean test(Person p)
Используя ваш интерфейс реализуйте универсальный метод фильтрации списка Person.
Т.е. ваш метод должен принимать список Person и интерфейс MyPredicate который задает условие отбора
 (подсказка: это очень похоже на код StringTransformer написанный в классе)
Выполните несколько вариантов отбора Person (по началу имени, по возрасту и т.д.).
Попробуйте реализовать MyPredicate с помощью лямбда выражений (стрелочных функций).

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonApp {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jack", 20));
        personList.add(new Person("Ann", 30));
        personList.add(new Person("Nickolai", 35));
        personList.add(new Person("Ivan", 15));
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Aleksander", 40));
        personList.add(new Person("Kiril", 28));

        System.out.println("---------filterByName--------------");
        List<Person> filterByName = filter(personList, p -> p.getName().startsWith("A"));
        System.out.println(filterByName + "\n");

        System.out.println("---------filterByAge--------------");
        List<Person> filterByAge = filter(personList, p -> p.getAge() < 30);
        System.out.println(filterByAge + "\n");

        System.out.println("---------sortedByAge--------------");
        List<Person> sortedByAge = filterByAge.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedByAge + "\n");

        System.out.println("---------sortedPersonList--------------");
        List<Person> sortedPersonList = personList.stream()
                        .sorted(Comparator.comparingInt(Person::getAge))
                                .collect(Collectors.toList());
        System.out.println(sortedPersonList + "\n");

        System.out.println("---------sortedByNameLength--------------");
        List<Person> sortedByNameLength = personList.stream()
                .sorted(Comparator.comparingInt(p -> p.getName().length()))
                .collect(Collectors.toList());
        System.out.println(sortedByNameLength + "\n");

        System.out.println("---------filterByNameLength--------------");
        List<Person> filterByNameLength = personList.stream()
                .filter(person -> person.getName().length() == 4)
                .collect(Collectors.toList());
        System.out.println(filterByNameLength + "\n");

        System.out.println("---------filter2--------------");
        List<Person> filter2 = filter(personList, p -> p.getName().length() > 4);
        System.out.println(filter2);
        System.out.println("---------filter3--------------");
        List<Integer> filter3 = filter(List.of(1, 3, 4, -2, 3), i -> i % 2 == 0);
        System.out.println(filter3);
    }

    public static <T> List<T> filter(List<T> personList, Predicate<T> predicate){
        return personList.stream()
                .filter(predicate :: test)
                .collect(Collectors.toList());
    }
}
