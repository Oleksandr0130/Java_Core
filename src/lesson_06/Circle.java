package lesson_06;
// круг
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "  Circle {" +
                "radius= " + radius +
                '}';
    }
}
