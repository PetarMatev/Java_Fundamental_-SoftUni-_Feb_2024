package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _06_Chars_to_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        System.out.printf("%s", a + b + c);
    }
}
