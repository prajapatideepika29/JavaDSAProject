package org.yourcompany.yourproject;
//Kadane's Algorithm
public class MaximumSumOfSubArray {
    public static int maxSubArray(int[] arr){
     
        int maxSoFar = arr[0]; //Stores the largest sum found anywhere in the array.
        int currentMax = arr[0]; // Stores the maximum sum ending at the current index.

        for(int i=1; i< arr.length; i++){

            /*For every element, there are two choices:
            Choice 1
            Start a new subarray from the current element.
            arr[i]
            Choice 2
            Extend the previous subarray.
            currentMax + arr[i]
            Take whichever is larger. */
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            
            //If the current subarray is better than the best seen so far, update maxSoFar.
            maxSoFar = Math.max(maxSoFar, currentMax);

        }
        return  maxSoFar;

    }
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}

