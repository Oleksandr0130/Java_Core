package lesson_34;

public enum Colors2 {
    GREEN(10,"Зеленый"){
        @Override
        public void method() {
            System.out.println("Green");
        }
    },
    BLACK(20,"Черный"){
        @Override
        public void method() {
            System.out.println("Black");
        }
    },
    RED(30,"Красный"){
        @Override
        public void method() {
            System.out.println("Red");
        }
    },
    BLUE(40,"Синий"){
        @Override
        public void method() {
            System.out.println("Blue");
        }
    };

    private int colorCode;
    private String title;

    Colors2(int colorCode, String title) {
        this.colorCode = colorCode;
        this.title = title;
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getTitle() {
        return title;
    }

    public abstract void method();
}
