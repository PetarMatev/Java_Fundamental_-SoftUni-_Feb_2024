package Maps_Lambda_Stream_API.More_Exercises;

import java.util.*;

public class _02_Judge {

    public static void addUser(LinkedHashMap<String, LinkedHashMap<String, Integer>> judge, String name, String contest, Integer score) {

        if(!judge.containsKey(contest)) {
            judge.put(contest, new LinkedHashMap<>());
        }

        if (!judge.get(contest).containsKey(name)) {
            judge.get(contest).put(name, score);
        } else {
            if (score > judge.get(contest).get(name)) {
                judge.get(contest).put(name, score);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Integer>> judge = new LinkedHashMap<>();
        String command = scan.nextLine();
        while(!command.equals("no more time")) {
            String[] info = command.split(" -> ");
            String name = info[0];
            String contest = info[1];
            Integer score = Integer.parseInt(info[2]);
            addUser(judge, name, contest, score);

            command = scan.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : judge.entrySet()) {
            String course = entry.getKey();
            int num = entry.getValue().size();
            System.out.printf("%s: %d participants\n", course, num);
            LinkedHashMap<String, Integer> currentValue = entry.getValue();

            // Create a list of entries from the map
            List<Map.Entry<String, Integer>> entries = new ArrayList<>(currentValue.entrySet());

            // Sort the entries by points in descending order, then by name in ascending order
            Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                    int pointsComparison = entry2.getValue().compareTo(entry1.getValue());
                    return (pointsComparison == 0) ? entry1.getKey().compareTo(entry2.getKey()) : pointsComparison;
                }
            });

            int counter = 1;
            for (Map.Entry<String, Integer> sortedEntry : entries) {
                String name = sortedEntry.getKey();
                int userPoints = sortedEntry.getValue();
                System.out.printf("%d. %s -> %d\n", counter, name, userPoints);
                counter++;
            }
        }

        System.out.println("Individual standings:");


    }
}
