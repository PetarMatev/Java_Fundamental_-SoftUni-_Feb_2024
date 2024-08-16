package Objects_and_Classes._01_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_Students {


    static class Student {
        // fields
        private String firstName;
        private String lastName;
        private int age;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        private String town;

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

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String command = scan.nextLine();
        while (!command.equals("end")) {
            String[] instructions = command.split(" ");
            Student student = new Student(instructions[0], instructions[1], Integer.parseInt(instructions[2]), instructions[3]);
            students.add(student);
            command = scan.nextLine();
        }

        String cityName = scan.nextLine();
        List<Student> filterOnTown = students.stream().filter(e -> e.getTown().equals(cityName))
                .collect(Collectors.toList());

        for (Student currentStudent : filterOnTown) {
            System.out.printf("%s %s is %d years old\n", currentStudent.getFirstName(), currentStudent.getLastName(), currentStudent.getAge());
        }
    }
}
