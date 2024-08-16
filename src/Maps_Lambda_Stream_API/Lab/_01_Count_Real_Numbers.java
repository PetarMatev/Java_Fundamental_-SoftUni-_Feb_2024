package Maps_Lambda_Stream_API.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _01_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = Arrays.stream(scan.nextLine()
                        .split(" "))
                .mapToDouble(e -> Double.parseDouble(e))
                .toArray();

        TreeMap<Double, Double> numOccurs = new TreeMap<>();

        for (double num : numbers) {
            if (!numOccurs.containsKey(num)) {    // if numOccurs does not contain the key, we then add the number and counter of 0.00;
                numOccurs.put(num, 0.00);
            }
            numOccurs.put(num, numOccurs.get(num) + 1.00); // and then we add 1.00 to it. If it exists then we straight add 1.00.
        }

        for (Map.Entry<Double, Double> entry : numOccurs.entrySet()) {
            System.out.printf("%.0f -> %.0f\n", entry.getKey(), entry.getValue());
        }
    }
}
