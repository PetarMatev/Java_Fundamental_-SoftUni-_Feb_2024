package Arrays.Lab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int givenInput = Integer.parseInt(scan.nextLine());

        if (givenInput >= 1 && givenInput <= 7) {
            int day = givenInput - 1;
            System.out.printf("%s", firstArray[day]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
