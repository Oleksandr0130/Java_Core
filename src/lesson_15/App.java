package lesson_15;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

    }
    public static Integer maxNumber(List<Integer> list){
        if (list == null || list.isEmpty())
            return null;
        int max = list.get(0);
        for (Integer number : list){
            max = Math.max(number, max);
        }
        return max;
    }
}
