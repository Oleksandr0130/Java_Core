package lesson_24;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> strSet = new TreeSet<>();
        strSet.addAll(Set.of("Jack", "John", "Lena", "Nick", "Bob"));

        Set<Integer> integer = new TreeSet<>();
        integer.addAll(Set.of(10, 12, 7, 18));

        for (String str : strSet){
            System.out.println(str);
        }
            System.out.println(integer);
        System.out.println(strSet.contains("Lena") ? "Lena +" : "Lena -");
//        System.out.println(strSet);

        Comparator<Person> comparatorByAge = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Comparator<Person> comparatorByName = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Set<Person> setPerson = new TreeSet<>(comparatorByAge.thenComparing(comparatorByName));
        setPerson.add(new Person("Jack", 19));
        setPerson.add(new Person("John", 10));
        setPerson.add(new Person("Jack", 8));
        setPerson.add(new Person("Nick", 8));
        setPerson.add(new Person("Ann", 15));

        System.out.println(setPerson);
    }
}
