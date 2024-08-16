package Objects_and_Classes._01_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class _01_Randomize_Words {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String[] words = text.split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int randomIndex = i + rnd.nextInt(words.length - 1);

            String temp = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = temp;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}

