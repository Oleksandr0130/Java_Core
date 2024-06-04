package lesson_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("11q");
        list.add("113dkgfdss");
        list.add("5432fdsd");
        list.add("11e4353");
        list.add("11evsc34");

        class StringComparatorByLenght implements Comparator<String>{
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }
        Collections.sort(list,new StringComparatorByLenght());
    }
}
