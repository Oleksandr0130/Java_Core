package lesson_6;

import java.util.ArrayList;
import java.util.List;

import static lesson_6.Shape.*;

public class AppMain {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();


        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(13, 16));

        double totalArea = getTotalArea(shapes);
        System.out.println("Общая площадь: " + totalArea);

        Shape largest = getLargestShape(shapes);
        if (largest != null) {
            System.out.println("Самая большая площадь формы: " + largest.getArea() + largest.toString());
        }

        List<Shape> largeShapes = getShapesWithAreaGreaterThan(shapes, 20);
        System.out.println("Фигуры с площадью больше 20:");
        for (Shape shape : largeShapes) {
            System.out.println("Площадь формы: " + shape.getArea() + shape.toString());
        }

        Square square = new Square(4);
        System.out.println(square.getArea());
    }
}
