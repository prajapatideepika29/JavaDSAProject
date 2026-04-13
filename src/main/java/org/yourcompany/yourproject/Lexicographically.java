import java.util.Scanner;

public class Lexicographically {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 1; i<s.length()-k+1; i++){
            String currString = s.substring(i, i+k);

            if (smallest.compareTo(currString) > 0)
                 smallest = currString;         
            if (largest.compareTo(currString) < 0)     
                 largest = currString;
        }
        
        return smallest + "\n" + largest;   
     }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}