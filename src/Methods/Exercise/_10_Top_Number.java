package Methods.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class _10_Top_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num = Integer.parseInt(scan.nextLine());

        for (Object eachItem : returnTopNumber(num)) {
            System.out.println(eachItem);
        }
    }

    public static ArrayList returnTopNumber(Integer num) {
        ArrayList<Integer> listOfItems = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (holdsOddDigit(i) && divisibleByEight(i)){
                listOfItems.add(i);
            }
        }

        return listOfItems;
    }

    public static boolean divisibleByEight(int number) {
        String numToString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numToString.length(); i++) {
            sum += numToString.charAt(i);
        }

        return sum % 8 == 0;
    }

    public static boolean holdsOddDigit(int number) {
        String numToString = Integer.toString(number);
        int counter = 0;
        for (int i = 0; i < numToString.length(); i++) {
            if (numToString.charAt(i) % 2 != 0) {
                counter ++;
            }
        }

        return counter > 0;
    }
}