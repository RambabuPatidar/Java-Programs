package com.StringsWithRecursion;

public class EscapeAppNotApple {
    public static void main(String[] args) {
        String s = "Rambabuapp Patidarapp liappkes appapappple.";
        System.out.println(escapeAppNotApple(s));
    }
    static String escapeAppNotApple(String s) {
        if( s.isEmpty()) {
            return "";
        }

        if( s.startsWith("app") && !s.startsWith("apple")){
            return escapeAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + escapeAppNotApple(s.substring(1));
        }
    }
}
