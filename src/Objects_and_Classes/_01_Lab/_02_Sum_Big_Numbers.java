package Objects_and_Classes._01_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger newInt = new BigInteger(scan.nextLine());
        BigInteger secondInt = new BigInteger(scan.nextLine());

        BigInteger sum = newInt.add(secondInt);
        System.out.println(sum);
    }
}
