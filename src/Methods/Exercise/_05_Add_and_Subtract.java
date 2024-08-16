package Methods.Exercise;

import java.util.Scanner;

public class _05_Add_and_Subtract {

    public static int sumTwoNums(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int substractThird(int resultSum, int third) {
        return resultSum - third;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());
        int numThree = Integer.parseInt(scan.nextLine());

        int resultSum = sumTwoNums(numOne, numTwo);
        int finalResult = substractThird(resultSum, numThree);

        System.out.println(finalResult);

    }
}
