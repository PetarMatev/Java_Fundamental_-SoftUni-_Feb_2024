package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _07_Theatre_Promotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int total = 0;

        if (age < 0 || age > 122) {
            System.out.println("Error!");
            return;
        }

        if (day.equals("Weekday")) {
            if (age <= 18) {
                total += 12;
            } else if (age <= 64) {
                total += 18;
            } else {
                total += 12;
            }
        } else if (day.equals("Weekend")) {
            if (age <= 18) {
                total += 15;
            } else if (age <= 64) {
                total += 20;
            } else {
                total += 15;
            }
        } else if (day.equals("Holiday")) {
            if (age <= 18) {
                total += 5;
            } else if (age <= 64) {
                total += 12;
            } else {
                total += 10;
            }
        }
        System.out.printf("%d$", total);
    }
}
