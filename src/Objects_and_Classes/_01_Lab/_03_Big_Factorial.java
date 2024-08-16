package Objects_and_Classes._01_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class _03_Big_Factorial {


    public static BigInteger factorialIterative(int n) {

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigInteger factorialResult = factorialIterative(n);
        System.out.println(factorialResult);
    }
}
