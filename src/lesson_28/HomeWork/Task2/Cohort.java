package lesson_28.HomeWork.Task2;

import java.util.List;

public class Cohort {
    private String title;
    private List<Student> students;

    public Cohort(String title, List<Student> students) {
        this.title = title;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }

    static class Student {
        private String name;
         private List<String> eMails;

        public Student(String name, List<String> eMails) {
            this.name = name;
            this.eMails = eMails;
        }

        public String getName() {
            return name;
        }

        public List<String> geteMails() {
            return eMails;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", eMails=" + eMails +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Cohort{" +
                "title='" + title + '\'' +
                ", students=" + students +
                '}';
    }
}
