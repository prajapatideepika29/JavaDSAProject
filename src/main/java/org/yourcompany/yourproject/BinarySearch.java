package org.yourcompany.yourproject;

public class BinarySearch {

    public static int binarySearchInd(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high-low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2,3,5,6,8,9,10,34,39};
        int target = 34;
        System.out.println(binarySearchInd(arr, target));
    }
}
