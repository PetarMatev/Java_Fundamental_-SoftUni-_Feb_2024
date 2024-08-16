package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _03_Passed_or_Failed {
    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);

            double input = Double.parseDouble(scan.nextLine());
            if (input >= 3.00) {
                System.out.printf("Passed!", input);
            } else {
                System.out.println("Failed!");
            }
        }
    }

