package lesson_20.AnonimClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
        people.add(new Person("Jack", 30));
        people.add(new Person("John", 20));
        people.add(new Person("Igor", 21));
        System.out.println(people);

        Collections.sort(people, new ComparatorStringByAge());

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(people);
    }
}
