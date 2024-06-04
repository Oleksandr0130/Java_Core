package lesson_22.ClassWork;

import java.util.Objects;

public class Persone {
    private String name;
    private int age;

    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persone persone = (Persone) o;
        return age == persone.age && Objects.equals(name, persone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Persone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
