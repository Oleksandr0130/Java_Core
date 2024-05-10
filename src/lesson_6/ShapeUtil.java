package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    public static double getTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    // Метод для нахождения фигуры с самой большой площадью
    public static Shape getLargestShape(List<Shape> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }

        Shape largest = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.getArea() > largest.getArea()) {
                largest = shape;
            }
        }

        return largest;
    }

    // Метод для фильтрации фигур по минимальной площади
    public static List<Shape> getShapesWithAreaGreaterThan(List<Shape> shapes, double minArea) {
        List<Shape> result = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.getArea() > minArea) {
                result.add(shape);
            }
        }
        return result;
    }

}
