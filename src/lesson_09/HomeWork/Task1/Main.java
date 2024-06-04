package lesson_09.HomeWork.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Swimmable> swimmables = new ArrayList<>();

        swimmables.add(new Duck());
        swimmables.add(new Boat());
        swimmables.add(new Person());

        for (Swimmable s : swimmables){
            System.out.println("-----------------");
            s.swim();
        }
        System.out.println(swimmables);
    }
}
