package Methods.Exercise;

import java.util.Scanner;

public class _06_Middle_Character {


    public static String getMiddleChar(String text) {
        StringBuilder result = new StringBuilder();
        int middleIndex  = text.length() / 2;
        if (text.length() % 2 == 0) {
            result.append(text.charAt(middleIndex  - 1));
            result.append(text.charAt(middleIndex ));
        } else {
            result.append(text.charAt(middleIndex ));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String result = getMiddleChar(text);
        System.out.println(result);
    }
}
