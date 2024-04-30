package lesson_1;

public class Main {
    public static void main(String[] args) {
        int a = 0;

        Person person = new Person();
        person.name = "John";
        person.age = 30;
        person.height = 175;


        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);

        Person bill = new Person("Bill", 40, 180);
        System.out.println(bill.name);
        System.out.println(bill.age);
        System.out.println(bill.height);
    }

}
