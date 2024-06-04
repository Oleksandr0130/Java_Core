package lesson_06;
// квадрат
public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "  Square {" +
                "side= " + side +
                '}';
    }
}
