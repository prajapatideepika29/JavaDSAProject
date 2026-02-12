package org.yourcompany.yourproject;

class FibonacciRecursion {

    static int count = 2;

    
    // Recursive method to calculate Fibonacci number
    public static void fibonacci(int prev1, int prev0) {
        if(count <=19){
            int fib = prev0 + prev1;
            System.out.print(fib + " ");
            prev0 = prev1;
            prev1 = fib;
            count++;
            fibonacci(prev1, prev0);
        }
        else {
            return;
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Series: ");
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        fibonacci(1, 0);
        
    }

}