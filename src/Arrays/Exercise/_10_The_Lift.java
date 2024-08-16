package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _10_The_Lift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numPeople = Integer.parseInt(scan.nextLine());
        String[] wagons = scan.nextLine().split(" ");
        int[] wagonInt = Arrays.stream(wagons).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < wagonInt.length; i++) {

            int currentWagon = wagonInt[i];

            if (currentWagon < 4) {
                int emptySpaces = 4 - currentWagon;

                if (numPeople >= emptySpaces) {
                    wagonInt[i] = 4;
                    numPeople -= emptySpaces;

                } else {
                    wagonInt[i] += numPeople;
                    numPeople = 0;
                }

                if (numPeople == 0) {
                    break;
                }
            }
        }


        int sum = 0;

        for (int i = 0; i < wagonInt.length; i++) {
            sum += wagonInt[i];
        }

        if (numPeople == 0 && 4 * wagonInt.length == sum) {
            for (int i = 0; i < wagonInt.length; i++) {
                System.out.printf("%d ", wagonInt[i]);
            }
        } else if (numPeople == 0) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < wagonInt.length; i++) {
                System.out.printf("%d ", wagonInt[i]);
            }
        } else if (wagonInt.length * 4 == sum) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", numPeople);
            for (int i = 0; i < wagonInt.length; i++) {
                System.out.printf("%d ", wagonInt[i]);
            }
        }
    }
}

