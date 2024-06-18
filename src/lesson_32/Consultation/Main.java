package lesson_32.Consultation;

public class Main {
    public static void main(String[] args) {
        temp(1);
    }
    public static void temp(int a) {
        System.out.println("start method temp");
        if (a == 0){
            throw new MyException();
        }
        System.out.println("finish method temp");
    }
}
