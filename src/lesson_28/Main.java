package lesson_28;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("1", "twt", "sfsaf", "sgdfsgrwhhjbcx", "zxcv", "lkkjsdoc");
        list.stream()
                .filter(string -> string.length() > 2)
                .map(string -> string.substring(0,3))
                .forEach(System.out::println);

        Random rnd = new Random();
        rnd.ints()
                .takeWhile(i->i>0)
                .forEach(System.out::println);

        List<Person> people = List.of(
                new Person("Jack1", List.of("de111", "de112")),
                new Person("Jack2", List.of("de113", "de114", "de115")),
                new Person("Jack3", List.of("de116")),
                new Person("Jack4", List.of("de117", "de118"))
        );
        people.stream()
                .flatMap(p->p.getIbans().stream())
                .forEach(System.out::println);

        people.stream()
                .collect(Collectors.toList());

        Person person = people.stream()
                .filter(p -> p.getName().startsWith("A"))
                .findAny()
                .orElseGet(() -> new Person("Artur", List.of("1234e")));
        System.out.println(person);
    }
}
