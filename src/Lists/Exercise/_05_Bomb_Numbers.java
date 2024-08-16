package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] text = scan.nextLine().split(" ");
        ArrayList<Integer> detonations = new ArrayList<>(Arrays.stream(text).map(Integer::parseInt).collect(Collectors.toList()));
        int[] ints = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int specialNumber = ints[0];
        int range = ints[1];
        ArrayList<Integer> container = new ArrayList<>();

        for (int i = 0; i < detonations.size(); i++) {

            int CurrentItem = detonations.get(i);

            if (specialNumber == CurrentItem) {
                int getIndexOfCurrentValue = detonations.indexOf(specialNumber);
                for (int j = 0; j < range; j++) {

                    int previousIndex = getIndexOfCurrentValue - 1 - j;
                    if (previousIndex >= 0) {
                        container.add(previousIndex);
                    }
                }

                int getindex = detonations.indexOf(specialNumber);
                for (int v = 0; v < range; v++) {
                    int followingIndex = getindex + 1 + v;
                    if (followingIndex < detonations.size()) {
                        container.add(followingIndex);
                    }
                }

                container.add(detonations.indexOf(specialNumber));
            }
        }
        Collections.sort(container);
        for (int i = container.size(); i > 0; i--) {
            detonations.remove(i);
        }
        int sum = detonations.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
