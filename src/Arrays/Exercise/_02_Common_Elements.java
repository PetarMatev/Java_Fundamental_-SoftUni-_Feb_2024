package Arrays.Exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_Common_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr1 = scan.nextLine().split(" ");
        String[] arr2 = scan.nextLine().split(" ");

        Set<String> set = new HashSet<>(Arrays.asList(arr1));

        for (String element : arr2) {
            if (set.contains(element)) {
                System.out.print(element + " ");
            }
        }

    }
}
