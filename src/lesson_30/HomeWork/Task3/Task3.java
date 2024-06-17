package lesson_30.HomeWork.Task3;

import java.util.Scanner;

/*
Пользователь используя Scanner числа.
Ваша программа считает сумму введенных чисел.
Ваша задача, если пользователь ошибся и ввел что то типа 7лдо8р4 корректно обработать ситуацию и сделать так,
что бы программа не упала, а корректно продолжила свою работу.
Как только пользователь ввел 0 - программа завершается.
 */
public class Task3 {
    public static void main(String[] args) {
        sumInt();
    }

    public static void sumInt() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.println("Input int or 0 for exit");
            while (true) {
                System.out.print("Input int: ");
                try {
                    int input = scanner.nextInt();
                    if (input == 0) {
                        break;
                    }
                    sum += input;
                } catch (Exception e) {
                    System.out.println("Uncorrect input try input correct int");
                    scanner.nextLine();
                }
            }
        } finally {
            System.out.println("Sum of int: " + sum);
            scanner.close();
        }
    }
}
