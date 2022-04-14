package com.StringsWithRecursion;

public class EscapeALetter {
    public static void main(String[] args) {
        String s = "abacadaeafagahaiajakalamanaoapaqarasatauavawaxayaza";
//        System.out.println(escape01(s));

        System.out.println(escape02(s));

//        System.out.println(escape03(s, ""));
    }

    static String escape04(String s) {
        if( s.isEmpty()) {
            return "";
        }
        String ansFromBelowCalls = escape04(s.substring(1));
        if( s.charAt(0) == 'a') {
            return ansFromBelowCalls;
        } else{
            return s.charAt(0) + ansFromBelowCalls;
        }
    }

    static String escape05(String s) {
        if( s.isEmpty()) {
            return "";
        }

        if( s.charAt(0) == 'a') {
            return escape05(s.substring(1));
        } else{
            return s.charAt(0) + escape05(s.substring(1));
        }
    }

    // passing the answer argument in the function parameter
    // efficient one as it is passing the same object to all the function
    // calls just the reference variable are different;

    static String escape03(String s, String ans) {
        if( s.length() == 0) {  // s.isEmpty()
            System.out.println(ans); // we can make this function void type also
                                    // as at the end answer string contain answer so just print it;
            return ans;
        }

        if( s.charAt(0) == 'a') {
            return escape03(s.substring(1), ans);
        }
        return escape03(s.substring(1), ans + s.charAt(0));
    }

    // not passing the argument in the function parameter
    // good thought process but not efficient as it is creating a new string
    // every time the function call is being made
    static String escape02(String s) {
        if( s.length() == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder(escape02(s.substring(1)));
        if( s.charAt(0) == 'a') {
            return builder.toString();
        }
        return s.charAt(0) + builder.toString();
    }

    // Brute force approach :=
    static String escape01(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == 'a') {
                continue;
            }
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

}
