package lesson_28;

import java.util.List;

public class Person {
    private String name;
    private List<String> ibans;

    public Person(String name, List<String> ibans) {
        this.name = name;
        this.ibans = ibans;
    }

    public String getName() {
        return name;
    }

    public List<String> getIbans() {
        return ibans;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ibans=" + ibans +
                '}';
    }
}
