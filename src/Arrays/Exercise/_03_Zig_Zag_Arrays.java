package Arrays.Exercise;

import java.util.Scanner;

public class _03_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        for (int i = 0; i < num; i++) {
            String[] currentItems = scan.nextLine().split(" ");
            int currentItemOne = Integer.parseInt((currentItems[0]));
            int currentItemTwo = Integer.parseInt((currentItems[1]));
            if (i % 2 == 0) {
                arr1[i] = currentItemOne;
                arr2[i] = currentItemTwo;
            } else {
                arr1[i] = currentItemTwo;
                arr2[i] = currentItemOne;
            }
        }
        for (int j = 0; j < num; j++) {
            System.out.printf("%d ", arr1[j]);
        }
        System.out.println();
        for (int v = 0; v < num; v++) {
            System.out.printf("%d ", arr2[v]);
        }
    }
}
