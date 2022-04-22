package com.PermutationRecursion;
//Q. Given number of words (we take alphabet ) and the size of string we have to  make.
//find all the combination of the string.
public class StringOfLengthK {

    public static void main(String [] args) {
        printPossible("", 4, 2);
//
    }
    static int printPossibleCount(String p, int k){
        if( p.length() == k ) {
            System.out.println(p);
            return 1;
        }
        int count = 0;
        int a = printPossibleCount(p + 'a', k);
        int b = printPossibleCount(p+'b', k);
        int c = printPossibleCount(p + 'c' , k);

        count += a + b + c;
        return count;
    }


    static void printPossible(String p, int k, int n){
        if( p.length() == k ) {
            System.out.println(p);
            return;
        }

        for(int i=1; i<=n ; i++) {
            char ch = (char)(96 + i);
            printPossible(p + ch, k, n);
        }

    }
}