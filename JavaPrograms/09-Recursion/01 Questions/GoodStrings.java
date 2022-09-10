package com.MoreRecursionQuestions;

public class GoodStrings {
    public static void main(String[] args) {
        int n;
        n = 15;
       int ans =  numOfGoodString("", n);
        System.out.println(ans);

    }

    static int numOfGoodString(String p, int n ){
        if( p.length() == n) {
//            System.out.print(p + " ");
            if( checkGood(p)){
                return 1;
            }
            else{
                return 0;
            }
        }
        int count = 0;
        for(int i=0; i<= 9; i++) {
            char ch = (char)(i + 48);
            count += numOfGoodString(p + ch, n);
        }
        return count;
    }

    static boolean checkGood(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(((i % 2) == 0) && (((s.charAt(i) - '0') % 2) != 0 )) {
                return false;
            }
            if((i % 2) != 0){
                char ch = s.charAt(i);
                if((ch != '2') && (ch != '3') && (ch != '5') && (ch != '7')){
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        int c = 2;
        while( c * c <= n) {
            if( (n % c) == 0 ) {
                return false;
            }
            c++;
        }

        return true;
    }
}
