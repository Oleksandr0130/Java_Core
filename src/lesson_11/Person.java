package lesson_11;

public class Person implements  Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int ade) {
        this.name = name;
        this.age = ade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ade=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age){
            return 100;
        }
        if (this.age < o.age){
            return -100;
        }
        return 0;
    }
}
