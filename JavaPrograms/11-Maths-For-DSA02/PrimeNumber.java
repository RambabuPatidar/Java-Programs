package com.MathForDSA02;
// one method for finding the Prime number effectively can be
// found in Basics of java Question.java file

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        n = in.nextInt();
        boolean[] sieve = new boolean[n+1];

        for( int i = 0; i <= n; i++ ) {
            sieve[i] = true;
        }
        makeSieve(sieve, n);
        for (int i = 1; i <= n; i++) {
            if(sieve[i]) {
                System.out.print(i + " ");
            }
        }

    }

    static void makeSieve(boolean[] sieve, int n ) {
        sieve[0] = sieve[1] = false;
        int c = 2;
        while( c * c <= n  ) {
            for(int i = c*c ; i<= n ; i += c) {
                sieve[i] = false;
            }
            c++;
        }

    }

}
