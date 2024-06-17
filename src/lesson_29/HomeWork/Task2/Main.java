package lesson_29.HomeWork.Task2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Дан текст (в рамках данной задачи текст не содержит знаков препинания, слова разделены пробелом).
Ваша задача написать метод, который сформирует частотный словарь, т.е. получить map<String, Integer> где ключ - слово, значение - сколько раз оно встречалось в тексте.

 */
public class Main {
    public static void main(String[] args) {
        String str = "anna jack lena anna john lena lena";
        Map<String, Integer> map = countingWords(str);
        System.out.println(map);
    }

    public static Map<String,Integer> countingWords(String str) {
        return Arrays.asList(str.split(" ")).stream() // разбиваем строку по пробелам и создаем стрим
                .collect(Collectors.toMap(string -> string, string -> 1, (i1, i2) -> ++i1));


        //.collect(Collectors.toMap -> преобразования потока объектов типа String в Map
        //string -> string: Определяет, что каждая строка в потоке будет ключом в итоговой карте.
        //string -> 1: Задает начальное значение (1) для каждого встреченному ключа в карте
        //(i1, i2) -> ++i1: Указывает, что если ключ уже существует, нужно инкрементировать его значение.
    }
}

