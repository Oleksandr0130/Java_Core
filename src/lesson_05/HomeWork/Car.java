package lesson_05.HomeWork;
public class Car extends Vehicle{

    public Car(String plateNumber, String manufacturer, int year, String color) {
        super(plateNumber, manufacturer, year, color);
    }
    @Override
    public String toString() {
        return "Truck{" +
                "Производитель='" + getManufacturer() + '\'' +
                ", Год выпуска=" + getYear() +
                ", Цвет='" + getColor() + '\'' +
                ", Номера ='" + getPlateNumber() + '\'' +
                '}';
    }
}
