package Methods.Lab;

import java.util.Scanner;

public class _04_Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String calcs = scan.nextLine();
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());

        if (calcs.equals("add")) {
            addNums(numOne, numTwo);
        } else if (calcs.equals("multiply")) {
            multiply(numOne, numTwo);
        } else if (calcs.equals("subtract")) {
            subtract(numOne, numTwo);
        } else if (calcs.equals("divide")) {
            divide(numOne, numTwo);
        }

    }

    public static void multiply(int numOne, int numTwo) {
        System.out.println(numOne * numTwo);
    }

    public static void addNums(int numOne, int numTwo) {
        System.out.println(numOne + numTwo);
    }

    public static void subtract(int numOne, int numTwo) {
        System.out.println(numOne - numTwo);
    }

    public static void divide(int numOne, int numTwo) {
        System.out.println(numOne / numTwo);
    }
}
