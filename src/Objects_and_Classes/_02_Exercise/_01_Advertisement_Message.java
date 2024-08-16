package Objects_and_Classes._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _01_Advertisement_Message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> phrases = new ArrayList<>(List.of(
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        ));

        // Phrases
        List<String> events = new ArrayList<>(List.of(
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        ));

        // Authors
        List<String> authors = new ArrayList<>(List.of(
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        ));

        // Cities
        List<String> cities = new ArrayList<>(List.of(
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        ));

        ArrayList<List> global = new ArrayList<>();
        global.add(phrases);
        global.add(events);
        global.add(authors);
        global.add(cities);

        int numAdMessages = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numAdMessages; i++) {
            StringBuilder adMessage = new StringBuilder();

            for (List<String> currentList : global) {
                Random rnd = new Random();
                int randomIndex = 1 + rnd.nextInt(currentList.size() - 1);
                adMessage.append(currentList.get(randomIndex)).append(" ");
            }

            System.out.println(adMessage.toString().trim());
        }
    }
}
