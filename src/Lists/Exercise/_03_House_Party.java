package Lists.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_House_Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        ArrayList<String> participants = new ArrayList<>();


        for (int i = 1; i <= num; i++) {
            String command = scan.nextLine();
            String name = command.split(" ")[0];

            if (command.contains("not")) {
                if (participants.contains(name)) {
                    participants.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            } else {

                if (participants.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    participants.add(name);
                }
            }
        }
        for(String name : participants) {
            System.out.println(name);
        }
    }
}
