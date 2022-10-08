package com.BasicsOfJava;

public class Armstrong {
    public static void main(String [] args) {
//        Q. Print all the 3 digits armstrong number ?

//        Armstrong Number = Sum of cube of digits of number is equal to Number itself
        
        ArmstrongNumber() ;
    }
    
    static void ArmstrongNumber( ) {
        int a = 100;
        for(int i=a; i < 999 ; i++) {
            int store = i;
            int sum =0;
            while( store > 0) {
                int rem = store %10;
                sum += rem*rem*rem;
                store/= 10;
            }
            if( sum == i ) {
                System.out.print(i+ " " );
            }
        }
    }
}
