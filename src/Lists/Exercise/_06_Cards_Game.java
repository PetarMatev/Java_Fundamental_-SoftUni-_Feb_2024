package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_Cards_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> firstDeck = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> secondDeck = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));



        while (firstDeck.size() != 0 && secondDeck.size() != 0) {
            Integer cardOne = firstDeck.get(0);
            Integer cardTwo = secondDeck.get(0);

            if (cardOne > cardTwo) {
                firstDeck.add(firstDeck.get(0));
                firstDeck.add(secondDeck.get(0));
                firstDeck.remove(0);
                secondDeck.remove(0);

            } else if (cardTwo > cardOne) {
                secondDeck.add(secondDeck.get(0));
                secondDeck.add(firstDeck.get(0));
                secondDeck.remove(0);
                firstDeck.remove(0);

            } else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }


        if (firstDeck.size() == 0) {
            System.out.printf("Second player wins! Sum: %s", secondDeck.stream().mapToInt(Integer::intValue).sum());
        } else if (secondDeck.size() == 0) {
            System.out.printf("First player wins! Sum: %s", firstDeck.stream().mapToInt(Integer::intValue).sum());
        }


    }
}
