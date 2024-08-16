package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Top_Integers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder toPrint = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            int currentItem = arr[j];
            boolean isNotBigger = false; // Reset for each currentItem

            for (int i = j + 1; i < arr.length; i++) {
                int itemToCompare = arr[i];
                if (currentItem <= itemToCompare) {
                    isNotBigger = true;
                    break;
                }
            }
            if (!isNotBigger) {
                toPrint.append(currentItem).append(" ");
            }
        }
        System.out.println(toPrint.toString().trim());
    }
}