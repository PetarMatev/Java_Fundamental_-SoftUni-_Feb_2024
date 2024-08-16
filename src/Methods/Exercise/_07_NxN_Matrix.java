package Methods.Exercise;

import java.util.Scanner;

public class _07_NxN_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        nxnMatrix(num);
    }

    public static void nxnMatrix(int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == num - 1) {
                    result.append(num).append("\n");
                } else {
                    result.append(num).append(" ");
                }
            }
        }
        System.out.println(result);
    }
}
