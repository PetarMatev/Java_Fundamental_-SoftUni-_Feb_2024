package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _09_Array_Modifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scan.nextLine();
        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int PartOne = Integer.parseInt((command.split(" "))[1]);
                int PartTwo = Integer.parseInt((command.split(" "))[2]);

                int secureIndex1 = arr[PartOne];
                int secureIndex2 = arr[PartTwo];
                arr[PartOne] = secureIndex2;
                arr[PartTwo] = secureIndex1;

            } else if (command.contains("multiply")) {
                int PartOne = Integer.parseInt((command.split(" "))[1]);
                int PartTwo = Integer.parseInt((command.split(" "))[2]);

                int product = arr[PartOne] * arr[PartTwo];
                arr[PartOne] = product;

            } else if (command.contains("decrease")) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] -= 1;
                }
            }
            command = scan.nextLine();
        }

        String[] arrStrings = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        String result = String.join(", ", arrStrings);
        System.out.println(result);
    }
}

