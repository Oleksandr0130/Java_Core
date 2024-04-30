package lesson_1;

public class Person {
    public  String name;
    public int age;
    public int height;

    public Person(){
        name = "Peter";
        age = 60;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
