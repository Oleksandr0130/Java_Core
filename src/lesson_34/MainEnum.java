package lesson_34;

import java.util.Arrays;

public class MainEnum {
    public static void main(String[] args) {
//        draw(Colors.BLACK);
//        draw(Colors1.BLACK);
        draw(Colors2.BLACK);
//        System.out.println(Arrays.toString(Colors.values()));
    }
    public static void draw(Colors color){
        System.out.println("Установили цвет: " + color);
        System.out.println("Рисуем.....");
    }
    public static void draw(Colors1 color){
        System.out.println("Установили цвет: " + color.getTitle());
        System.out.println("Используем код: " + color.getColorCode());
        System.out.println("Рисуем.....");
    }
    public static void draw(Colors2 color){
        System.out.println("Установили цвет: " + color.getTitle());
        System.out.println("Используем код: " + color.getColorCode());
        System.out.println("Рисуем.....");
        color.method();
    }
}
