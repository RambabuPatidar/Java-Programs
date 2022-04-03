package com.MathsForDSA;

public class XorFromAToN {
    public static void main(String[] args) {

        int a = 0;
        int b = 9;
        if( a <=0 ) {
            System.out.println(xor(b));
        }
        else{
            System.out.println(xor(b) ^ xor(a-1));

        }


        // check that the function xor giving the correct ans
        // if we do iterative way then we'll get TLE(Time Limit Exceeds) for
        // large input of n
        int ans =0;
        for(int i=a; i<=b ;i++) {
            ans ^= i;
        }
        System.out.println(ans);
    }

    static int xor(int n) {
        if( n % 4 == 0) {
            return n;
        }

        if(n % 4 == 1) {
            return 1;
        }
        if( n % 4 == 2) {
            return n+1;
        }
        return 0;

    }

}
