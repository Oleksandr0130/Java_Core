package lesson_31;

import lesson_31.ExceptionsForTask3.Input100Exception;
import lesson_31.ExceptionsForTask3.InputNotIntNumberException;

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

    public static void sumInt() throws InputNotIntNumberException {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.println("Input int or 0 for exit");
            while (true) {
                System.out.print("Input int: ");
                try {
                    int input = scanner.nextInt();
                    if (input == 100) {
                        throw new Input100Exception();
                    }
                    if (input == 0) {
                        break;
                    }
                    sum += input;
                }catch (Input100Exception e){
                    System.out.println("100....100");
                } catch (Exception e) {
                    throw new InputNotIntNumberException();
//                    System.out.println("Uncorrect input try input correct int");
//                    scanner.nextLine();
                }
            }
        } finally {
            System.out.println("Sum of int: " + sum);
            scanner.close();
        }
    }
}
