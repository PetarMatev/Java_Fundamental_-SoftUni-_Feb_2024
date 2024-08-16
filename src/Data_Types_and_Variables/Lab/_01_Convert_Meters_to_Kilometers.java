package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _01_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", (double) input / 1000);

    }
}
