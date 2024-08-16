package Methods.Lab;

import java.util.Scanner;

public class _02_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printGrade(Double.parseDouble(scan.nextLine()));
    }

    public static void printGrade(double grade) {
        String result = "";
        if (2.00 <= grade && grade <= 2.99) {
            result = "Fail";
        } else if (3.00 <= grade && grade <= 3.49) {
            result = "Poor";
        } else if (3.50 <= grade && grade <= 4.49) {
            result = "Good";
        } else if (4.50 <= grade && grade <= 5.49) {
            result = "Very good";
        } else if (5.50 <= grade && grade <= 6.00) {
            result = "Excellent";
        }
        System.out.println(result);
    }
}
