package com.MathForDSA02;

import java.util.Scanner;

public class SqrtBinarySearch {
    public static void main(String [] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int ans = sqrtBinarySearch(n);

        System.out.println( ans );

    }

    static int sqrtBinarySearch(int n ) {
        int start = 1;
        int end = n;

        while( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if( mid * mid  == n ) {
                return mid;
            }
            else if( mid * mid < n)  {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return end;
    }
}
