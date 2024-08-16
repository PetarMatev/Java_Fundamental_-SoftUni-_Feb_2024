package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _04_Time_After_30_Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int hoursIntoMinutes = hours * 60;
        int TotalMinutes = minutes + hoursIntoMinutes;
        int TotalMinutesPlus30 = TotalMinutes + 30;

        int getHours = TotalMinutesPlus30 / 60;
        int getMinutes = TotalMinutesPlus30 % 60;

        if (getHours >= 24) {
            getHours = 0;
        }

        if (getMinutes < 10) {
            System.out.printf("%d:0%d", getHours, getMinutes);
        } else {
            System.out.printf("%d:%d", getHours, getMinutes);
        }

    }
}
