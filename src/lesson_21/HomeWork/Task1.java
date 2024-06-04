package lesson_21.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a12");
        list.add("_b12");
        list.add("c12");
        list.add("_d12");
        list.add("e12");
        list.add("_f12");
        list.add("g12");

        System.out.println(list);
        removeFromListIterator(list);
        System.out.println(list);
    }

    public static void removeFromListIterator (List<String> list){
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            if (listIterator.next().startsWith("_")){
                listIterator.remove();
            }
        }
    }
}
