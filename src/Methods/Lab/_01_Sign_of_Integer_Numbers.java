package Methods.Lab;

import java.util.Scanner;

public class _01_Sign_of_Integer_Numbers {

    public static void signOfInteger(int number) {

        if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        signOfInteger(Integer.parseInt(scan.nextLine()));
    }
}
