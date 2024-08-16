package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _02_Pounds_to_Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double iput = Double.parseDouble(scan.nextLine());
        final double EXCHANGE_RATE = 1.36;
        System.out.printf("%.3f", iput * EXCHANGE_RATE);
    }
}
