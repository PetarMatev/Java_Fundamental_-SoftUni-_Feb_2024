package Test_Processing.Lab;

import java.util.Scanner;

public class _02_Repeat_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] listItems = scan.nextLine().split("\\s+");
        StringBuilder concat = new StringBuilder();

        for (int i = 0; i < listItems.length; i++) {

            String currentItem = listItems[i];
            int length = currentItem.length();
            for (int n = 0; n < length; n++) {
                concat.append(currentItem);
            }
        }

        System.out.println(concat);

    }
}
