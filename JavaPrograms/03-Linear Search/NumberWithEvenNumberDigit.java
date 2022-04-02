package com.LinearSearchAndQuestions;

public class NumberWithEvenNumberDigit {

    public static void main(String[] args) {
        int[] arr = {12, 345, -2, 6, 7896, 12122342};
//        ans = 2;

        int ans = numWithEvenDigi(arr);
        System.out.println( "The numbers with even number of digits are: "+ ans);


    }

     static int numWithEvenDigi(int[] arr) {
        int count =0;
            for(int num: arr) {
                if(even(num)) {
                    count++;
                }
            }
         return count;
    }

    static boolean even(int num) {
        return noOfdigits(num) % 2 == 0;
    }

    static int noOfdigits(int num) {
        if( num < 0) {
            num = num* -1;
        }
        if( num == 0) {
            return 1;
        }

        int digit =0;
        while( num>0) {
            digit++;
            num/=10;
        }
        return digit;
    }

}
