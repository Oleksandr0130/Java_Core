package lesson_22;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainHwTest {

    @Test
    void removeByIterator() {
        List<String> list = new LinkedList<>(
                List.of("Jack", "_Ann", "_klod", "Sad", "_Lena")
        );

        List<String> expectedList = new LinkedList<>(
                List.of("Jack", "Sad")
        );
        MainHw.removeByIterator(list, "_");
        Assertions.assertEquals(expectedList, list);
    }
}