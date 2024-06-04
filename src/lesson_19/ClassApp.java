package lesson_19;

public class ClassApp {
    public static void main(String[] args) {


        OuterClass outerClass = new OuterClass(10);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(20);
        System.out.println(innerClass);
        Demo demo = new Demo();

        OterClass2.StaticInnerClass staticInnerClass = new OterClass2.StaticInnerClass();
    }
    public static void method(){
        class MyDate{
            private int day;
            private int month;
            private int year;

            public MyDate(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }
            MyDate date = new MyDate(10,05, 2024);
            MyDate date1 = new MyDate(10,05, 2024);
            MyDate date2 = new MyDate(10,05, 2024);
        }

    }
}
