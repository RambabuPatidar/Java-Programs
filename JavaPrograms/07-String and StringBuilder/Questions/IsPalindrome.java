package com.StringQuestions;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }


    static boolean isPalindrome(String s) {
        StringBuilder ss = new StringBuilder("");
        for(int i=0; i<s.length(); i++) {
            if(( s.charAt(i) >= 'a' && s.charAt(i) <= 'z')  || ( s.charAt(i) >= '0' && s.charAt(i) <= '9') ) {
                ss.append(s.charAt(i));
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ss.append((char)(s.charAt(i) + 32));
            }

        }
        System.out.println(ss);
        return isPalindromeString(ss.toString());
    }

    static boolean isPalindromeString(String s) {
        int start = 0;
        int end = s.length() -1;
        while(start <= end) {
            if(s.charAt(start ) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
