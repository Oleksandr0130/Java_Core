package lesson_26.HW25.Task2;

import lesson_26.HW25.Task1.Account;
import lesson_26.HW25.Task1.Person;
import lesson_26.HW25.Task1.PersonApp;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonApp2Test {

    @Test
    void fixMap() {
        Person p1 = new Person("Jack", 20);
        Person p2 = new Person("Ann", 30);
        Person p3 = new Person("John", 40);
        Person p4 = new Person("Lena", 50);

        ArrayList<Account> accountsP1 = new ArrayList<>(List.of(new Account("1111", p1), new Account("1112", p1), new Account("1112", p3)));
        ArrayList<Account> accountsP2err = new ArrayList<>(List.of(new Account("2221", p2), new Account("2222", p1), new Account("1114", p1), new Account("3331", p4)));
        Map<Person, List<Account>> map = new HashMap<>();
        map.put(p1,accountsP1);
        map.put(p2,accountsP2err);

        PersonApp2.fixMap(map);
        System.out.println(map);
    }
}