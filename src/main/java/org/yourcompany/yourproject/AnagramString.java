import java.util.Scanner;

public class AnagramString {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        
        String aL = a.toLowerCase();
        String bL = b.toLowerCase();

        int[] freq = new int[26];  

        // Count frequency of each character in a
        for (int i = 0; i < aL.length(); i++)
            freq[aL.charAt(i) - 'a']++;

        // Subtract frequency using characters from b
        for (int i = 0; i < bL.length(); i++)
            freq[bL.charAt(i) - 'a']--;

        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}