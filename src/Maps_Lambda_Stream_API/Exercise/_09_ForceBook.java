package Maps_Lambda_Stream_API.Exercise;

import java.util.*;

public class _09_ForceBook {
    public static boolean checkIfUserExistInAnyTeam(LinkedHashMap<String, ArrayList<String>> forceBook, String name) {
        for (Map.Entry<String, ArrayList<String>> entry : forceBook.entrySet()) {
            for (String team : entry.getValue()) {
                if (team.equals(name)) {
                    return true; // user found in the team
                }
            }
        }
        return false;
    }

    public static void removeUser(LinkedHashMap<String, ArrayList<String>> forceBook, String name) {
        for (Map.Entry<String, ArrayList<String>> entry : forceBook.entrySet()) {
            ArrayList<String> users = entry.getValue();
            if (users.contains(name)) {
                users.remove(name);
            }
        }
    }

    public static void addPlayerToTeam(LinkedHashMap<String, ArrayList<String>> forceBook, String
            team, String name) {
        // check that the user does not exist in any of the teams:
        if (!checkIfUserExistInAnyTeam(forceBook, name)) {
            // check if team exists, if not add it.
            if (!forceBook.containsKey(team)) {
                forceBook.put(team, new ArrayList<String>());
            }
            forceBook.get(team).add(name);
        }
    }

    public static void changeSideOfUser(LinkedHashMap<String, ArrayList<String>> forceBook, String team, String name) {

        if (checkIfUserExistInAnyTeam(forceBook, name)) {
            removeUser(forceBook, name);
        }

        if (!forceBook.containsKey(team)) {
            forceBook.put(team, new ArrayList<String>());
        }
        forceBook.get(team).add(name);
        System.out.printf("%s joins the %s side!\n", name, team);
    }

    public static void printFinalResult(LinkedHashMap<String, ArrayList<String>> forceBook) {
        for (Map.Entry<String, ArrayList<String>> Entry : forceBook.entrySet()) {
            String forceTeam = Entry.getKey();
            int members = Entry.getValue().size();
            if (members >= 1) {
                System.out.printf("Side: %s, Members: %d\n", forceTeam, members);
            }
            ArrayList<String> forceUsers = Entry.getValue();
            for (String user : forceUsers) {
                System.out.printf("! %s\n", user);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> forceBook = new LinkedHashMap<>();

        String command = scan.nextLine();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains("|")) {
                String[] instructions = command.split(" \\| ");
                String team = instructions[0];
                String name = instructions[1];
                addPlayerToTeam(forceBook, team, name);

            } else if (command.contains("->")) {
                String[] instructions = command.split(" -> ");
                String name = instructions[0];
                String team = instructions[1];
                changeSideOfUser(forceBook, team, name);
            }
            command = scan.nextLine();
        }
        printFinalResult(forceBook);
    }
}
