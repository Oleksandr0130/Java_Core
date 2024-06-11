package lesson_26.HW25.Task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(deleteCopy("Jack,John,Nick,John"));
    }
    public static String deleteCopy (String string){
        HashSet<String> names = new LinkedHashSet<>(Arrays.asList(string.split(",")));
//        StringBuilder sb = new StringBuilder();
//        for (String str : names){
//            sb.append(str).append(",");
//        }
//        sb.setLength(sb.length()-1);
//        return sb.toString();
        return String.join(",", names);
    }
}
