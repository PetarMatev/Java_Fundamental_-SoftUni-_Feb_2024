package Maps_Lambda_Stream_API.Exercise;

import java.util.*;

public class _08_Company_Users {

    public static void addEmployee(LinkedHashMap<String, ArrayList<String>> database, String company, String id) {
        if (!database.containsKey(company)){
            database.put(company, new ArrayList<>());
        }
        if (!database.get(company).contains(id)) {
            database.get(company).add(id);
        }
    }

    public static void printOutFinalResult(LinkedHashMap<String, ArrayList<String>> database) {
        for (Map.Entry<String, ArrayList<String>> entry: database.entrySet()) {
            System.out.println(entry.getKey());
            for (String id : entry.getValue()) {
                System.out.printf("-- %s\n", id);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> database = new LinkedHashMap<>();
        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] instructions = command.split(" -> ");
            String company = instructions[0];
            String id = instructions[1];
            addEmployee(database, company, id);
            command = scan.nextLine();
        }
        printOutFinalResult(database);
    }
}
