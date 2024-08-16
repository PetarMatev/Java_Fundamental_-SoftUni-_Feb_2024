package Methods.Lab;

import java.util.Scanner;

public class _07_Repeat_String {

    public static StringBuilder repeatCountN(String line, Integer num) {

        StringBuilder stringLine = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringLine.append(line);
        }
        return stringLine;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        int numRepeat = Integer.parseInt(scan.nextLine());

        StringBuilder repeated = repeatCountN(line, numRepeat);
        System.out.println(repeated);

    }
}
