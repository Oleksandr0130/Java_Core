package lesson_24.HomeWork.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @DisplayName("mapNameCount: regular case")
    @Test
    void mapNameCount() {
        List<String> list = List.of("Jack", "John", "Jack", "Ann", "Lena", "Lena", "Jack");
        Map<String,Integer> expectedMap = new HashMap<>();
        expectedMap.put("Jack", 3);
        expectedMap.put("John", 1);
        expectedMap.put("Ann", 1);
        expectedMap.put("Lena", 2);

        Map<String, Integer> actualMap = Main.mapNameCount(list);
        Assertions.assertEquals(expectedMap,actualMap);
    }

    @DisplayName("mapNameCount_ifListIsNull: if list is null")
    @Test
    void mapNameCount_ifListIsNull() {
        Map<String,Integer> expectedMap = new HashMap<>();

        Map<String, Integer> actualMap = Main.mapNameCount(null);
        Assertions.assertEquals(expectedMap,actualMap);
    }
}