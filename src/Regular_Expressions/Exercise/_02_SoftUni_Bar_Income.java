package Regular_Expressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_SoftUni_Bar_Income {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String negate = "[^|$%.]";
        String regex = "\\%(?<customerName>[A-Z][a-z]+)\\%" + negate + "*\\<(?<product>\\w+)\\>" + negate + "*\\|(?<quantity>\\d+)\\|" + negate + "*?(?<price>\\d+([.]\\d+)?)\\$";
        double totalIncome = 0;

        String command = scan.nextLine();
        while (!command.equals("end of shift")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            while (matcher.find()) {
                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                totalIncome += quantity * price;
                System.out.printf("%s: %s - %.2f\n", customerName, product, quantity * price);
            }

            command = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
