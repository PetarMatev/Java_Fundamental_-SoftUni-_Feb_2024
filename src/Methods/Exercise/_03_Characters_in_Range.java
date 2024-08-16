package Methods.Exercise;

import java.util.Scanner;

public class _03_Characters_in_Range {

    public static StringBuilder rangeASCII(int a, int b) {
        StringBuilder outputLine = new StringBuilder();
        for (int i = a + 1; i < b; i++) {
            outputLine.append((char) i).append(" ");
        }
        return outputLine;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextLine().charAt(0);
        int b = scan.nextLine().charAt(0);

        StringBuilder getOutput;
        if (a > b) {
            getOutput = rangeASCII(b, a);
        } else {
            getOutput = rangeASCII(a, b);
        }
        System.out.println(getOutput);

    }
}
