package com.RecursionQuestion;

public class FirstUpperCaseInString {
    public static void main(String[] args) {
        String s = "rambabUpatidaR";
        System.out.println(firstUpperCase(s));
        System.out.println(firstUpperCaseRecursive(s, 0));

    }
    // Brute force approach
    static int firstUpperCase(String s) {
        for(int i=0; i<s.length(); i++){
            if( s.charAt(i) >= 65 && s.charAt(i) <= 91) {
                return i;
            }
        }
        return -1;
    }

    static int firstUpperCaseRecursive(String s, int i) {
        if((i >= s.length()) ){
            return -1;
        }
        if( (s.charAt(i) >= 65 && s.charAt(i) <= 91)  ) {
            return i;
        }
        return firstUpperCaseRecursive(s, ++i);
    }


}
