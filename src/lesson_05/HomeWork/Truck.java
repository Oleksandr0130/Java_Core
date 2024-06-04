package lesson_05.HomeWork;

public class Truck extends Vehicle{

    private int liftingCapacity;

    public double currentLoad = 0;


    public Truck(String plateNumber, String manufacturer, int liftingCapacity, int year, String color) {
        super(plateNumber, manufacturer, year, color);
        this.liftingCapacity = liftingCapacity;
    }

    public void load (double load){
        if (currentLoad + load > liftingCapacity) {
            System.out.println("Нельзя загрузить такой вес");
        }else {
            currentLoad += load;
            System.out.println("Груз загружен" + currentLoad);
        }
    }

    public void unload(double load){
        if (currentLoad < 0) {
            System.out.println("Нельзя разгрузить пустоту!!!");
        } else if (currentLoad < load) {
            System.out.println("Нельзя выгрузить больше чем на борту");
        }else {
            currentLoad -= load;
            System.out.println("Груз успешно выгружен");
        }
    }

    public void canDrive(){
        if ( currentLoad <= 0){
            System.out.println("Не можем ехать: нет товара");
        }else {
            System.out.println("Можно ехать");
        }
    }

    public void moving(){
        if (isMoving) {
            System.out.println("Грузовик уже в движении");
        }else {
            isMoving = true;
            System.out.println("Грузовик " + getPlateNumber() + " поехал" + " с весом " + currentLoad);
        }
    }

    public void stop(){
        if (!isMoving){
            System.out.println("Грузовик стоит");
        }else {
            isMoving = false;
            System.out.println("Грузовик остановлен");
        }
    }


    @Override
    public String toString() {
        return "Truck{" +
                "Производитель='" + getManufacturer() + '\'' +
                ", Год выпуска=" + getYear() +
                ", Цвет='" + getColor() + '\'' +
                ", Номера ='" + getPlateNumber() + '\'' +
                ", Грузоподьемность=" + liftingCapacity +
                '}';
    }
}
