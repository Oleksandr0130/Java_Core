package lesson_24.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jack", "John", "Jim", "Ann", "Aleksander", "Evgenii","Kiril", "T", "ldjkghlsdkjadsfg");
        Map<Integer, List<String>> map = new HashMap<>();
        for (String name : names) {
            List<String> list = map.get(name.length());
            if (list == null) {
                list = new ArrayList<>();
                list.add(name);
                map.put(name.length(), list);
            } else {
                list.add(name);
                map.put(name.length(), list);
            }
        }
        System.out.println(map);

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet){
            System.out.println(key + " Value = " + map.get(key));
        }
        System.out.println("===================================");
        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<String>> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
