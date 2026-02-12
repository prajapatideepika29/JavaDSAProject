package org.yourcompany.yourproject;

class Fibonacci {

    public static void main(String[] args) {
    int prev0 = 0;
    int prev1 = 1;

    System.out.print("Fibonacci Series: " + prev0 + " " + prev1 + " ");

    for(int i=0; i<=18; i++){
        int fib = prev0 + prev1;
        System.out.print(fib + " ");
        prev0 = prev1;
        prev1 = fib;    
    }
     
    }
}