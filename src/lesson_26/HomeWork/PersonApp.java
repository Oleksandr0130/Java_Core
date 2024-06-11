package lesson_26.HomeWork;


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
import java.util.stream.Collectors;

public class PersonApp {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jack", 20));
        personList.add(new Person("Ann", 30));
        personList.add(new Person("Nick", 35));
        personList.add(new Person("Ivan", 15));
        personList.add(new Person("Alice", 25));

        List<Person> filterByName = filter(personList, p -> p.getName().startsWith("A"));
        System.out.println(filterByName);

        List<Person> filterByAge = filter(personList, p -> p.getAge() < 30);
        System.out.println(filterByAge);

        List<Person> sortedByAge = filterByAge.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedByAge);

        List<Person> sortedPersonList = personList.stream()
                        .sorted(Comparator.comparingInt(Person::getAge))
                                .collect(Collectors.toList());
        System.out.println(sortedPersonList);
    }
    
    public static List<Person> filter(List<Person> personList, MyPredicate predicate){
        return personList.stream()
                .filter(predicate :: test)
                .collect(Collectors.toList());
    }
}
