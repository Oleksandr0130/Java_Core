package lesson_05.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class VehicleApp {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bus("32452", "VW", 8, 2024,"black"));
        vehicles.add(new Truck("234", "MAN", 12_000, 2010, "red"));
//        System.out.println(vehicles);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        Bus bus1 = new Bus("23421","VW", 8,2024, "white");
        Truck truck = new Truck("234", "MAN", 12_000, 2010, "red");
        Car car = new Car("654678765", "VOLVO", 2024,"grey");
        System.out.println("========Bus=========");
        System.out.println(bus1);
        bus1.takePassengers(3);
        bus1.moving();

        System.out.println("========Truck=========");
        System.out.println(truck);
        truck.moving();
        System.out.println("========Car=========");
        System.out.println(car);
        car.moving();
    }
}
