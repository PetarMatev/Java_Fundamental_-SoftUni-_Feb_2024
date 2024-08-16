package Maps_Lambda_Stream_API.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _10_SoftUni_Exam_Results {
    public static void addSubmission(LinkedHashMap<String, Integer> submissions, String name) {
        if (!submissions.containsKey(name)) {
            submissions.put(name, 0);
        }
        submissions.put(name, submissions.get(name) + 1);
    }

    public static void addResult(LinkedHashMap<String, LinkedHashMap<String, Integer>> examResults, String name, String language, Integer points) {
        if (!examResults.containsKey(name)) {
            examResults.put(name, new LinkedHashMap<>());
        }
        if (!examResults.get(name).containsKey(language)) {
            examResults.get(name).put(language, 0);
        }
        if (points > examResults.get(name).get(language)) {
            examResults.get(name).put(language, points);
        }
    }

    public static void printOutAllExamResults(LinkedHashMap<String, LinkedHashMap<String, Integer>> examResults) {
        System.out.println("Results:");
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : examResults.entrySet()) {
            String userName = entry.getKey();
            LinkedHashMap<String, Integer> userResult = entry.getValue();
            for (Map.Entry<String, Integer> resultEntry : userResult.entrySet()) {
                Integer userPoints = resultEntry.getValue();
                System.out.printf("%s | %d\n", userName, userPoints);
            }
        }
    }

    public static void printOutAllSubmissions(LinkedHashMap<String, Integer> submissions) {
        System.out.println("Submissions:");
        submissions.entrySet()
                .forEach(s -> System.out.println(s.getKey() + " - " + s.getValue()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Integer>> examResults = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissions = new LinkedHashMap<>();

        String command = scan.nextLine();
        while (!command.equals("exam finished")) {
            String[] instructions = command.split("-");
            int instructionLength = instructions.length;

            if (instructionLength == 2) {
                String name = instructions[0];
                examResults.remove(name);

            } else {
                String name = instructions[0];
                String language = instructions[1];
                Integer points = Integer.parseInt(instructions[2]);
                addSubmission(submissions, language);
                addResult(examResults, name, language, points);
            }


            command = scan.nextLine();
        }
        printOutAllExamResults(examResults);
        printOutAllSubmissions(submissions);
    }
}
