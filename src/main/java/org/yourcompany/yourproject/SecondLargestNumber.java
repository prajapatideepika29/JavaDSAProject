public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 18, 19, 5, 6};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest number in the array: " + secondLargest);
    }   

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for( int num: arr){
        if(num> largest){
            secondLargest = largest;
            largest=num;
        }else if(num>secondLargest && num< largest){
            secondLargest= num;
            }
        }
        return secondLargest;
    }
}