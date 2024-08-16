package Test_Processing.Lab;

import java.util.Scanner;

public class _01_Reverse_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        while(!command.equals("end")) {

            char[] chars = command.toCharArray();
            StringBuilder reversed = new StringBuilder();
            for (int i = chars.length - 1; i >= 0; i--) {
                reversed.append(chars[i]);            }
            System.out.printf("%s = %s\n", command, reversed);

            command = scan.nextLine();
        }
    }
}
