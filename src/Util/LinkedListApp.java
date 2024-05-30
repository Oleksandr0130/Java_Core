package Util;

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

        list.remove(1);
        System.out.println(list);
        list.add(1,"Anna");
        System.out.println(list);
    }
}
