package Maps_Lambda_Stream_API.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Word_Filter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split(" ");

        Arrays.stream(text)
                .filter(e -> e.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
