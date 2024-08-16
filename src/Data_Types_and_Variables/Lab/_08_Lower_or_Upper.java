package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _08_Lower_or_Upper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        boolean isLower = input.equals(input.toLowerCase());

        if (isLower) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
