package Util;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");

        System.out.println(list);
        System.out.println("--------------------------------");
//        System.out.println(list.removeFirstElement());
//        System.out.println(list);
//        System.out.println("--------------------------------");
//        System.out.println(list.removeLastElement());
//        System.out.println(list);

        list.addFisrtorMiddleorLast(0,"Karl");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.addAfterRemoving(1,"Anna");
        System.out.println(list);

        System.out.println("----------------------------------------");
        Iterator<String> iterator = list.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------------------");
        for (Object str : list){
            System.out.println(str );
        }
    }
}
