package com.RecursionQuestion;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int n = 123321;

        System.out.println(isPalindrome(n));
    }
    // The number is palindrome whose reverse is same as the original number
    static boolean isPalindrome(int n) {
        return reverse(n) == n;
    }

    static int reverse(int n) {
        int digits = (((int)Math.log10(n) )+ 1);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if( n % 10 == 0 ) {
            return n;
        }

        int rem = n %10;
        return rem * (int)Math.pow(10, digits -1) + helper(n / 10 , digits - 1);
    }

}
