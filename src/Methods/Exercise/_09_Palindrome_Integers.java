package Methods.Exercise;

import java.util.Scanner;

public class _09_Palindrome_Integers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while (!command.equals("END")) {
            int number = Integer.parseInt(command);
            checkIfPalindrome(number);
            command = scan.nextLine();
        }
    }

    public static void checkIfPalindrome(int number) {
        String backwardString = Integer.toString(number);
        int reversedNumber = getReversedNum(backwardString);
        System.out.println(number == reversedNumber);
    }


    public static int getReversedNum(String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        return Integer.parseInt(newString.toString());
    }
}
