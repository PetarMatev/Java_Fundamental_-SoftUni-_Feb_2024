package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_Change_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        ArrayList<Integer> arrOfIntegers = new ArrayList<>(Arrays.stream(text.split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

        String command = scan.nextLine();
        while (!command.equals("end")) {

            if (command.contains("Delete")) {
                int itemToDelete = Integer.parseInt(command.split(" ")[1]);
                for (int i = 0; i < arrOfIntegers.size(); i++) {
                    if (arrOfIntegers.get(i) == itemToDelete) {
                        arrOfIntegers.remove(i);
                    }

                }

            } else if (command.contains("Insert")) {
                int itemToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                arrOfIntegers.add(index, itemToInsert);
            }

        command = scan.nextLine();
        }
        for(int item : arrOfIntegers) {
            System.out.printf("%d ", item);
        }
    }
}
