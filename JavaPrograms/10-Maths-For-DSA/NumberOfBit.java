package com.MathsForDSA;

public class NumberOfBit {
    public static void main(String[] args) {
        int n  = 1000286;
        int b = 10;
        // b is the base in which number system we want to calculate the number of digit
        // of the given number n
//        System.out.println(numberOfBit1(n));

        System.out.println(numberOfBit2(n, b));
    }
    // This will work with only the binary number because the
    // operator we are using are the bitwise operator
    static int numberOfBit1(int n)
    {
        int count = 0;
        while(n!= 0){
            count++;
            n = n>>1;
        }
        return count;
    }

    static int numberOfBit2(int n, int b ) {
        return (int)(Math.log(n)/ Math.log(b)) + 1;
    }
}
