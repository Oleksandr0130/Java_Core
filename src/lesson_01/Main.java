package lesson_01;

public class Main {
    public static void main(String[] args) {
        int a = 0;

        Person person = new Person();
        person.name = "John";
        person.age = 30;
        person.height = 175;


        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);

        Person bill = new Person("Bill", 40, 180);
        System.out.println(bill.name);
        System.out.println(bill.age);
        System.out.println(bill.height);

        Person Bob = new Person("Bob", 19);
        System.out.println("Person's name is " + Bob.name);
        System.out.println("Person's name is " + Bob.age);

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
         */
    }

}
