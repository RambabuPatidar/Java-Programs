package com.RecursionQuestion;

public class DecrementConcept {
    public static void main(String[] args) {
        int n  = 5;

        func(n);
    }
    static void func(int n ) {
        if ( n == 0 ) {
            return ;
        }
        System.out.println(n);
//        func(n--);
        func(--n);
    }
}
