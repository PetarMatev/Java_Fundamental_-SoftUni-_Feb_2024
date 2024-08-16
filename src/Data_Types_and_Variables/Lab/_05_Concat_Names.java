package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _05_Concat_Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();
        String delimiter = scan.nextLine();

        String combined = "" + nameOne + delimiter + nameTwo;

                System.out.printf("%s", combined);

    }
}
