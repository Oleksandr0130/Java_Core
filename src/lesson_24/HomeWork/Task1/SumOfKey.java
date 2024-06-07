package lesson_24.HomeWork.Task1;

import java.util.HashMap;
import java.util.Map;

public class SumOfKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack",18);
        map.put("John",9);
        map.put("Ann",5);
        System.out.println(map);
        SumOfKey.checkKeyAndMakeSumOfKey(map,"Ann", "Jack");
        System.out.println(map);

    }
    public static void checkKeyAndMakeSumOfKey(Map<String,Integer> map, String key1, String key2){
        if (map.containsKey(key1) && map.containsKey(key2)){
            Integer val1 = map.get(key1);
            Integer val2 = map.get(key2);
            String newKey = key1 + key2;
            Integer newValue = val1 + val2;
            map.put(newKey,newValue);
        }
    }
}
