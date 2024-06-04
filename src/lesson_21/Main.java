package lesson_21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a12");
        list.add("_b12");
        list.add("c12");
        list.add("_d12");
        list.add("e12");
        list.add("_f12");
        list.add("g12");

        Iterator<String> iterator = list.iterator();
//        System.out.println("iterator.next() " + iterator.next());
//        System.out.println("iterator.next() " + iterator.next());
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        for (String s : list){
            System.out.println(s);
        }

        System.out.println("--------List Iterator 1--------");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex() + ". " + listIterator.previous());
        }

        ListIterator<String> listIterator1 = list.listIterator();
//        listIterator1.add("qwerty");
        System.out.println(list);

        while (listIterator1.hasNext()){
            if (listIterator1.next().startsWith("_")){
                listIterator1.remove();
            }
        }
        System.out.println(list);
    }
}
