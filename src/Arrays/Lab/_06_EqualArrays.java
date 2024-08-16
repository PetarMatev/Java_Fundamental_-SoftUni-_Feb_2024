package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int arr1L = arr1.length;

        boolean differenceExists = false;


        for (int i = 0; i < arr1L; i++) {

            int currentItemArr1 = arr1[i];
            int currentItemArr2 = arr2[i];

            if (currentItemArr1 != currentItemArr2) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                differenceExists = true;
                break;
            }
        }



        if (!differenceExists) {
            System.out.printf("Arrays are identical. Sum: %d", Arrays.stream(arr1).sum());
        }


    }
}
