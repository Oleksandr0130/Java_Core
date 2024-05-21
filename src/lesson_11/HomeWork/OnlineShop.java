package lesson_11.HomeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 99.99, 4.5, 10));
        products.add(new Product("Product2", 59.99, 4.0, 5));
        products.add(new Product("Product3", 19.99, 3.5, 20));
        products.add(new Product("Product4", 49.99, 5.0, 7));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sorting criteria:");
        System.out.println("1 - By price ascending");
        System.out.println("2 - By price descending");
        System.out.println("3 - By rating");
        System.out.println("4 - By stock");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                products.sort(Comparator.comparingDouble(Product::getPrice));
                break;
            case 2:
                products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
                break;
            case 3:
                products.sort(Comparator.comparingDouble(Product::getRating).reversed());
                break;
            case 4:
                products.sort(Comparator.comparingInt(Product::getStock));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }
}

