package Test_Processing.Exercise;

import java.util.Scanner;

public class _02_Character_Multiplier {

    public static int multiplyString(String wordOne, String wordTwo) {
        int sum = 0;
        int getMin = Math.min(wordOne.length(), wordTwo.length());

        for (int i = 0; i < getMin; i++) {
            sum+= (wordOne.charAt(i) * wordTwo.charAt(i));
        }

        for (int j = getMin; j < wordOne.length(); j++) {
            sum+= wordOne.charAt(j);
        }

        for (int j = getMin; j < wordTwo.length(); j++) {
            sum+= wordTwo.charAt(j);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");
        int result = multiplyString(line[0], line[1]);
        System.out.println(result);
    }
}

