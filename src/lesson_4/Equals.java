package lesson_4;

public class Equals {
    public static void main(String[] args) {
    int a = 10;
    int b = 10;
        System.out.println(a == b);

        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str2.equals(str1));

        Person p1 = new Person("Jack", 20);
        Person p2 = new Person("John", 20);
        Person p3 = new Person("Jack", 20);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

}
