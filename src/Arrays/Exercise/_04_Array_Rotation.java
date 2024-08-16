package Arrays.Exercise;

import java.util.Scanner;

public class _04_Array_Rotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");
        int num = Integer.parseInt(scan.nextLine());

        for (int j = 0; j < num; j++) {
            String storeFirstNum = arr[0];

            for (int item = 0; item < arr.length - 1; item++) {
                arr[item] = arr[item + 1];
            }
            arr[arr.length-1] = storeFirstNum;
        }
        for(String item : arr) {
            System.out.printf("%s ", item);
        }
    }
}
