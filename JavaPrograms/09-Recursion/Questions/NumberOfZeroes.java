package com.RecursionQuestion;

public class NumberOfZeroes {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;
        System.out.println(findZeroes(n, count));
        findZeroes02(n);
        System.out.println(zeroes);
    }
    // Good way to solve
    // important thing to note here is that the value in the base case is returned to all
    // the previous function calls as it is.
    static int findZeroes(int n, int count) {
        if( n == 0 ) {
            return 1;
        }

        int rem = n % 10;
        if( rem == n ) {  // Base case
            return count;
        }
        if( rem == 0 ) {
            return findZeroes(n / 10, count+1);
        }
        return findZeroes(n / 10, count);


    }

    // Cheat way to solve when we can't up with above solution
    static int zeroes = 0;
    static void findZeroes02(int n){
        // put case if the number itself is zero
        if( n== 0 ) {
            zeroes = 1;
        }
        if(n % 10 == n ) {
            return;
        }
        if( n % 10 == 0 ) {
            zeroes ++;
        }
        findZeroes02(n/10);

    }
}
