package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _09_Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = Integer.parseInt(scan.nextLine());

        double y = c * 100;
        double d = y * 365.2422;
        double h = d * 24;
        double m = h * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", c, y, d, h, m);
    }
}
