package lesson_17.consultation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

//    public static void removeName(List<String>list, String name){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals(name)){
//                list.remove(i);
//            }
//        }
//    }

    public static void removeName(List<String>list, String name){
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(name)){
                list2.add(list.get(i));
            }
        }
    }

    // Начинаем прохождение по списку с конца при этом индексы остаються неизменны
//    public static void removeName(List<String>list, String name){
//        for (int i = list.size() - 1; i > 0 ;i--) {
//            if (list.get(i).equals(name)){
//                list.remove(i);
//            }
//        }
//    }
}
