package Maps_Lambda_Stream_API.Exercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Count_Chars_in_a_String {

    public static LinkedHashMap newMap(String input) {
        LinkedHashMap<Character, Integer> newMap = new LinkedHashMap<>();
        for (int i=0; i < input.length(); i++) {
            char CurrentItem = input.charAt(i);
            if (!newMap.containsKey(CurrentItem)) {
                newMap.put(CurrentItem, 0);
            }
            newMap.put(CurrentItem, newMap.get(CurrentItem) + 1);
        }
        return newMap;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<Character, Integer> newMapping = newMap(input);

        newMapping.entrySet()
                .stream()
                .filter(e -> !e.getKey().equals(' '))
                .forEach(e -> System.out.printf("%s -> %d%n", e.getKey(), e.getValue()));
    }
}
