package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _10_Special_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sumDigits = 0;

        for (int i = 1; i <= num; i ++) {

            int currentNum = i;

            while (currentNum > 0) {
                sumDigits += currentNum % 10;
                currentNum = currentNum / 10;
            }

            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
            sumDigits = 0;
        }
    }
}
