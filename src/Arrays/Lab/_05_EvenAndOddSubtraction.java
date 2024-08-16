package Arrays.Lab;

import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.stream;

public class _05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumOdd = 0;
        int sumEven = 0;

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {

            int currentNum = arr[i];

            if (currentNum % 2 == 0) {
                sumEven += currentNum;
            } else {
                sumOdd += currentNum;
            }

        }

        int difference = sumEven - sumOdd;
        System.out.println(difference);

    }
}
