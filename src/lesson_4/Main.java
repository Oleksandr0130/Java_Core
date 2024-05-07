package lesson_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        IntArrayHandler intArray = new IntArrayHandler();
//        intArray.add(10);
//        intArray.add(20);
//        intArray.add(30);
//        intArray.add(40);
//        intArray.add(50);
        IntArrayHandler intArray = getIntArray();
        System.out.println(intArray);

        System.out.println(intArray.sum());

    }
    public static IntArrayHandler getIntArray(){
        IntArrayHandler arrayHandler = new IntArrayHandler();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("input next int or 0 for exit");
            int input = scanner.nextInt();
            if (input != 0){
                arrayHandler.add(input);
            }else {
                break;
            }
        }
        return arrayHandler;
    }
}
