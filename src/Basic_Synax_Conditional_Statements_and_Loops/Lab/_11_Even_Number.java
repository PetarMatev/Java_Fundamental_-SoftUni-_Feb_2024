package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _11_Even_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        while (input % 2 != 0) {
            System.out.println("Please write an even number");
            input = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(input));
    }
}
