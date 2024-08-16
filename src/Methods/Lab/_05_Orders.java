package Methods.Lab;

import java.util.Scanner;

public class _05_Orders {
    public static void totalPriceOfOrder(double price, int quantity) {
        System.out.printf("%.2f", price * quantity);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        switch (item) {
            case "coffee":
                double coffee = 1.50;
                totalPriceOfOrder(coffee, quantity);
                break;
            case "water":
                double water = 1.00;
                totalPriceOfOrder(water, quantity);
                break;
            case "coke":
                double coke = 1.40;
                totalPriceOfOrder(coke, quantity);
                break;
            case "snacks":
                double snacks = 2.00;
                totalPriceOfOrder(snacks, quantity);
                break;
        }
    }
}
