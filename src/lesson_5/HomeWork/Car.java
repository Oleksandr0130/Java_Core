package lesson_5.HomeWork;
public class Car extends Vehicle{

    public Car(String plateNumber, String manufacturer, int year, String color) {
        super(plateNumber, manufacturer, year, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "isMoving=" + isMoving +
                '}';
    }
}
