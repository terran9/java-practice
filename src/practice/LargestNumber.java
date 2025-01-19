package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String result = largestNumber(nums);
        System.out.println("Largest Number: " + result);
        List<String> s = new ArrayList<>();
        s.add("0");
        System.out.println("0"=="0");
        System.out.println(s.get(0)=="0");
    }

    public static String largestNumber(int[] nums) {
        // Step 1: Convert integers to strings
        String[] strNums = Arrays.stream(nums)
                                 .mapToObj(String::valueOf)
                                 .toArray(String[]::new);

        // Step 2: Sort strings using a custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated strings to decide order
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Descending order
            }
        });

        // Step 3: Handle edge case where all numbers are zero
        if (strNums[0].equals("0")) {
            return "0"; // If the largest number is "0", the entire result is "0"
        }

        // Step 4: Build the result string
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}
