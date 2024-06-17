package lesson_30.HomeWork.Task2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
Дан текст (в рамках данной задачи текст не содержит знаков препинания, слова разделены пробелом).
Ваша задача написать метод, который сформирует map<Boolean, List<String>> где ключу true соответствует список слов,
которые встретились в тексте меньше 3 раз, а ключу false список остальных слов.

 */
public class Main {
    public static void main(String[] args) {
        String str = "anna lena jack lena anna anna john lena anna lena lena";
        Map<String, Integer> map = countingWords(str);
        System.out.println(map);
        System.out.println(partition(map));
    }

    public static Map<String,Integer> countingWords(String str){
        return countingWords(Arrays.asList(str.split(" ")), s->s);
    }

    public static<T,R> Map<R,Integer> countingWords(Collection<T> list, Function<T,R> keyFunction){
        return list.stream()
                .collect(Collectors.toMap( keyFunction, s->1, (i1, i2)-> ++i1 )  );
    }

    public static Map<Boolean, List<String>> partition(Map<String,Integer> countingWords){
        return countingWords.keySet().stream()
                .collect(Collectors.partitioningBy(w -> countingWords.get(w) > 3));
    }
}
