package Regular_Expressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "^>>(?<item>[A-Z][A-Za-z]*)<<(?<price>\\d+(\\.\\d+)?)!(?<quantity>\\d+)";
        double total = 0;
        StringBuilder outputString = new StringBuilder();
        outputString.append("Bought furniture:\n");

        String command = scan.nextLine();
        while (!command.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            while(matcher.find()) {
                String item = matcher.group("item");
                outputString.append(item).append("\n");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                total += (price * quantity);
            }

            command = scan.nextLine();
        }
        System.out.print(outputString);
        System.out.printf("Total money spend: %.2f", total);
    }
}
