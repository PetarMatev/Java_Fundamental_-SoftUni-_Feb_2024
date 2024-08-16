package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> wagons = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        int Capacity = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();
        while (!command.equals("end")) {

            if (command.contains("Add")) {
                Integer num = Integer.parseInt(command.split(" ")[1]);
                wagons.add(num);
            } else {
                int peopleToAdd = Integer.parseInt(command);

                for (int i =0; i< wagons.size(); i++) {
                    int currentWagon = wagons.get(i);

                    if (Capacity >= currentWagon + peopleToAdd) {
                        wagons.set(i, currentWagon+peopleToAdd);
                        break;
                    }
                }
            }
            command = scan.nextLine();
        }
        for(int item : wagons) {
            System.out.printf("%d ", item);
        }
    }
}
