package Methods.Lab;

import java.util.Scanner;

public class _06_Calculate_Rectangle_Area {

    public static double calcRectangleArea(double width, double length) {
        return width * length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double area = calcRectangleArea(width, length);

        System.out.printf("%.0f", area);
    }
}
