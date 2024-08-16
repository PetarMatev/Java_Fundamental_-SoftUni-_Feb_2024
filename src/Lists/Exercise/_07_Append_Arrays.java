package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class _07_Append_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringLine = scan.nextLine();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringLine.split("\\|")));
        ArrayList<Integer> newArray = new ArrayList<>();

        for(int i = arrayList.size() - 1; i >= 0; i--) {
            String[] item = arrayList.get(i).split(" ");
            for (int j = 0; j < item.length; j++) {
                String current = item[j];
                if (!current.equals("")) {
                    newArray.add(Integer.parseInt(current));
                }
            }
        }

        for(int Element : newArray) {
            System.out.printf("%d ", Element);
        }
    }
}
