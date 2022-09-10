package com.MoreRecursionQuestions;
//Q. https://leetcode.com/problems/k-th-symbol-in-grammar/
public class KthBitInGrammer {
    public static void main(String[] args) {

        System.out.println(kthChar(2,1 ));
    }

    static char kthChar(int n , int k) {
        if( n == 1) {
            return '0';
        }
        String s = makeString("", "0", n );
        System.out.println(s);
        return s.charAt(k-1);
    }

    static String makeString(String p, String up, int n) {
        if( n == 1) {
            return p;
        }

        if(up.isEmpty()) {
            int pLength = p.length();
            return makeString(p,p.substring((pLength/2)) , n -1);
        }
        char ch = up.charAt(0);
        if(ch == '0') {
            return makeString(p + "01", up.substring(1), n);
        }

        return makeString(p + "10", up.substring(1), n);


    }
}
