import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringArrays {

    static boolean isAnagram(String a, String b) {

        char[] char1 = a.toCharArray();
        char[] char2 = b.toCharArray();

        if(char1.length == char2.length){
            Arrays.sort(char1);
            Arrays.sort(char2);

        } else {
            return false;
        }

        return Arrays.equals(char1, char2);
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