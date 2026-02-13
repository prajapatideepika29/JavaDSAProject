package org.yourcompany.yourproject;

class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 19, 5, 6};
        int minValue = findMinValue(arr);
        System.out.println("Minimum value in the array: " + minValue);
    }

    public static int findMinValue(int[] arr) {
        int minValue = arr[0]; // Initialize minValue with the first element of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i]; // Update minValue if a smaller value is found
            }
        }
        return minValue;
    }
}