package lesson_29.HomeWork.Task1;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Дан список строк вида: ‘Jack:43’ т.е. формат ‘Имя_студента:Оценка’.
Написать метод, который сформирует Map<String,
List<Integer>> такой, что ключ - имя студента, а значение список его оценок.

 */
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack:6", "Ann:3", "Mark:7", "Jack:8", "Mark:9", "Ann:8", "Ann:7");
        Map<String, List<Integer>> stringListMap = listToMap(list);
        System.out.println(stringListMap);
    }

    public static Map<String, List<Integer>> listToMap(List<String> list) {
        Map<String, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(string -> string.substring(0, string.indexOf(":"))));
        return collect.entrySet().stream()
                        .collect(Collectors.toMap(e->e.getKey(), e->listStringToListInteger(e.getValue())));

    }

    public static List<Integer> listStringToListInteger(List<String>list){
       return list.stream()
                .map(string -> string.split(":"))
                .filter(arr->arr.length == 2)
                .map(arr->arr[1])
                .map(string -> Integer.parseInt(string))
                .collect(Collectors.toList());
    }
}
