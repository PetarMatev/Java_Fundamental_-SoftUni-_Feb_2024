package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Magic_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < arr.length; i++) {
            int currentItem = arr[i];
            for (int j = i; j < arr.length - 1; j++) {
                int nextItem = arr[j + 1];

                if ((currentItem + nextItem) == num) {
                    String finalMessage = currentItem + " " + nextItem;
                    System.out.println(finalMessage);
                }
            }
        }
    }
}
