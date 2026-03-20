import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersInRange {
    
    /**
     * Finds all odd numbers between l and r (inclusive) and returns them as an array.
     *
     * @param l The lower bound of the range.
     * @param r The upper bound of the range.
     * @return An array of odd numbers.
     */
    public static int[] findOddNumbers(int l, int r) {
        List<Integer> oddList = new ArrayList<>();

        // Ensure l is the smaller number and r is the larger number if necessary
        int start = Math.min(l, r);
        int end = Math.max(l, r);

        // Iterate through the range and add odd numbers to the list
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }

        // Convert the ArrayList<Integer> to a primitive int[] array
        int[] result = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            result[i] = oddList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int l = 2;
        int r = 9;
        int[] oddNumbers = findOddNumbers(l, r);

        // Print the resulting array
        System.out.println("Odd numbers between " + l + " and " + r + " are: " + Arrays.toString(oddNumbers));
        
        l = 1;
        r = 5;
        int[] oddNumbers2 = findOddNumbers(l, r);
        System.out.println("Odd numbers between " + l + " and " + r + " are: " + Arrays.toString(oddNumbers2));
    }
}