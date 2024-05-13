package lesson_7.HomeWork.Task2;

import java.util.*;

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

    public static Map<String, Integer> countOccurrences(List<Person> persons) {
        Map<String, Integer> nameCounts = new HashMap<>();
        for (Person person : persons) {
            String name = person.getName();
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        return nameCounts;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 20));

        Person targetPerson = new Person("Lina", 30);
        Person targetPerson1 = new Person("Bob", 30);
        int value = countOccurrences(persons, targetPerson);

        System.out.println("Повторяющиеся имена " + targetPerson.getName() + ": " + value);
        System.out.println("Повторяющиеся имена " + targetPerson1.getName() + ": " + value);

        Map<String, Integer> nameCounts = countOccurrences(persons);
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Имя: " + entry.getKey() + ", Количество: " + entry.getValue());
            }
        }

    }
}
