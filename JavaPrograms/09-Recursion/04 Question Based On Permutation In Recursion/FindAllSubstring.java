package com.PermutationRecursion;

import java.util.ArrayList;

public class FindAllSubstring {
    public static void main(String[] args) {
        String s = "abcdefg";

//        findSubString(s, "");
//        ArrayList<String> list;
//        list = findSubString03(s, "");
//        System.out.println(list);
        System.out.println(findSubStringCount(s, ""));
    }


    // counting the permutations

    static int findSubStringCount(String s, String seq) {
        if (s.isEmpty()) {
            return 1;
        }
        int count = 0;
        int n = seq.length();
        String storeSeq = seq;
        for(int i = 0; i<= n; i++) {
            seq = storeSeq.substring(0,i) + s.charAt(0) + storeSeq.substring(i);
            count  = count + findSubStringCount(s.substring(1), seq);
        }
        return count;
    }

    // just printing the permutation directly
    static void findSubString(String s, String seq) {
        if (s.isEmpty()) {
            System.out.println(seq);
            return;
        }
        int n = seq.length();
        String storeSeq = seq;
        for(int i = 0; i< n +1; i++) {
            seq = storeSeq.substring(0,i) + s.charAt(0) + storeSeq.substring(i);
            findSubString(s.substring(1), seq);
        }
    }

    // now we are storing permutation in list which we got in argument
    static void findSubString02(String s, String seq, ArrayList<String> list) {
        if (s.isEmpty()) {
            list.add(seq);
            return;
        }
        int n = seq.length();
        String storeSeq = seq;
        for(int i = 0; i< n +1; i++) {
            seq = storeSeq.substring(0,i) + s.charAt(0) + storeSeq.substring(i);
            findSubString02(s.substring(1), seq, list);
        }
    }

    // now we are creating list inside the function

    static ArrayList<String> findSubString03(String s, String seq){
        ArrayList<String> list = new ArrayList<String>();
        if( s.isEmpty() ) {
            list.add(seq);
            return list;
        }
        char ch = s.charAt(0);
        int n = seq.length();
        for(int i=0; i< n +1; i++) {
            String first = seq.substring(0,i) ;
            String second = seq.substring(i);
            list.addAll(findSubString03(s.substring(1), first+ ch + second));
        }
        return list;
    }

}
