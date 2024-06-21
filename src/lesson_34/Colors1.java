package lesson_34;

public enum Colors1 {
    GREEN(10,"Зеленый"),
    BLACK(20,"Черный"),
    RED(30,"Красный"),
    BLUE(40,"Синий");

    private int colorCode;
    private String title;

    Colors1(int colorCode, String title) {
        this.colorCode = colorCode;
        this.title = title;
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getTitle() {
        return title;
    }
}
