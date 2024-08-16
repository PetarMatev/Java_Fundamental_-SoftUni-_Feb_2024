package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Equal_Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
        boolean ItemHasNotBeenFound = true;
        int successfulResult = 0;


        for (int item = 0; item < arr.length; item++) {

            int currentIndex = item;

            int sumElementsRight = 0;
            for (int i = currentIndex; i < arr.length - 1; i++) {
                int followingIndex = arr[i + 1];
                sumElementsRight += followingIndex;
            }

            int sumElementsLeft = 0;
            for (int i = currentIndex; i >0; i--) {
                int followingIndex = arr[i - 1];
                sumElementsLeft += followingIndex;
            }

            if (sumElementsRight == sumElementsLeft) {
                successfulResult = currentIndex;
                ItemHasNotBeenFound = false;
                break;
            }



        }

        if (ItemHasNotBeenFound) {
            System.out.println("no");
        } else {
            System.out.println(successfulResult);
        }

    }
}
