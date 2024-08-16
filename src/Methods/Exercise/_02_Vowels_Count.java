package Methods.Exercise;

import java.util.Scanner;

public class _02_Vowels_Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();

        System.out.println(countVowels(word));
    }


    public static Integer countVowels(String word) {
        Integer counter = 0;

       for (int i = 0 ; i < word.length(); i++) {
           char ch = word.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               counter++;
           }
       }

        return counter;
    }
}
