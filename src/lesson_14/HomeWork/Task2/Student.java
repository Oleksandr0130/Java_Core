package lesson_14.HomeWork.Task2;

import java.util.List;

/*
Дан список Student. Для каждого спортсмена задано имя и список оценок. Список оценок это List<Integer>.
Причем каждая оценка это число от 1 до 10, у каждого студента не более 10 оценок.
Т.е. максимальный балл, который может набрать студент 100.
Напишите программу которая формирует строку вида: Jack - 19;John -23;Kate-31 где число означает, сколько студент не добрал до максимального балла.
Причем, студенты должны идти в порядке возрастания “недобора”.
 */
public class Student {
    String name;
    List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
    public int getMissedGrades(){
        int SumOfGrades = 0;
        for (int grade : grades){
            SumOfGrades += grade;
        }
        int missedGrade = 100 - SumOfGrades;
        return missedGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
