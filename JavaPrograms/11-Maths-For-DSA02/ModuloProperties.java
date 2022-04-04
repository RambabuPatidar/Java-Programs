package com.MathForDSA02;

// properties of modulo operator

public class ModuloProperties {
    public static void main(String[] args) {

    }

    // find odd even number
    static boolean isOdd(int n ) {
        return n % 2 == 1;
    }

    // find the last digit of any number
    static int lastDigit(int n ) {
        return n % 10;
    }

    // To define a range
//    let's you are given time == 138 minutes find how many minutes are neglecting hour
    // this mean range of minutes bounded [0, 60]
    static int minutes(int n ) {
        return n % 60;
    }

}
