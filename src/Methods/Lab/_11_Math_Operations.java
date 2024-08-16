package Methods.Lab;

import java.util.Scanner;

public class _11_Math_Operations {

    public static double multiplyTwoNums(Integer numOne, Integer numTwo) {
        return numOne * numTwo;
    }

    public static double addTwoNums(Integer numOne, Integer numTwo) {
        return numOne + numTwo;
    }

    public static double divideTwoNums(Integer numOne, Integer numTwo) {
        return (double) numOne / numTwo;
    }

    public static double subtractTwoNums(Integer numOne, Integer numTwo) {
        return numOne - numTwo;
    }

    public static double mathOperation(Integer numOne, String operator, Integer numTwo) {
        double mathResult = 0;
        if (operator.equals("*")) {
            mathResult = multiplyTwoNums(numOne, numTwo);
        } else if (operator.equals("-")) {
            mathResult = subtractTwoNums(numOne, numTwo);
        } else if (operator.equals("+")) {
            mathResult = addTwoNums(numOne, numTwo);
        } else if (operator.equals("/")) {
            mathResult = divideTwoNums(numOne, numTwo);
        }
        return mathResult;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNum = Integer.parseInt(scan.nextLine());
        double outcome = mathOperation(firstNum, operator, secondNum);

        System.out.printf("%.0f", outcome);
    }
}
