package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _07_Reversed_Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.nextLine().charAt(0);
        String b = scan.nextLine();
        String c = scan.nextLine();

        String text = a + " " + b + " " + c;
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);
    }
}
