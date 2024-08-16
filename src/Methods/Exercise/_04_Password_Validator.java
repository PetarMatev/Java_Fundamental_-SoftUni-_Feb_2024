package Methods.Exercise;

import java.util.Scanner;

public class _04_Password_Validator {

    public static boolean validateNumChars(String input) {
        int numChars = input.length();
        return 6 <= numChars && numChars <= 10;
    }

    public static boolean validateInputType(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateNumDigits(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                counter++;
            }
        }

        return counter >= 2;
    }


    public static String PasswordValidator(String input) {
        StringBuilder result = new StringBuilder();

        if (!(validateNumChars(input) && validateInputType(input) && validateNumDigits(input))) {
            if (!validateNumChars(input)) {
                result.append("Password must be between 6 and 10 characters").append("\n");
            }
            if (!validateInputType(input)) {
                result.append("Password must consist only of letters and digits").append("\n");
            }
            if (!validateNumDigits(input)) {
                result.append("Password must have at least 2 digits");
            }
        } else {
            result.append("Password is valid");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String validatePassword = PasswordValidator(input);
        System.out.println(validatePassword);

    }
}
