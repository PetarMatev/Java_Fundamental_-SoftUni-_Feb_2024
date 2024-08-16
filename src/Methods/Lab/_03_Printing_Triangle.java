package Methods.Lab;

import java.util.Scanner;

public class _03_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printTriangle(Integer.parseInt(scan.nextLine()));
    }


    public static void printTriangle(int number) {

        for (int i = 1; i <= number; i++) {
            StringBuilder textLine = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                textLine.append(j).append(" ");
            }
            System.out.println(textLine);
        }

        for (int i = number - 1; i >= 1; i--) {
            StringBuilder textLine = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                textLine.append(j).append(" ");
            }
            System.out.println(textLine);
        }
    }
}
