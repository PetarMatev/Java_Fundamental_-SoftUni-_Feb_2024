package Methods.Lab;

import java.util.Scanner;

public class _10_Multiply_Evens_by_Odds {

    public static int sumEvenNumbers(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            int nextItem = Integer.parseInt(String.valueOf(text.charAt(i)));
            if (nextItem% 2 == 0) {
                sum += nextItem;
            }
        }
        return sum;
    }

    public static int sumOddNumbers(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            int nextItem = Integer.parseInt(String.valueOf(text.charAt(i)));
            if (nextItem % 2 != 0) {
                sum += nextItem;
            }
        }
        return sum;
    }

    public static int multiplyEvenByOdd(String text) {
        int sumEvens = sumEvenNumbers(text);
        int sumOdds = sumOddNumbers(text);

        return sumEvens * sumOdds;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer parseValue = Math.abs(Integer.parseInt(scan.nextLine()));
        Integer getValue = multiplyEvenByOdd(String.valueOf(parseValue));
        System.out.println(getValue);
    }
}
