package lesson_08;

public class LazySingleton {
    private String title;
    private static LazySingleton instance = null;
    private  LazySingleton(String title) {
        this.title = title;
    }

    public static LazySingleton getInstance(String title){
        if (instance == null){
            instance = new LazySingleton(title);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazySingleton{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance("one");
        System.out.println(lazySingleton1);
    }
}
