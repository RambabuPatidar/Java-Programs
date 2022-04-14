package com.RecursionQuestion;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        String s = "Ramabu patidar ";

        // Calling Brute force approach
        String ans = reverseString(s);
        System.out.println(ans);

//      Calling modified approach
        StringBuilder builder = new StringBuilder(s);
        System.out.println(reverse(builder));
    }
    // Recursive Approach
    static StringBuilder reverse(StringBuilder builder) {
        if( builder.length() == 0 ) {
            return builder;
        }
        if( builder.length() == 1) {
            return builder;
        }
        StringBuilder s = new StringBuilder(builder.substring(1));
        return reverse(s).append(builder.charAt(0));
    }

    // Brute Force approach
    static String reverseString(String s) {
        StringBuilder builder = new StringBuilder(s);
        int start = 0;
        int end = s.length() -1;
        while( start <= end) {
            char temp = builder.charAt(start);
            builder.setCharAt(start, builder.charAt(end));
            builder.setCharAt(end, temp);
            start++; end--;

        }
        return builder.toString();
    }
}
