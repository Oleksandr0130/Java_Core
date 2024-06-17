package lesson_29;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<String>> collect = Stream.of("qwe", "asd", "qwerty", "gggs", "hjkl", "kjli", "iop")
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

        Map<Integer, List<Integer>> collect1 = Stream.of(1, 2, 3, 6, 7, 4, 9, 8, 43, 56, 76, 34, 23, 54, 32, 54, 77).collect(Collectors.groupingBy(integer -> integer % 8));
        System.out.println(collect1);

        Map<Integer, Set<String>> collect2 = Stream.of("qwe", "asd", "qwerty", "gggs", "hjkl", "kjli", "iop", "hjkl", "qwerty")
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(collect2);

        Map<Integer, Long> collect3 = Stream.of("qwe", "asd", "qwerty", "gggs", "hjkl", "kjli", "iop", "hjkl", "qwerty")
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect3);

        Map<Integer, String> collect4 = Stream.of("qwe", "asd", "qwerty", "gggs", "hjkl", "kjli", "iop", "hjkl", "qwerty")
                .collect(Collectors.groupingBy(String::length, Collectors.joining(",","(",")")));
        System.out.println(collect4);

        Integer collect5 = Stream.of("qwe", "asd", "qwerty", "gggs", "hjkl", "kjli", "iop", "hjkl", "qwerty")
                .collect(Collectors.collectingAndThen(Collectors.toList(), List::size));
        System.out.println(collect5);

        Map<Boolean, List<String>> collect6 = Stream.of("qwe", "asd", "qwerty", "gggs", "hjkl", "kjli", "iop", "hjkl", "qwerty")
                .collect(Collectors.partitioningBy(string -> string.length() > 4));
        System.out.println(collect6);
    }
}
