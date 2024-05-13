package lesson_7.HomeWork.Task1;


import java.util.ArrayList;
import java.util.List;

//Дан лист <Person>. Необходимо написать метод, который возвращает List<String> который содержит имена всех пользователей старше 20 лет
public class Person {
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

    public static List<String> getNames(List<Person> persons) {
        List<String> names = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > 20) {
                names.add(person.getName());
            }
        }
        return names;
    }



    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 18));
        persons.add(new Person("Karl", 30));
        persons.add(new Person("Karl", 30));
        persons.add(new Person("Karl", 30));

        List<String> name = Person.getNames(persons);
        System.out.println("Имена пользователей старше 20 лет: " + name);

    }
}
