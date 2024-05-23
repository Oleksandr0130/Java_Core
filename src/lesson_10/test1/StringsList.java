package lesson_10.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringsList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Hello", "Java", "Programming"));
        System.out.println(strings);
        System.out.println(joinString(strings));
        System.out.println(joinStringByLength(strings));
    }

    public static String joinString(List<String> strings){
        String result = "";
        for (String s : strings){
            result += s;
        }
        return result;
    }
    public static String joinStringByLength(List<String> strings){
        List<String> copyList = new ArrayList<>(strings);
        Collections.sort(copyList, (o1, o2) -> Integer.compare(o2.length(), o1.length()));
        return joinString(copyList);
    }

}
