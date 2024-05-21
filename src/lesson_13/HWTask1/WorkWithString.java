package lesson_13.HWTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkWithString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Ann", "Jack", "John", "Bob", "Ann", "Aleksandr"));
        System.out.println(strings);

        System.out.println("1 результат: " + join(strings));
        System.out.println("2 результат: " + joinByLength(strings));
        System.out.println("3 результат: " + changeRepeatString(strings, "Ann"));
        System.out.println(strings);

    }

    public static String join(List<String> list) {
        String result = "";
        for (String str : list) {
            result += str;
        }
        return result;
    }

    public static String joinByLength(List<String> list) {
        List copyList = new ArrayList<>(list);
        Collections.sort(copyList, new ComparatorStringByLength());
        return join(copyList);
    }

    public static List<String> changeRepeatString(List<String> list, String str) {
        List<String> result = new ArrayList<>();
        int counter = 0;
        for (String s : list) {
            if (s.equals(str)) {
                counter++;
                String povtorString = (counter > 1) ? "[Повтор " + counter + "] " : "";
                result.add(povtorString + s);
            } else {
                result.add(s);
            }
        }

        return result;
    }

    public static List<String> changeRepeatString2(List<String> list, String str) {
        List<String> result = new ArrayList<>();
        boolean isRepeat = false;
        for (String s : list) {
            if (s.equals(str)) {
                String povtorString = isRepeat ? "[Повтор ] " : "";
                isRepeat = true;
                result.add(povtorString + s);
            } else {
                result.add(s);
            }
        }

        return result;
    }
}
