package Test_Processing.Lab;

import java.util.Scanner;

public class _05_Digits_LettersandOtherList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder characters = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {

            char item = text.charAt(i);

            if (Character.isDigit(item)) {
                digits.append(item);
            } else if (Character.isLetter(item)) {
                letters.append(item);
            } else {
                characters.append(item);
            }
        }

        System.out.printf("%s\n%s\n%s", digits, letters, characters);
    }
}
