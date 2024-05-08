package lesson_5.HomeWork;

public class Bus extends Vehicle{

    private int sizePlace;

    public int currentPassengers = 0;
    public boolean isMoving = false;

    public Bus(String plateNumber, String manufacturer, int sizePlace, int year, String color) {
        super(plateNumber, manufacturer, year, color);
        this.sizePlace = sizePlace;
    }

    public void takePassengers(int take){
        if (currentPassengers + take > sizePlace){
            System.out.println("Неможем взять пассажиров");
        }else {
            currentPassengers += take;
            sizePlace -= currentPassengers;
            System.out.println("Взяли пассажиров: " + currentPassengers + " \nОсталось мест: " + sizePlace);

        }
    }

    public void moving(){
        if (isMoving) {
            System.out.println("Bus уже в движении");
        }else {
            isMoving = true;
            System.out.println(" В Бусе "+ getPlateNumber() + " поехали " + currentPassengers + " пассажира");
        }
    }

    public void stop(){
        if (!isMoving){
            System.out.println("Bus стоит");
        }else {
            isMoving = false;
            System.out.println("Bus остановлен");
        }
    }


    @Override
    public String toString() {
        return "Bus{" +
                "Цвет= '" + getColor() + '\'' +
                ", Год выпуска= " + getYear() +
                ", Места для пассажиров= " + sizePlace +
                ", Производитель= '" + getManufacturer() + '\'' +
                ", Номера= '" + getPlateNumber() + '\'' +
                '}';
    }
}
