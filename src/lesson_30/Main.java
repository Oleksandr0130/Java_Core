package lesson_30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int i1 = readInt();
            System.out.println(i1);
        }
    }
    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.print("Input int:");
        int i = scanner.nextInt();
        return i;
        }catch (Exception e){
            System.out.println("not good input");
            return 0;
        } finally {

        }
    }
}
