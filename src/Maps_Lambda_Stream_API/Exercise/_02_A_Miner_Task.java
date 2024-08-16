package Maps_Lambda_Stream_API.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class _02_A_Miner_Task {

    public static void addToCollection(LinkedHashMap<String, Integer> collection, String resources, Integer quantity) {
        if (!collection.containsKey(resources)) {
            collection.put(resources, 0);
        }
        collection.put(resources, collection.get(resources) + quantity);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        LinkedHashMap<String, Integer> collection = new LinkedHashMap<>();

        while(!command.equals("stop")) {
        String resource = command;
        Integer quantity = Integer.parseInt(scan.nextLine());
        addToCollection(collection, resource, quantity);
        command = scan.nextLine();
        }

        collection.entrySet().forEach(e-> System.out.printf("%s -> %d\n", e.getKey(), e.getValue()));
    }
}
