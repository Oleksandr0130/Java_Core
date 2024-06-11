package lesson_27.ClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "John", "Ann", "Kate");
        System.out.println(transformerList1(list, (String s) -> s.toUpperCase()));
        System.out.println(transformerList2(list, (String s) -> s.toUpperCase()));

        List<Integer> list1 = transformerList2(List.of("qwe", "wewer", "retrwq"), string -> string.length());
        System.out.println(list1);

        List<Person> people = List.of(
                new Person("Jack", 10),
                new Person("John", 18),
                new Person("Ann", 20),
                new Person("Mike", 8));
        List<String> listNamePerson = transformerList2(people, person -> person.getName());
        System.out.println(listNamePerson);

        System.out.println("===========================================");
        people.forEach((p)-> System.out.println(p));
        System.out.println("===========================================");
        people.forEach(person -> person.agePlusYear());
        people.forEach(person -> System.out.println(person));
    }

    public static <T>List<T> transformerList1 (List<T> list, UnaryOperator<T> transformer){
        List<T> resultList = new ArrayList<>();
        for (T str : list){
            resultList.add(transformer.apply(str));
        }
        return resultList;
    }

    public static <T,R>List<R> transformerList2 (List<T> list, Function<T,R> transformer){
        List<R> resultList = new ArrayList<>();
        for (T str : list){
            resultList.add(transformer.apply(str));
        }
        return resultList;
    }
}
