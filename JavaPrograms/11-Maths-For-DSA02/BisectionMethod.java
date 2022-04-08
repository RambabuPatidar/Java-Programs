package com.MathForDSA02;
// Q. Find the Square root of Number using Bisection Method
public class BisectionMethod {
    public static void main(String[] args) {
        double n  = 40;

        double ans = bisectionMethod( n ) ;

        System.out.println( ans );
    }
    static double bisectionMethod(double n ){
        double start = 0;
        double end = n;

        while(Math.abs(start - end ) > 0.0000001 ) {
            double mid = (start + end ) / 2;
            if( mid * mid  == n  ) {
                return end;
            }
            if(mid  * mid > n) {

                end = mid ;
            }
            else{
                start  = mid ;
            }
        }

        return end;
    }
}

