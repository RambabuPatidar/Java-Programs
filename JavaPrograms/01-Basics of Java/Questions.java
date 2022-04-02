package com.BasicsOfJava;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :" );
        int n = in.nextInt();

        boolean isPrime = prime( n);

        if( isPrime) {
            System.out.println("Prime " );

        }
        else {
            System.out.println("NotPrime");
        }
    }

    static boolean prime(int n ) {
        if( n <= 1) {
            return false;
        }

        int  c= 2;
        while( c*c <= n) {
            if( n%c == 0) {
                return  false;
            }
            c++;
        }

        return c * c > n;
    }

    // this is method for prime number checking
//    static boolean prime(int n) {
//        for(int i=2; i*i <=n ; i++) {
//            if( n %i == 0 ) {
//                return false;
//            }
//        }
//        return true;
//    }
}
