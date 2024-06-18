package lesson_32.Consultation;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in);) {
        scanner.nextLine();
        int i = scanner.nextInt();
        System.out.println(10 / i);
        scanner.nextLine();
        }catch (Exception e){

        }
    }
}
