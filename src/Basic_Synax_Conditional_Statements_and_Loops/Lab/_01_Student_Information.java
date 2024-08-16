package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _01_Student_Information {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String student_name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double average_grade = Double.parseDouble(scan.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", student_name, age, average_grade);

    }
}
