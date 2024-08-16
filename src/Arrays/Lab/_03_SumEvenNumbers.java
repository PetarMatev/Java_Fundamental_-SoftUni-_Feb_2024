package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int nextNum = numbers[i];
            if (nextNum % 2 == 0) {
                sum+= nextNum;
            }
        }
        System.out.println(sum);
    }
}
