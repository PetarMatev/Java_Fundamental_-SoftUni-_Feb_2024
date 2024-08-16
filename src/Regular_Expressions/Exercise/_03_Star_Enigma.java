package Regular_Expressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_Star_Enigma {

    public static int getCounter(String command) {
        int counter = 0;
        for (int j = 0; j < command.length(); j++) {
            char currentChar = Character.toLowerCase(command.charAt(j));
            if (currentChar == 's' || currentChar == 't' || currentChar == 'a' || currentChar == 'r') {
                counter++;
            }
        }
        return counter;
    }

    public static String getUpdatedWord(String command, int counter) {
        StringBuilder word = new StringBuilder();
        for (int v = 0; v < command.length(); v++) {
            char currChar = command.charAt(v);
            int newASCII = (int) currChar - counter;
            char updatedChar = (char) newASCII;
            word.append(updatedChar);
        }
        return word.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String regex = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>A|D)![^@\\-!:>]*->(?<soldierCount>\\d+)";
        LinkedHashMap<String, List<String>> planets = new LinkedHashMap<>();
        planets.put("A", new ArrayList<>());
        planets.put("D", new ArrayList<>());

        for (int i = 0; i < num; i++) {
            String command = scan.nextLine();
            int counter = getCounter(command);
            String updatedWord = getUpdatedWord(command, counter);
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(updatedWord);
            while (matcher.find()) {
                String planet = matcher.group("planet");
                String attackType = matcher.group("attackType");
                List<String> planetList = planets.get(attackType);
                planetList.add(planet);

                planets.put(attackType, planetList);
            }
        }

        for (Map.Entry<String, List<String>> entry : planets.entrySet()) {
            String key = entry.getKey();
            List<String> planetList = entry.getValue();
            int size = planetList.size();
            Collections.sort(planetList);
            if (key.equals("A")) {
                System.out.println("Attacked planets: " + entry.getValue().size());
            } else {
                System.out.println("Destroyed planets: " + entry.getValue().size());
            }
            if (size > 0) {
                for (String planet : planetList) {
                    System.out.println("-> " + planet);
                }
            }
        }
    }
}
