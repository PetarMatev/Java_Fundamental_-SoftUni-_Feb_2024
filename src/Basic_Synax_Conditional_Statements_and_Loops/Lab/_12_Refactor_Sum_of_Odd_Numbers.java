package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _12_Refactor_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", 2 * i + 1);
            sum += 2 * i + 1;
        }

        System.out.printf("Sum: %d%n", sum);
    }
}
