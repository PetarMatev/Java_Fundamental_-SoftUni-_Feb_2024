package Maps_Lambda_Stream_API.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _02_Word_Synonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {

            String word = scan.nextLine();
            String synonym = scan.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);


        }

        for (Map.Entry<String, List<String>>entry: words.entrySet()) {
            List<String> list = entry.getValue();
            String result = String.join(", ", list);
            System.out.printf("%s - %s\n", entry.getKey(), result);

        }
    }
}
