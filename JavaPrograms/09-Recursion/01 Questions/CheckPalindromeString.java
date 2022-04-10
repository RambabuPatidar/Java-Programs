package com.RecursionQuestion;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String  s = "abccba";

        System.out.println(checkPalindrome(s, 0, s.length() - 1));
    }

    static boolean checkPalindrome(String s, int start, int end) {
        if( start >= end ) {
            return true;
        }
        if( s.charAt(start) != s.charAt(end) ) {
            return false;
        }
        return checkPalindrome(s, start + 1 , end - 1);
    }

}
