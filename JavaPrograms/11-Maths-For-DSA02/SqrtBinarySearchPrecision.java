package com.MathForDSA02;

import java.util.Scanner;

public class SqrtBinarySearchPrecision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 40;
        int p = 2;
        double ans = sqrtBinarySearch(n, p);
        System.out.println(ans );

    }

    static double sqrtBinarySearch(int n, int precision ) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while( start <= end ) {
            int mid = start + (end -start)/2;
            if(mid * mid == n) {
                return mid;
            }
            else if( mid * mid > n ) {
                end = mid -1;

            }
            else{
                start = mid +1;

            }

        }
        root = end;
        double currPre = 0.1;
        while( precision != 0) {
            while( root * root <= n) {
                root += currPre;
            }
            root -= currPre;
            currPre /= 10;
            precision--;
        }

        return root;
    }
}
