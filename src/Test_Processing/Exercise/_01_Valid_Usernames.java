package Test_Processing.Exercise;

import java.util.Scanner;

public class _01_Valid_Usernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] text = scan.nextLine().split(", ");
        for (String currentWord : text) {

            boolean isValidUsername = true;

            if (3 <= currentWord.length() && currentWord.length() <= 16) {
                for (int j = 0; j < currentWord.length(); j++) {
                    char currentChar = currentWord.charAt(j);

                    // if letter is different from a etters, numbers, hyphens, or underscores
                    boolean isLetterOrSpecialCharacter = !(Character.isDigit(currentChar) || Character.isLetter(currentChar) || currentChar == '-' || currentChar == '_');

                    if (isLetterOrSpecialCharacter) {
                        isValidUsername = false;
                        break;
                    }
                }

                if (isValidUsername) {
                    System.out.println(currentWord);
                }
            }
        }
    }
}
