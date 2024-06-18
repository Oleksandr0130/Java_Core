package lesson_31.HomeWork.Task1.Exceptions;

public class ArrayMustHave10Rows extends IllegalArgumentException{
    public ArrayMustHave10Rows() {
        super("Array must have 10 rows");
    }
}
