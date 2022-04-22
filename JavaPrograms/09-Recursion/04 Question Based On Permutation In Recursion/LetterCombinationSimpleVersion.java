package com.PermutationRecursion;

import java.util.ArrayList;
import java.util.List;

//Q. find all the combination of letters on the mobile pad.
// we are assuming a different type of pad for the simplicity and understanding

/*
  1       2       3
 abc     def     ghi
  4       5       6
 jkl     mno     pqr
  7       8       9
 stu     vwx     xyz
*/
public class LetterCombinationSimpleVersion {
    public static void main(String[] args) {
        String a = "12345";


//       combination(a, "");
//        System.out.println();
       List<String> list = combinationList(a, "");
        System.out.println(list);
    }

    static List<String> combinationList(String s, String seq ) {
        List<String> list = new ArrayList<>();
        if( s.isEmpty()) {
            list.add(seq);
            return list;
        }

        int digit = (char)(s.charAt(0) - '0');

        for(int i = (digit -1) * 3 ; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            List<String> store = combinationList(s.substring(1), seq + ch);
            list.addAll(store);
        }

        return list;
    }

    static void combination(String s, String seq ) {
        if( s.isEmpty()) {
            System.out.print(seq + ", ");
            return;
        }

        int digit = (char)(s.charAt(0) - '0');

        for(int i = (digit -1) * 3 ; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            combination(s.substring(1), seq + ch);
        }
    }
}
