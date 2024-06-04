package lesson_07.HomeWork.Task2Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    public class PersonByMapKey {
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
            public String toString() {
                return "Person{" +
                        "name= '" + name + '\'' +
                        ", age= " + age +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return age == person.age && name.equals(person.name);
            }

            @Override
            public int hashCode() {
                return name.hashCode() + age;
            }
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

            Map<String, Integer> nameCounts = countOccurrences(persons);
            for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("Имя: " + entry.getKey() + ", Количество: " + entry.getValue());
                }
            }
            for (Person person : persons)
            System.out.println(person);
        }
    }

