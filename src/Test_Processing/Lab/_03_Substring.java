package Test_Processing.Lab;

import java.util.Scanner;

public class _03_Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstString = scan.nextLine();
        String secondString = scan.nextLine();

        while(secondString.contains(firstString)) {
            int firstIndex = secondString.indexOf(firstString);
            String hello = secondString.substring(firstIndex, secondString.length());
            secondString = secondString.substring(0, firstIndex) + secondString.substring(firstIndex + firstString.length());
            // Then, we construct a new string by combining the substring before the occurrence and the substring after the occurrence (excluding the occurrence itself).
        }

        System.out.println(secondString);
    }
}
