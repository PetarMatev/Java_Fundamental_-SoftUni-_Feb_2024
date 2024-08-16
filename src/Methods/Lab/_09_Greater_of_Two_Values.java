package Methods.Lab;

import java.util.Scanner;

public class _09_Greater_of_Two_Values {

    public static String getMax(String a, String b){
        return (a.compareTo(b) > 0) ? a : b;

    }

    public static char getMax(char a, char b){
        return (char) Math.max(a, b);
    }
    public static Integer getMax(Integer a, Integer b){
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeInput = scan.nextLine();
        if (typeInput.equals("int")) {
            Integer result = getMax(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()));
            System.out.println(result);
        } else if (typeInput.equals("char")) {
            String result = getMax(scan.nextLine(), scan.nextLine());
            System.out.println(result);
        } else if (typeInput.equals("string"))  {
            String result = getMax(scan.nextLine(), scan.nextLine());
            System.out.println(result);
        }
    }
}
