package Maps_Lambda_Stream_API.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_Student_Academy {
    public static class Student {
        private String name;
        private ArrayList<Double> grades;

        public Student(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Double> getGrades() {
            return grades;
        }

    }

    public static void addStudentIfDoesNotExist(LinkedHashMap<String, Student> students, String studentName) {
        students.putIfAbsent(studentName, new Student(studentName));
    }

    public static void addGradeForExistingStudent(LinkedHashMap<String, Student> students, String name, double grade) {
        ArrayList<Double> studentGrades = students.get(name).getGrades();
        studentGrades.add(grade);
    }

    public static void printFinalResult(LinkedHashMap<String, Student> students) {

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            String studentName = entry.getKey();
            Student student = entry.getValue();
            ArrayList<Double> grades = student.getGrades();
            double averageScore = grades.stream().mapToDouble(d -> d).sum() / grades.size();
            if (averageScore >= 4.50) {
                System.out.printf("%s -> %.2f\n", studentName, averageScore);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, Student> students = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            addStudentIfDoesNotExist(students, name);
            addGradeForExistingStudent(students, name, grade);
        }

        printFinalResult(students);
    }
}
