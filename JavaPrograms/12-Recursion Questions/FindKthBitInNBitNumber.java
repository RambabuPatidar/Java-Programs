package com.MoreRecursionQuestions;
//Q. https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

public class FindKthBitInNBitNumber {
    public static void main(String[] args) {
        int k = 4; // the Kth position where we want to search for the character
        System.out.println(findString(4));
        String s = findString(3);
        System.out.println( s.charAt(k -1));
    }

    static String findString(int n ){
        if( n == 1) {
            return "0";
        }

        String belowString = findString( n-1);
        String revInvert = reverseInvert(belowString);
        return belowString + "1" + revInvert;
    }

    static String reverseInvert(String s) {
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) == '0') {
                builder.setCharAt(i, '1');
            }
            else{
                builder.setCharAt(i, '0');
            }
        }
        return builder.toString();
    }
}
