package lesson_24.HomeWork.Task1_1;

import java.util.Map;

public class Person {
    public static void main(String[] args) {

    }

    public static void addTwoKeysValue(Map<String, Integer> map, String key1, String key2) {
        Integer value1 = map.get(key1);
        Integer value2 = map.get(key2);

        if (value1 != null && value2 != null) {
            map.put(key1 + key2, value1 + value2);
        } else if (map.containsKey(key1) && map.containsKey(key2)) {
                Integer value = null;
                value = (value1 != null) ? value1 : value;
                value = (value2 != null) ? value2 : value;
                map.put(key1 + key2, value);
            }
        }
    }