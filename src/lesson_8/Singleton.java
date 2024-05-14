package lesson_8;

public class Singleton {
    // pattern Singleton => шаблон одиночка
    private  String title;

    private static final Singleton INSTANCE = new Singleton("one");

    public Singleton(String title) {
        this.title = title;
    }

    static Singleton getInstance(){
        return INSTANCE;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

    }
}
