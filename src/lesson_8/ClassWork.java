package lesson_8;

import java.util.Scanner;

public class ClassWork {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите строку: ");
            String str = scanner.nextLine();

            System.out.println("Выберите действие:");
            System.out.println("1. Обернуть строку в квадратные скобки");
            System.out.println("2. Преобразовать строку в верхний регистр");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("[" + str + "]");
                    break;
                case 2:
                    System.out.println(str.toUpperCase());
                    break;
                default:
                    System.out.println("Неправильный выбор.");
            }
        }
    }
