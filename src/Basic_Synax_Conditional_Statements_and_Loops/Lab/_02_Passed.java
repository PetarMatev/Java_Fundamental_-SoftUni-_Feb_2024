package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _02_Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());
        if (input >= 3.00) {
            System.out.printf("Passed!", input);
        }
    }
}
