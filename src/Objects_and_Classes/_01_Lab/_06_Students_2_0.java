package Objects_and_Classes._01_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_Students_2_0 {


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

        public Student() {

        }

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


    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        boolean notIdentified = false;

        String command = scan.nextLine();
        while (!command.equals("end")) {
            String[] instructions = command.split(" ");

            String firstName = instructions[0];
            String lastName = instructions[1];
            int studentAge = Integer.parseInt(instructions[2]);
            String town = instructions[3];

            Student student = students
                    .stream()
                    .filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName))
                    .findFirst()
                    .orElse(null);

            if (student == null) {
                Student studentToAll = new Student();
                studentToAll.setFirstName(firstName);
                studentToAll.setLastName(lastName);
                studentToAll.setAge(studentAge);
                studentToAll.setTown(town);
                students.add(studentToAll);

//                Student studentAll = new Student(firstName, lastName, studentAge, town);
//                students.add(studentAll);


            } else {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(studentAge);
                student.setTown(town);
            }
//            if (isStudentExisting(students, firstName, lastName)) {
//                Student student = getStudent(students, firstName, lastName);
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(studentAge);
//                student.setTown(town);
//
//            } else {
//                Student student = new Student(firstName, lastName, studentAge, town);
//                students.add(student);
//            }
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
