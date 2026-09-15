package org.yourcompany.yourproject;

import java.util.ArrayList;

public class FibonacciSeries {

    public static ArrayList<Integer> fibSeries(int t){
        int first = 0;
        int second = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        if(t < 2){
            arr.add(first);
            arr.add(second);
        }
        int count = 2;
        while(true){
            int next = first + second;
            arr.add(next);
            if(count > t){
                break;
            }
            first = second;
            second = next;
            count++;

        }
        return arr;

    }


    public static void main(String[] args){

        System.out.println(fibSeries(10));
    }
    
}
