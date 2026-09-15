import java.util.*;
class Main {
    
    public static String sortArray(int[] arr){
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,13,21,15,11};
        System.out.println(sortArray(arr));
    }
}
