package Maps_Lambda_Stream_API.Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _03_Orders {

    public static void addToCollection(LinkedHashMap<String, double[]> collection, String name, double price, double quantity) {
        if (!collection.containsKey(name)) {
            double[] value = {price, quantity};
            collection.put(name, value);

        } else {
            double[] value = collection.get(name);

            double old_price = value[0];
            double old_quantity = value[1];

            if (old_price != price) {
                old_price = price;
            }

            old_quantity += quantity;

            double[] updatedValue = {old_price, old_quantity};
            collection.put(name, updatedValue);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, double[]> collection = new LinkedHashMap<>();
        String command = scan.nextLine();
        while (!command.equals("buy")) {
            String name = command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            double quantity = Double.parseDouble(command.split(" ")[2]);
            addToCollection(collection, name, price, quantity);
            command = scan.nextLine();
        }

        collection.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value[0] * value[1]));
    }
}
