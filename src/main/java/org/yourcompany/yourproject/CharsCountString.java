package org.yourcompany.yourproject;

import java.util.HashMap;
import java.util.Map;

public class CharsCountString {

    public static void main(String[] args) {
        
        String str = "ConZinaNt";

        int capitalCount = 0;
        int smallCount = 0;

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                capitalCount++;
            }
            else if(Character.isLowerCase(ch)){
                smallCount++;
            }
        }
        System.err.println("Capital letters count: " + capitalCount);
        System.err.println("Small letters count: " + smallCount);

        str = str.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        
        for(char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        }

        System.out.println("Char count: " + charCount);


    }
}
