package lesson_9.HomeWork.Task2;

import java.util.List;

/*
В программе задан список Person{ String fName, String lName, int age, String email}.
Реализовать следующие функции:
получить список всех ФИО
получить список всех e-mail
получить список строк   вид “Jack Johnson; jack@mail.com” те “fName lName; email”
Подсказка: Естественно, все вышеперечисленные функции может и должен реализовать один метод,
в который в качестве параметра должен приходить список Person и реализация необходимого способа обработки.

 */
public class Person implements ProcessorPerson{
    private String fName;
    private String lName;
    private int age;
    private String email;

    public Person(String fName, String lName, int age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }
    @Override
    public String processFnameLName(){
        return fName + " " + lName;
    }

    @Override
    public String process() {
        return fName + " " + lName + " " + email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
