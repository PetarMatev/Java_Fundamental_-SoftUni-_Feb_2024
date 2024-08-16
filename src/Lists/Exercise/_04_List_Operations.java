package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_List_Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");
        ArrayList<Integer> intList = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] Instruction = command.split(" ");
            if (Instruction.length == 2) {

                if (Instruction[0].equals("Add")) {
                    intList.add(Integer.valueOf(Instruction[1]));

                } else if (Instruction[0].equals("Remove")) {
                    int indextoInsert = Integer.parseInt(Instruction[1]);

                    if (0 > indextoInsert || indextoInsert >= intList.size()) {
                        System.out.println("Invalid index");
                    } else {
                        intList.remove(Integer.parseInt(Instruction[1]));
                    }
                }

            } else {
                int count = Integer.parseInt(Instruction[2]);
                if (Instruction[1].equals("left")) {
                    for (int i = 1; i <= count; i++) {
                        int firstNumber = intList.remove(0);
                        intList.add(firstNumber);
                    }
                } else if ((Instruction[1].equals("right"))) {
                    for (int i = 1; i <= count; i++) {
                        int lastNumber = intList.remove(intList.size() - 1);
                        intList.add(0, lastNumber);
                    }

                } else if (Instruction[0].equals("Insert")) {
                    int indextoInsert = Integer.parseInt(Instruction[2]);

                    if (0 > indextoInsert || indextoInsert >= intList.size()) {
                        System.out.println("Invalid index");
                    } else {
                        intList.add(Integer.parseInt(Instruction[2]), Integer.parseInt(Instruction[1]));
                    }
                }
            }
            command = scan.nextLine();
        }
        for (int item : intList) {
            System.out.printf("%d ", item);
        }
    }
}