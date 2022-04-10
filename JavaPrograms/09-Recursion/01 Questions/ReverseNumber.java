package com.RecursionQuestion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 13425;

        reverse(n);

        System.out.println(ans );

        System.out.println(reverse02(n));

    }

    // This function is not using any global variable so this is a good function of
    // reversing the number
    static int reverse02(int n) {
        int digits = (((int)Math.log10(n) )+ 1);
        return helper(n , digits);
    }

    static int helper(int n, int digits) {
        if( n % 10 == n ) {
            return n;
        }

        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);

    }

    // This Function of reversing the number is using a variable that is outside the
    // reverse function so this is not a perfect recursion program to reverse
    // it is something like you are cheating.lol.
   static  int ans = 0;
    static void reverse(int n  ) {
       if( n == 0 ) {
           return;
       }

       ans = ans * 10 + n % 10;
       reverse( n / 10 );
    }

}
