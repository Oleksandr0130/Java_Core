package lesson_15.HomeWork.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonParseTest {

    @Test
    void parsePerson() {
        List<String> input = Arrays.asList(
                "John, 18"
        );
        List<Person> expected = Arrays.asList(
                new Person("John", 18)
        );
        List<Person> result = PersonParse.parsePerson(input);
        assertEquals(expected.size(),result.size());
        assertEquals(expected.get(0).getName(), result.get(0).getName());
        assertEquals(expected.get(0).getAge(), result.get(0).getAge());
    }

    @Test
    void parsePerson_isEmpty() {
        List<Person> result = PersonParse.parsePerson(null);
        assertTrue(result.isEmpty());
    }
}