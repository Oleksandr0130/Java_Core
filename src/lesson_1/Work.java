package lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("is");
        stringList.add("funny");
        stringList.add("Lesson");
        System.out.println(stringList);

        List<String> reverseArray = new ArrayList<>(stringList);
        Collections.reverse(reverseArray);

        // цикл разбивает массив на строки
//        for (String string : reverseArray){
//            System.out.println(string);
//        }
        System.out.println(reverseArray);
    }
}
