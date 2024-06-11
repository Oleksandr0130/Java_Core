package lesson_26.HW25.ClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class MainExampleStream {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "John", "Ann");
        List<String> list1 = listHandler(list, new StringTransformer() {
            @Override
            public String transform(String str) {
                return str.toUpperCase();
            }
        });
        System.out.println(list1);
    }

    public static List<String> listHandler(List<String> list, StringTransformer transformer) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(transformer.transform(str));
        }
        return result;
    }

    public static List<String> listHandler1(List<String> list, UnaryOperator<String> transformer) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(transformer.apply(str));
        }
        return result;
    }
}