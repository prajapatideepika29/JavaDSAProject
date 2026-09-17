package org.yourcompany.yourproject;

/* Write a program to compress a string using character counts.
Given a string consisting of repeated consecutive characters./**
For example : Input "aabbcccdd" Output : "a2b2c3d2"
 */

public class StringCompressor {

    public static String compress(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for(int i=0; i<str.length(); i++){
            if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        return compressed.toString();
        
        // Return the compressed string only if it is actually shorter
        // return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args){
        String input1 = "aabccccccaaaaa";
        String input2 = "abcd";
        System.out.println(compress(input1));
        System.out.println(compress(input2));
    }
    
}