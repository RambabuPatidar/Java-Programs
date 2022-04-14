package com.StringsWithRecursion;

public class EscapeAppleInString {
    public static void main(String[] args) {
        String s = "Ramapplebabuapple patidarapple";

        System.out.println(escapeApple(s));
    }

    static String escapeApple(String s ) {
        if(s.isEmpty()) {
            return "";
        }

        if( s.startsWith("apple")) {
            return escapeApple(s.substring(5));
        }
        return s.charAt(0) + escapeApple(s.substring(1));
    }
}
