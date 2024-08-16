package Maps_Lambda_Stream_API.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _07_Legendary_Farming {
    public static void printKeyMaterials(LinkedHashMap<String, Integer> box, String[] keyMaterials) {
        for (int i = 0; i < keyMaterials.length; i++) {
            int quantity = box.getOrDefault(keyMaterials[i], 0);
            String currentMaterial = keyMaterials[i];
            box.entrySet()
                    .stream()
                    .filter(e -> e.getKey().equals(currentMaterial))
                    .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), quantity));

        }
    }

    public static void printRemainingMaterials(LinkedHashMap<String, Integer> box, String[] keyMaterials) {
        box.entrySet().stream()
                .filter(e -> !e.getKey().equals("shards") && !e.getKey().equals("fragments") && !e.getKey().equals("motes"))
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
    }

    public static void collectMaterialsAndQuantity(LinkedHashMap<String, Integer> box, String material, Integer quantity) {
        if (!box.containsKey(material)) {
            box.put(material, quantity);
        } else {
            box.put(material, (box.get(material) + quantity));
        }
    }

    public static void addCompulsoryMaterials(LinkedHashMap<String, Integer> box, String[] keyMaterials) {
        for (int i = 0; i < keyMaterials.length; i++) {
            box.put(keyMaterials[i], 0);
        }
    }

    public static String[] checkIfLegendaryItemIsFarmed(LinkedHashMap<String, Integer> box, String[] keyMaterials) {
        String[] result = new String[2];
        result[1] = "false";
        String[] artifacts = {"Shadowmourne", "Valanyr", "Dragonwrath"};
        for (int i = 0; i < keyMaterials.length; i++) {
            String currentMaterial = keyMaterials[i];
            String currentArtifact = artifacts[i];
            if (box.containsKey(currentMaterial) && box.get(currentMaterial) >= 250) {
                result[0] = currentArtifact;
                result[1] = "true";
                box.put(currentMaterial, box.get(currentMaterial) - 250);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] keyMaterials = {"shards", "fragments", "motes"};
        boolean endOfGame = false;
        LinkedHashMap<String, Integer> box = new LinkedHashMap<>();
        addCompulsoryMaterials(box, keyMaterials);

        while (true) {
            String command = scan.nextLine();
            String[] instructions = command.toLowerCase().split(" ");

            for (int i = 0; i < (instructions.length); i += 2) {
                int quantity = Integer.parseInt(instructions[i]);
                String material = instructions[i + 1];
                collectMaterialsAndQuantity(box, material, quantity);
                String[] result = checkIfLegendaryItemIsFarmed(box, keyMaterials);
                String legendaryItem = result[0];
                String winnerFound = result[1];

                if (winnerFound.equals("true")) {
                    System.out.printf("%s obtained!\n", legendaryItem);
                    endOfGame = true;
                    break;
                }
            }
            if (endOfGame) {
                break;
            }
        }
        printKeyMaterials(box, keyMaterials);
        printRemainingMaterials(box, keyMaterials);
    }
}
