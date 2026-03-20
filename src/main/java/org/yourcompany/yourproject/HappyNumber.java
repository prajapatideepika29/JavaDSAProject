import java.util.Scanner;

public class HappyNumber {

    public static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a happy number: ");
        int number = scanner.nextInt();

        int result = number;
        while (result != 1 && result != 4) {
            result = getSumOfSquares(result);
        }
        
        if (result == 1) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
        
        scanner.close();
    }
}