package lesson_17.consultation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void removeName() {
        ArrayList<String> data = new ArrayList<>(List.of("Jack", "John", "Poul", "Nick", "John"));
        ArrayList<String> expected = new ArrayList<>(List.of("Jack", "Poul", "Nick"));

        Main.removeName(data,"John");
        Assertions.assertEquals(expected,data);
    }

    @Test
    void removeName1() {
        ArrayList<String> data = new ArrayList<>(List.of("Jack", "John", "John", "John", "Poul", "Nick", "John"));
        ArrayList<String> expected = new ArrayList<>(List.of("Jack", "Poul", "Nick"));

        Main.removeName(data,"John");
        Assertions.assertEquals(expected,data);
    }
}