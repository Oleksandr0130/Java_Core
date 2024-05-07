package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class MyArray {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Jack");
        listString.add("John");
        listString.add("Ann");
        listString.add("Ivan");
        System.out.println(listString);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jack", 22));
        personList.add(new Person("Lena", 19));
        personList.add(new Person("Poul", 30));
        System.out.println(personList);

        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
        listString.remove(1);
        System.out.println(listString);

        listString.set(0, "qwerty");
        System.out.println(listString);

        System.out.println(listString.contains("Ann"));

        System.out.println(personList.contains(new Person("Jack", 22)));
    }
}
