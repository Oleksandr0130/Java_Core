package lesson_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 4, -5, 9 , 2, 6, 0));
        Collections.sort(list);
        System.out.println(list);
    List<Person> people = new ArrayList<>();

    people.add(new Person("Jack", 20));
    people.add(new Person("John", 28));
    people.add(new Person("Anna", 30));
    people.add(new Person("Ed", 15));
    people.add(new Person("Egor", 19));

    Person p1 = new Person("Igor", 20);
    Person p2 = new Person("Sveta", 30);

        System.out.println(p1.compareTo(p2));
        Collections.sort(people);
        System.out.println(people);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Tolstoy", "Vojna i mir", 1998, 3.30));
        books.add(new Book("Tolstoy", "Anna Karenina", 1990, 5.30));
        books.add(new Book("Duma", "Koroleva Margo", 2010, 20.00));
        books.add(new Book("Pushkin", "Ruslan i Ludmila", 2005, 10.90));
        books.add(new Book("Lermantov", "Geroi nashego vremeni", 2008, 3.30));
        books.add(new Book("Gogol", "Mertvie dushi", 1970, 2.30));
        printBook(books);
        Collections.sort(books);
        System.out.println("-------------------------------------");
        printBook(books);
        System.out.println("-----------------comparator by price--------------------");
        Collections.sort(books,new ComparatorBookByPrice());
        printBook(books);
        System.out.println("-----------------comparator by year--------------------");
        Collections.sort(books,new ComparatorBookByYear());
        printBook(books);
        System.out.println("-----------------comparator by title length --------------------");
        Collections.sort(books,new ComparatorBookByTitleLength());
        printBook(books);
    }



//    public static  void  swap (List<Integer> list, int index1, int index2){
//        Integer temp = list.get(index1);
//        list.set(index1, list.get(index2));
//        list.set(index2, temp);
//    }

    public static void printBook(List<Book> list){
        for (Book book : list){
            System.out.println(book);
        }
    }
}
