package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _12_Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int total = 0;
        boolean isSpecialNum = false;
        for (int i = 1; i <= num; i++) {
            int currentNum = i;
            while (currentNum > 0) {
                total += currentNum % 10;
                currentNum = currentNum / 10;
            }

            isSpecialNum = (total == 5) || (total == 7) || (total == 11);
            System.out.printf("%d -> %s\n", i, isSpecialNum ? "True" : "False");
            total = 0;
        }
    }
}
