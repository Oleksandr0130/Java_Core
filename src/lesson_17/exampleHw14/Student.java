package lesson_17.exampleHw14;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static final int maxGrades = 10;
    private static final int MAX_Grade = 10;
    private static final int MIN_Grade = 1;
    private int sumOfGrades = 0;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int ...grade) {
        this.name = name;
        addGrade(grade);
    }

    public void addGrade (int grade){
        if (grades.size() < maxGrades && grade >= MIN_Grade && grade <= MAX_Grade){
            grades.add(grade);
            sumOfGrades += grade;
        }
    }

    public Integer getShortfall(){
        return maxGrades * MAX_Grade - sumOfGrades;
    }

    public void addGrade (int ...grade){
        for (int i = 0; i < grade.length; i++) {
            addGrade(grade[i]);
        }
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        new ArrayList<>(grades);
        return new ArrayList<>(grades);
    }

    public int getSumOfGrades() {
        return sumOfGrades;
    }

    @Override
    public String toString() {
        return name + " (" + grades + ") " + "= " + getSumOfGrades() + " Fall = " + getShortfall();
    }
}
