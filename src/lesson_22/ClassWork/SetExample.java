package lesson_22.ClassWork;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(10);
        setInt.add(-31);
        setInt.add(9);
        setInt.add(23);
        setInt.add(11);
        setInt.add(10);
        setInt.add(7);
        setInt.add(-10);

        System.out.println(setInt);

        setInt.remove(-10);

        boolean contains = setInt.contains(11);
        System.out.println(contains);

        System.out.println(setInt);

        List<Persone> list = new ArrayList<>();
        list.add(new Persone("Jack", 10));
        list.add(new Persone("Ann", 12));
        list.add(new Persone("Lena", 21));
        list.add(new Persone("Jack", 10));
        list.add(new Persone("John", 16));
        list.add(new Persone("Ivan", 18));
        list.add(new Persone("Lena", 21));
        list.add(new Persone("Nick", 8));

        Set<Persone> set = new HashSet<>(list);
        System.out.println(set);

//        Random rnd = new Random();
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i < 1_000_000; i++) {
//            integerList.add(rnd.nextInt());
//        }
//        System.out.println(integerList.contains(10));
//        System.out.println(integerList.contains(100));
//        System.out.println(integerList.contains(1000));
//        System.out.println(integerList.contains(5000));
//        System.out.println(integerList.contains(-333));
//        System.out.println(integerList.contains(-8818));


//        Random rnd = new Random();
//        Set<Integer> integerList = new HashSet<>();
//        for (int i = 0; i < 1_000_000; i++) {
//            integerList.add(rnd.nextInt());
//        }
//        System.out.println(integerList.contains(10));
//        System.out.println(integerList.contains(100));
//        System.out.println(integerList.contains(1000));
//        System.out.println(integerList.contains(5000));
//        System.out.println(integerList.contains(-333));
//        System.out.println(integerList.contains(-8818));

    }
}
