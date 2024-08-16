package Regular_Expressions.Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_Match_Phone_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Pattern regex = Pattern.compile("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b");
        Matcher matcher = regex.matcher(input);
        List<String> matchedPhones = new LinkedList<>();

        while(matcher.find()) {
            matchedPhones.add(matcher.group());
        }

        System.out.println(String.join(", ", matchedPhones));
    }
}
