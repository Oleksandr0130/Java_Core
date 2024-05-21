package lesson_11;

import java.util.List;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private int year;
    private double price;

    public Book(String author, String title, int year, double price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book o) {
        return author.compareTo(o.author);
//        сорт в обратном порядке
//        return -author.compareTo(o.author);
//        или
//        return o.author.compareTo(author);
    }
//    sort по автору и году
//    @Override
//    public int compareTo(Book o) {
//        int res = author.compareTo(o.author);
//        if (res == 0){
//            return this.year - o.year;
//        }else {
//            return res;
//        }
//    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
