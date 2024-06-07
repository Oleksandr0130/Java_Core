package lesson_24;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(8);
        set.add(4);
        set.add(14);
        set.add(18);

        System.out.println(set);

        NavigableSet<Integer> integers = set.descendingSet();
        System.out.println(integers);

//        System.out.println(set.first());
//        System.out.println(set.last());
//        System.out.println(set.pollFirst());
//        System.out.println(set.pollLast());
        System.out.println(set);

        SortedSet<Integer> integers1 = set.headSet(14,true);
        System.out.println(integers1);
        SortedSet<Integer> integers2 = set.tailSet(14,false);
        System.out.println(integers2);

        SortedSet<Integer> integers3 = set.subSet(8, 14);
        System.out.println(integers3);

        System.out.println(set.lower(13));
    }
}
