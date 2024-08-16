package Basic_Synax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class _06_Foreign_Languages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String language = scan.nextLine();
        String result = "";

        switch(language) {
            case "England":
            case "USA": result = "English"; break;
            case "Spain":
            case "Argentina":
            case "Mexico": result = "Spanish"; break;
            default: result = "unknown";
        }
        System.out.println(result);
    }
}


