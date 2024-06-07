package lesson_25;


import java.util.HashSet;
import java.util.Set;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Jack", 32);

        Set<Person> set = new HashSet<>();
        set.add(person);

        person.setAge(person.getAge()+1);
        System.out.println("set" + set);

        System.out.println("person" + person);
        System.out.println(set.contains(person));
    }
}
