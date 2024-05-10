package lesson_5.HomeWork;

public abstract class Vehicle {
    private String plateNumber;
    private String manufacturer;
    private int year;
    private String color;

    public boolean isMoving = false;

    public Vehicle(String plateNumber, String manufacturer, int year, String color) {
        this.plateNumber = plateNumber;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void moving(){
        if (isMoving) {
            System.out.println(getPlateNumber() + " уже в движении");
        }else {
            isMoving = true;
            System.out.println(getPlateNumber() + " поехал");
        }
    }

    public void stop(){
        if (!isMoving){
            System.out.println(getPlateNumber() + " стоит");
        }else {
            isMoving = false;
            System.out.println(getPlateNumber() + " остановлен");
        }
    }
}
