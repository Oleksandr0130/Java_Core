package lesson_31.HomeWork.Task1.Exceptions;

public class EachRowMustHave10Columns extends IllegalArgumentException{
    public EachRowMustHave10Columns() {
        super("Each row must have 10 columns");
    }
}
