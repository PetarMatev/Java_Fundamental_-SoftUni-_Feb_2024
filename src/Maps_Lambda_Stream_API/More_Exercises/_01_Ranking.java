package Maps_Lambda_Stream_API.More_Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class _01_Ranking {

    public static void printResultForEachStudent(LinkedHashMap<String, LinkedHashMap<String, Integer>> finalBox) {
        LinkedHashMap<String, LinkedHashMap<String, Integer>> result = finalBox.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for(Map.Entry<String, LinkedHashMap<String, Integer>> entry : result.entrySet()) {
            String userName = entry.getKey();
            System.out.println(userName);
            LinkedHashMap<String, Integer> userResults = entry.getValue();

            userResults.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(userEntry -> System.out.printf("#  %s -> %d\n", userEntry.getKey(), userEntry.getValue()));
        }
    }

    public static void printResultForBestCandidate(LinkedHashMap<String, LinkedHashMap<String, Integer>> finalBox) {
        int maxResult = Integer.MIN_VALUE;
        String bestUser = "";
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : finalBox.entrySet()) {
            String userName = entry.getKey();
            LinkedHashMap<String, Integer> userResults = entry.getValue();
            int total = 0;
            for (Map.Entry<String, Integer> entryValue : userResults.entrySet()) {
                int currntScore = entryValue.getValue();
                total += currntScore;
            }
            if (total > maxResult) {
                maxResult = total;
                bestUser = userName;
            }
        }

        System.out.printf("Best candidate is %s with total %d points.\nRanking: \n", bestUser, maxResult);
    }

    public static void addNewUser(LinkedHashMap<String, LinkedHashMap<String, Integer>> finalBox,
                                  LinkedHashMap<String, String> initialBox,
                                  String contest, String password, String name, Integer points) {

        if (initialBox.containsKey(contest)) {
            if (initialBox.get(contest).equals(password)) {
                if (!finalBox.containsKey(name)) {
                    finalBox.put(name, new LinkedHashMap<>());
                    finalBox.get(name).put(contest, points);
                } else {
                    if (finalBox.get(name).containsKey(contest)) {
                        if (points > finalBox.get(name).get(contest)) {
                            finalBox.get(name).replace(contest, points);
                        }
                    } else {
                        finalBox.get(name).put(contest, points);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> initialBox = new LinkedHashMap<>();

        String initialInput = scan.nextLine();
        while (!initialInput.equals("end of contests")) {
            String[] initialInstructions = initialInput.split(":");
            String contest = initialInstructions[0];
            String passwordContest = initialInstructions[1];
            initialBox.putIfAbsent(contest, passwordContest);
            initialInput = scan.nextLine();
        }

        LinkedHashMap<String, LinkedHashMap<String, Integer>> finalBox = new LinkedHashMap<>();

        String finalInput = scan.nextLine();
        while (!finalInput.equals("end of submissions")) {
            String[] finalInstructions = finalInput.split("=>");
            String finalContest = finalInstructions[0];
            String passwordFinalContest = finalInstructions[1];
            String username = finalInstructions[2];
            Integer points = Integer.parseInt(finalInstructions[3]);
            addNewUser(finalBox, initialBox, finalContest, passwordFinalContest, username, points);

            finalInput = scan.nextLine();
        }
        printResultForBestCandidate(finalBox);
        printResultForEachStudent(finalBox);



    }

}
