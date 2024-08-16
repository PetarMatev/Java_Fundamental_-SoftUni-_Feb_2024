package Arrays.Exercise;

import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int[] arrOfWagon = new int[num];

        for (int i = 0; i < num; i++) {
            int nextLine = Integer.parseInt(scan.nextLine());
            arrOfWagon[i] = nextLine;
        }

        int sum = 0;

        for (int j = 0; j < num; j++) {
            System.out.printf("%d ", arrOfWagon[j]);
            sum+= arrOfWagon[j];
        }

        System.out.printf("\n%d", sum);
    }
}
