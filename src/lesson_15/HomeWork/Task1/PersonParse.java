package lesson_15.HomeWork.Task1;

import java.util.ArrayList;
import java.util.List;

public class PersonParse {
    public static List<Person> parsePerson (List<String> list){
        List<Person> persons = new ArrayList<>();
        if (list == null || list.isEmpty()){
            return persons;
        }
        for (String line : list){
            String[] parts = line.split(",");
            if (parts.length == 2){
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                persons.add(new Person(name,age));
            }
        }
        return persons;
    }
}
