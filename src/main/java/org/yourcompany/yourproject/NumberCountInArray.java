package org.yourcompany.yourproject;
import java.util.HashMap;
import java.util.Map;

public class NumberCountInArray {

    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] arr = {1,3,5,4,3,7,8,1,2,5,5,8,9,3,5,5,9,1};
        
        for(int n : arr){
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
                System.out.println("Number: " + entry.getKey() + " Count: " + entry.getValue());
        }
    }
}
