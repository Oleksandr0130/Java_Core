package lesson_28.HomeWork.Task4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }
    public static Map<String,Boolean> stringsMapToBoolean(List<String>list){
      return list.stream()
                .collect(Collectors.toMap(string -> string,string -> true, (s1,s2)->false));
    }
}
