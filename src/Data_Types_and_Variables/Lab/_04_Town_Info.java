package Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class _04_Town_Info {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town_name = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        double area = Integer.parseInt(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.", town_name, population, area);
    }
}
