package lesson_22.HomeWork.Task2;

/*
Чуть сложнее. У вас есть 3 списка студентов:
список студентов прослушавших курс бэкенд
список студентов прослушавших курс фронтенд
список студентов прослушавших курс qa
Ваша задача получить список студентов прослушавших все три курса.
 */

import java.util.Objects;

public class Student {
    private String name;
    private int lessonName;

    public Student(String name, int lessonName) {
        this.name = name;
        this.lessonName = lessonName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(lessonName, student.lessonName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lessonName);
    }

    @Override
    public String toString() {
        return "Student: " + name + " [" + lessonName + "]";
    }
}
