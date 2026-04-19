
import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String x){
        x = x.toLowerCase();

        String rev = "";

        for(int i=x.length()-1; i>=0; i--){
            rev = rev + x.charAt(i);
        }
        return x.equals(rev);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        boolean result = isPalindrome(a);
        System.out.println(result);
        s.close();

    }
}