package lesson_3.HomeWork;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntArray handler = new IntArray();
        System.out.print("Введите любое число: ");

        while (true) {
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            handler.add(value);
            System.out.println("Введите 0 для завершения" + handler);
        }

        System.out.println("Массив: " + handler);
        System.out.println("Сумма элементов: " + handler.sum());
    }
}
