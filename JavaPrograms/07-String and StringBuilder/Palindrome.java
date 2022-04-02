package com.StringsAndStringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String s = "nayan";
        if(isPalindrome(s)) {
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not Palindrome");

        }
    }

    static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() -1 ;
        while( start <= end) {
            if( s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++; end--;
        }
        return true;
    }
}
