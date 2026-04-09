import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateCharsInString {   
    /**
     * Finds duplicate characters in a given string and returns them as an array.
     *
     * @param str The input string to check for duplicate characters.
     * @return An array of duplicate characters.
     */
    public static char[] findDuplicateChars(String str) {
        List<Character> duplicates = new ArrayList<>();
        int[] charCount = new int[256];

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Collect characters that appear more than once
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                duplicates.add((char) i);
            }
        }

        // Convert the List<Character> to a primitive char[] array
        char[] result = new char[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "hello world";
        char[] duplicateChars = findDuplicateChars(input);

        // Print the resulting array of duplicate characters
        System.out.println("Duplicate characters in the string \"" + input + "\": " + Arrays.toString(duplicateChars));
    }
    
}