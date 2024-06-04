package Util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void add() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        Assertions.assertEquals(3,list.size());
        Assertions.assertEquals("Jack", list.get(0));
        Assertions.assertEquals("John", list.get(1));
        Assertions.assertEquals("Nick", list.get(2));
    }

    @Test
    @DisplayName("add after removing")
    void add1() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.remove(1);
        list.addAfterRemoving(1,"Anna");
        Assertions.assertEquals(3,list.size());
        Assertions.assertEquals("Jack", list.get(0));
        Assertions.assertEquals("Anna", list.get(1));
        Assertions.assertEquals("Nick", list.get(2));
    }

    @Test
    void get() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        Assertions.assertEquals("John", list.get(1));
    }

    @Test
    void size() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        Assertions.assertEquals(3,list.size());
    }

    @Test
    @DisplayName("size shold be 0 if list empty")
    void size1() {
        MyList<String> list = new MyLinkedList<>();
        Assertions.assertEquals(0,list.size());
    }

    @Test
    @DisplayName("regular remove")
    void remove() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.remove(1);
        Assertions.assertEquals(2,list.size());
        Assertions.assertEquals("Jack", list.get(0));
        Assertions.assertEquals("Nick", list.get(1));
    }

    @Test
    @DisplayName("remove first element")
    void remove1() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        String removedValue = list.removeFirstElement();
        Assertions.assertEquals("Jack",removedValue);
        Assertions.assertEquals(2,list.size());
        Assertions.assertEquals("John", list.get(0));
        Assertions.assertEquals("Nick", list.get(1));
    }

    @Test
    @DisplayName("remove last element")
    void remove2() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        String removedLastValue = list.removeLastElement();
        Assertions.assertAll(
                ()-> Assertions.assertEquals("Nick",removedLastValue),
                ()-> Assertions.assertEquals(2, list.size()),
                ()-> Assertions.assertEquals("Jack", list.get(0)),
                ()-> Assertions.assertEquals("John", list.get(1))

        );

    }

    @Test
    void set() {
    }
}