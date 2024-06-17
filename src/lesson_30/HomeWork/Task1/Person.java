package lesson_30.HomeWork.Task1;

import java.util.Objects;

public class Person {
    private String name;
    private String eMail;

    public Person(String name, String eMail) {
        this.name = name;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(eMail, person.eMail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, eMail);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
