package Objects_and_Classes._02_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class _04_Students {

    public static class Student {
        private String firstName;
        private String lastName;
        private double grade;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
    }

    public static List<Student> orderedDescending(List<Student> orderedDescending) {
        List<Student> ordered = orderedDescending.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade)
                        .reversed())
                .collect(Collectors.toList());
        return ordered;
    }

    public static void printStudents(List<Student> orderedList) {
        StringBuilder finalPrint = new StringBuilder();
        for (Student student : orderedList) {
            finalPrint.append(student.getFirstName())
                    .append(" ").append(student.getLastName())
                    .append(": ").append(String.format("%.2f", student.getGrade()))
                    .append("\n");
        }
        System.out.println(finalPrint.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            String[] command = scan.nextLine().split(" ");
            String firstName = command[0];
            String lastName = command[1];
            double grade = Double.parseDouble(command[2]);

            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setGrade(grade);
            students.add(student);

        }

        List<Student> orderedStudents = orderedDescending(students);
        printStudents(orderedStudents);

    }
}
