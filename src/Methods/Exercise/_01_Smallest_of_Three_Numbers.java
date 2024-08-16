package Methods.Exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Smallest_of_Three_Numbers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            nums.add(Integer.parseInt(scan.nextLine()));
        }

        Integer getResult = getSmallestOfThreeNums(nums);
        System.out.println(getResult);


    }


    public static int getSmallestOfThreeNums(ArrayList numbers) {

        ArrayList<Integer> sortedListOfNumbers = (ArrayList<Integer>) numbers.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        return (int) sortedListOfNumbers.get(0);
    }
}
