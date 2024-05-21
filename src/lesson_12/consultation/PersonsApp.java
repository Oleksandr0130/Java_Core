package lesson_12.consultation;

import java.util.ArrayList;
import java.util.List;

public class PersonsApp {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("John", "Jonson", 30),
                new Person("Anna", "Karanina", 90),
                new Person("Jack", "Vorobey", 40)
        );
        list = new ArrayList<>(list);

        System.out.println(list);

        System.out.println(personListToString(list,35));
    }

    public static String personListToString (List<Person> list){
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            result += shortToString(list.get(i)) + ";";
        }
    return result;
    }

    public static  String shortToString (Person person) {
       return person.getFirstName().charAt(0) + ". " + person.getLastName();
    }

    public static String personListToString (List<Person> list, int age){
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > age) {
            result += shortToString(list.get(i)) + ";";
            }
        }
        return result;
    }

}
