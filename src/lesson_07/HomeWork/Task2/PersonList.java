package lesson_07.HomeWork.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonList {
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static int countOccurrences(List<Person> persons, Person targetPerson) {
        int count = 0;
        for (Person person : persons) {
            if (person.equals(targetPerson)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("John",20));
        persons.add(new Person("John",20));
        persons.add(new Person("John",20));
        persons.add(new Person("John",20));

        Person targetPerson = new Person("Alice", 25);
        Person targetPerson2 = new Person("John",20);

        int value = countOccurrences(persons, targetPerson);
        int value1 = countOccurrences(persons, targetPerson2);

        System.out.println("Повторяющиеся имена " + targetPerson.getName() + ": " + value);
        System.out.println("Повторяющиеся имена " + targetPerson2.getName() + ": " + value1);
    }
}
