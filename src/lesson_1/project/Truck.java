package lesson_1.project;
/*
        Создать класс Truck, содержащий общие хар-ки грузовиков
        model, manufacturer, грузоподьемность, год выпуска,обьем бака, цвет
        имя владельца

        и имеющее след. поведение
        1.загружаться(load) и сообщать перегружен или нет
        2.сообщить можно ли еще догрузить
        3.разгружаться и сообщать в случае попытки разгрузить больше чем имеющийся
        на борту груз или попытки разгрузить отрицательный груз
        4.в случае отсутсвия топлива или груза на борту сообщать о невозможности ехать
        5. должен ездить и останавливаться
        6. заправляться
        7. сообщать имя владельца

        создать несколько грузовиков, протестировать работу, поместить их в массив
         */
public class Truck {
    public String ownersName;
    public String manufacturer;
    public int liftingCapacity;
    public int yearManufacture;
    public int volumeTank;
    public String color;

    public double currentLoad = 0;
    public double currentFuel = 0;
    public boolean isMoving = false;

    public Truck(String ownersName, String manufacturer, int liftingCapacity, int yearManufacture, int volumeTank, String color) {
        this.ownersName = ownersName;
        this.manufacturer = manufacturer;
        this.liftingCapacity = liftingCapacity;
        this.yearManufacture = yearManufacture;
        this.volumeTank = volumeTank;
        this.color = color;
    }

    public void load (double load){
        if (currentLoad > liftingCapacity) {
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
        if (currentFuel <= 0 || currentLoad <= 0){
            System.out.println("Не можем ехать: либо нет топлива либо нет товара");
        }else {
            System.out.println("Можно ехать");
        }
    }

    public void moving(){
        if (currentFuel <= 0){
            System.out.println("Нет топлива");
            return;
        }
        if (isMoving) {
            System.out.println("Грузовик уже в движении");
        }else {
            isMoving = true;
            System.out.println("Грузовик поехал");
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

    public void refuel(double fuel){
        if (currentFuel > volumeTank){
            System.out.println("Нельзя заправить больше чем объем бака");
        }else {
            currentFuel += fuel;
            System.out.println("Заправка прошла успешно" + currentFuel);
        }
    }

    public String getOwnersName(){
        return ownersName;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Производитель='" + manufacturer + '\'' +
                ", Год выпуска=" + yearManufacture +
                ", Цвет='" + color + '\'' +
                ", Имя владельца='" + ownersName + '\'' +
                ", Грузоподьемность=" + liftingCapacity +
                '}';
    }
}
