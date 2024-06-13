package lesson_28;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "John", "Mark", "Ann", "Lena");
        List<String> collect = list.stream().collect(Collectors.toList());
        Set<String> collect1 = list.stream().collect(Collectors.toSet());
        LinkedList<String> collect2 = list.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
        TreeSet<String> collect3 = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));

        //==============================================

        Map<String, Character> collect4 = list.stream().collect(Collectors.toMap(s -> s, s -> s.charAt((0))));
        System.out.println(collect4);

        Map<Character, String> collect5 = list.stream().collect(Collectors.toMap(s -> s.charAt(0), s -> s,(s1,s2)-> s1 + " " + s2));
        System.out.println(collect5);
    }
}
