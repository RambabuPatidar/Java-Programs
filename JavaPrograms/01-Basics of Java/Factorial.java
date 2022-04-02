package com.BasicsOfJava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.print("Enter a number : ");
        n = in.nextInt();

        System.out.println(factorial(n));

    }

    static long factorial(int n ){
        if( n == 0) {
            return 1;
        }
        int ans = 1;
        while( n >= 1) {
            ans = ans*n;
            n--;
        }
        return ans;
    }
}
