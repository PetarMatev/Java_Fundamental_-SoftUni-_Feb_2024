package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _09_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;


        for (int i=1; i<= 100; i++) {

            if (i % 2 != 0) {
                sum+= i;
                num --;
                System.out.printf("%d\n", i);
            }

            if (num == 0) {
                break;
            }
        }


        System.out.printf("Sum: %d", sum);

    }
}
