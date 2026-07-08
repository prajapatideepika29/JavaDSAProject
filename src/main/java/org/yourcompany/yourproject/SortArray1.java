import java.util.*;
class Main {
    
    public static String sortArray(int[] arr){
        
        int n = arr.length;
        for(int i = 0; i< n-1 ; i++){
            for(int j = 0; j < n-i-1 ; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,13,21,15,11};
        System.out.println(sortArray(arr));
    }
}
