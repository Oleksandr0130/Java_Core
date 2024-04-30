package lesson_1.project;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mainApp {
    public static void main(String[] args) {
        Truck truck1 = new Truck("John", "Man", 12_500, 2024,2000, "Black");
        Truck truck2 = new Truck("Karl", "Volvo", 24_500, 2024,4000, "white");

        Truck[] trucks = new Truck[]{truck1, truck2};

        System.out.println(truck1.toString());
//        System.out.println(Arrays.toString(trucks));
        System.out.println(truck1.getOwnersName());
        truck1.load(1000);
        truck1.refuel(1000);
        truck1.load(20000);
        truck1.canDrive();
        truck1.moving();
        truck1.moving();
//        truck1.load(20000);
        truck1.unload(21000);
        truck1.canDrive();
//        truck1.stop();



    }
}
