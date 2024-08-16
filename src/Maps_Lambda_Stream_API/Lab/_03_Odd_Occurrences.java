package Maps_Lambda_Stream_API.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_Odd_Occurrences {

    public static String[] toLowerLetters(String[] text) {

        String[] newList = Arrays.stream(text)
                .map(e -> e.toLowerCase())
                .toArray(size -> new String[size]);
        return newList;
    }

    public static LinkedHashMap fillTheLinkeHashMap(String[] words) {
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (String item : words) {
            if (!result.containsKey(item)) {
                result.putIfAbsent(item, 0);
            }
            result.put(item, result.get(item) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split(" ");
        String[] toLowerLetters = toLowerLetters(text);
        LinkedHashMap<String, Integer> words = fillTheLinkeHashMap(toLowerLetters);

        String results = words.entrySet().stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(e -> e.getKey())
                .collect(Collectors.joining(", "));

        System.out.println(results);
    }
}




