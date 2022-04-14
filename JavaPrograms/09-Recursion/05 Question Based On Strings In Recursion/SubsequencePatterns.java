package com.StringsWithRecursion;

import java.util.ArrayList;

public class SubsequencePatterns {
    public static void main(String[] args) {
        String s = "abc";

//        printSubsequence(s, "");

//        ArrayList<String> list = new ArrayList<String>();
//        printSubsequence02(s, "", list );
//        System.out.println(list);

//        System.out.println(printSubsequence03(s, ""));

        printSubsequenceAscii(s, "");
    }

    // this is printing directly to console. what if we want to store it in Arraylist.
    // see below
    static void printSubsequence(String s, String seq) {
        if(s.isEmpty() ) {
            System.out.print(seq +  " ");
            return ;
        }

        printSubsequence(s.substring(1), seq + s.charAt(0));
        printSubsequence(s.substring(1), seq);

    }
    // created list outside and passed it in the argument. one object different reference variables
    static void printSubsequence02(String s, String seq, ArrayList<String> list){
        if( s.isEmpty()) {
            list.add(seq);
            return ;
        }
         printSubsequence02(s.substring(1), s.charAt(0) + seq, list);
         printSubsequence02(s.substring(1), seq, list);

    }
    // not passing the list in the parameter and creating it inside.
    static ArrayList<String> printSubsequence03(String s, String seq){
        ArrayList<String> list = new ArrayList<>();
        if( s.isEmpty()) {
            list.add(seq);
            return list;
        }

        ArrayList<String> leftAnsOfBelowCalls = printSubsequence03(s.substring(1),   seq + s.charAt(0) );
        ArrayList<String> rightAnsOfBelowCalls = printSubsequence03(s.substring(1), seq);
        list.addAll(leftAnsOfBelowCalls);
        list.addAll(rightAnsOfBelowCalls);
        return list;
    }

    static void printSubsequenceAscii(String s, String seq) {
        if(s.isEmpty() ) {
            System.out.print(seq +  " ");
            return ;
        }

        printSubsequenceAscii(s.substring(1), seq + s.charAt(0));
        printSubsequenceAscii(s.substring(1), seq);
        printSubsequenceAscii(s.substring(1), seq+ (s.charAt(0) + 0));

    }
}
