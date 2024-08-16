package Methods.Lab;

import java.util.Scanner;

public class _08_Math_Power {

    public static double calcNumOnPowerOf(int number, int power) {
        return Math.pow(number, power);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        Double value = calcNumOnPowerOf(number, power);
        System.out.printf("%.0f", value);

    }
}
