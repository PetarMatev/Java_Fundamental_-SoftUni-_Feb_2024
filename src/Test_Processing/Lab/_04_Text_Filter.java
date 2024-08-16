package Test_Processing.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04_Text_Filter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(", ");
        String[] text = scan.nextLine().split(", ");
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            if (i == text.length - 1 ) {
                newText.append(text[i]);
            } else {
                newText.append(text[i]).append(", ");
            }
        }

        for (String currentWord : words) {
            int index = newText.indexOf(currentWord);
            while (index != -1) {
                newText.replace(index, index + currentWord.length(), "*".repeat(currentWord.length()));
                index = newText.indexOf(currentWord, index + 1); // Move to the next occurrence
            }
        }

        System.out.println(newText);
    }
}
