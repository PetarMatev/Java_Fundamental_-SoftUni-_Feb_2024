package Arrays.Lab;

import java.util.Scanner;

public class _04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%s ", arr[i]);
        }

    }
}
