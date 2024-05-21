package lesson_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            String str1= "hello";
            String str2= "java";
            System.out.printf("%s | %s | %s%n",str1,str2, str1);

         */

        Product p1 = new Product("Монитор", 179.99, 4.8, 10);
        List<Product> products = new ArrayList<>(List.of(
                new Product("Ноутбук", 2000, 4.8, 3),
                new Product("Наушники", 119.99, 4.4, 38),
                new Product("Стиральная машина", 840.50, 4.0, 1),
                new Product("Телевизор", 410.50, 4.8, 6),
                new Product("Ноутбук", 2100, 4.9, 8),
                p1
        )); // Ctrl + Alt + V
        ComparatorProduct[] comparators = {
                new ComparatorProductByPrice(),
                new ComparatorProductByQuantity(),
                new ComparatorProductByTitle()
        };

        ProductUtil.print(products);
        System.out.println("------------------------------------");

        ComparatorProduct menu = menu(comparators);
        Collections.sort(products, menu);
        ProductUtil.print(products);

    }

    public static ComparatorProduct menu(ComparatorProduct[] arrayComparators) {
        System.out.println("Выберите вариант сортировки: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayComparators.length; i++) {
            System.out.printf("%d. %s%n", i + 1, arrayComparators[i].getDescription());
        }
        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < arrayComparators.length) {
            return arrayComparators[choice];
        }
        System.exit(0);
        return null;
    }
}
