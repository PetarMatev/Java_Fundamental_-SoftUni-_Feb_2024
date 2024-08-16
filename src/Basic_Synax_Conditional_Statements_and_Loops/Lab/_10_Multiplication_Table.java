package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _10_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", input, i, (input * i));
        }
    }
}
