package Arrays.Lab;

import java.util.Scanner;

public class _02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int[] nums =  new int[num];

        for (int i=0; i < num; i++) {

            int nextItem = Integer.parseInt(scan.nextLine());
            nums[i] = nextItem;
        }

        for (int j = (nums.length - 1); j >= 0; j--) {
            String itemToPrint = nums[j] + " ";
            System.out.print(itemToPrint);
        }



    }
}
