package com.MathForDSA02;
import java.util.ArrayList;

//Q. Find  all the factors of a Number?

//Note: factor(1) method = Brute Force approach
//      factor(2) method = optimized approach
//        factor(3) method = giving in sorted order
public class FactorsOfNumber {
    public static void main(String[] args) {
        int n =  40  ;

        System.out.println(factor01(n));

        System.out.println(factor02(n));
        System.out.println(factor03(n));

    }

    //   ::=  is the sign of "by definition";

    static ArrayList<Integer> factor01(int n ) {
        // BRUTE FORCE APPROACH ::=  is to traverse from 1 to n
        // and divide all the element from n. The number which are dividing the number
        // are the factor of the number.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if( n % i == 0 ) {
                list.add( i );
            }
        }
        return list;
    }

//    Time: O(n)
//    cons : not giving the sorted output
    static ArrayList<Integer> factor02(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int c =1;
        while( c * c <= n ) {
            if( n % c == 0 ) {
                if( c * c == n ) {
                    list.add(c);
                }
                else{
                    list.add(c);
                    list.add(n / c );
                }
            }
            c++;
        }
        return list;
    }

    static ArrayList<Integer> factor03(int n ) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int c =1;
        while( c * c <= n ) {
            if( n % c == 0 ) {
                if( c * c == n) {
                    list.add(c);
                }
                else{
                    list.add(c);
                    list2.add(n / c);
                }
            }

            c++;
        }

        for(int i= list2.size() -1; i>=0; i--) {
            list.add(list2.get(i));
        }

        return list;
    }

}
