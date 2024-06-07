package lesson_24.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Jack", "12-33-24");
        map.put("Oleg", "12-33-25");
        map.put("Nick", "12-33-26");
        map.put("Ann", "12-33-24");
        System.out.println(map);

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1, "Jack");
        map2.put(10, "Tom");
        map2.put(14, "Kat");
        map2.put(18, "Jack");
        System.out.println(map2);

        Map<String,Person> map3 = new HashMap<>();
        map3.put("Jack", new Person("Jack", 10));
        map3.put("Ann", new Person("Ann", 8));
        map3.put("Ted", new Person("Ted", 5));
        map3.put("Nick", new Person("Nick", 19));
        map3.put("Mick", new Person("Mick", 14));
        map3.put("Morpheus", new Person("Morpheus", 12));

        System.out.println(map3);

        System.out.println(map3.get("Ted"));
        System.out.println(map3.keySet());
        Collection<Person> values = map3.values();
        System.out.println(values);


    }
}
