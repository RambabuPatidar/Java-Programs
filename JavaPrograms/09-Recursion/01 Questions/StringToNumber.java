package com.RecursionQuestion;

public class StringToNumber {
    public static void main(String[] args) {
        String s = "12345";

        int ans = findNumber(s);
        System.out.println(ans);
    }

    static int findNumber(String s) {
        if( s.length() == 1) {
            return s.charAt(0) - '0';
        }

        int ans = 0;
        int a = findNumber(s.substring(1));

        ans += (int)(Math.pow(10,s.length() - 1))*(s.charAt(0) - '0')  + a;
        return ans;

    }
}
