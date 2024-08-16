package Methods.Exercise;

import java.util.Scanner;

public class _08_Factorial_Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());

        long resultOne = factorial(numOne);
        long resultTwo = factorial(numTwo);
        divisionTwoNums(resultOne, resultTwo);
    }

    public static void divisionTwoNums(long one, long two) {
        System.out.printf("%.2f", (double) one / two);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
