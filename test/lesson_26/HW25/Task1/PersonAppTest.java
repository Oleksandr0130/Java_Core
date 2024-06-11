package lesson_26.HW25.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonAppTest {

    @Test
    void reMapPersonToAccount() {
        Map<Person,Account> inputMap = new HashMap<>();
        inputMap.put(new Person("Jack", 27), new Account("1111", new Person("Jack", 27)));
        inputMap.put(new Person("Ann", 20), new Account("1112", new Person("Lena", 27))); // incorrect
        inputMap.put(new Person("John", 27), new Account("1113", new Person("Nick", 27)));// incorrect
        inputMap.put(new Person("Klod", 31), new Account("1114", new Person("Klod", 31)));
        inputMap.put(new Person("Mike", 27), new Account("1115", new Person("Vlad", 30)));// incorrect

        Map<Person,Account> expectedMap = new HashMap<>();
        expectedMap.put(new Person("Jack", 27), new Account("1111", new Person("Jack", 27)));
        expectedMap.put(new Person("Lena", 27), new Account("1112", new Person("Lena", 27))); // incorrect
        expectedMap.put(new Person("Nick", 27), new Account("1113", new Person("Nick", 27)));// incorrect
        expectedMap.put(new Person("Klod", 31), new Account("1114", new Person("Klod", 31)));
        expectedMap.put(new Person("Vlad", 30), new Account("1115", new Person("Vlad", 30)));// incorrect

        Map<Person, Account> actualmap = PersonApp.reMapPersonToAccount(inputMap);
        Assertions.assertEquals(expectedMap,actualmap);
    }

    @Test
    void fixErrorInMap() {
        Map<Person,Account> inputMap = new HashMap<>();
        inputMap.put(new Person("Jack", 27), new Account("1111", new Person("Jack", 27)));
        inputMap.put(new Person("Ann", 20), new Account("1112", new Person("Lena", 27))); // incorrect
        inputMap.put(new Person("John", 27), new Account("1113", new Person("Nick", 27)));// incorrect
        inputMap.put(new Person("Klod", 31), new Account("1114", new Person("Klod", 31)));
        inputMap.put(new Person("Mike", 27), new Account("1115", new Person("Vlad", 30)));// incorrect

        Map<Person,Account> expectedMap = new HashMap<>();
        expectedMap.put(new Person("Jack", 27), new Account("1111", new Person("Jack", 27)));
        expectedMap.put(new Person("Lena", 27), new Account("1112", new Person("Lena", 27))); // incorrect
        expectedMap.put(new Person("Nick", 27), new Account("1113", new Person("Nick", 27)));// incorrect
        expectedMap.put(new Person("Klod", 31), new Account("1114", new Person("Klod", 31)));
        expectedMap.put(new Person("Vlad", 30), new Account("1115", new Person("Vlad", 30)));// incorrect

        PersonApp.fixErrorInMap(inputMap);
        Assertions.assertEquals(expectedMap,inputMap);
    }
}