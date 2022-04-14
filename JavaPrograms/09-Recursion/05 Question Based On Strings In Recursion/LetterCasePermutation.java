package com.StringsWithRecursion;
import java.util.ArrayList;
import java.util.List;
public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        List<String> ans = new ArrayList<>();
        permutation(s,"", ans, true);
        System.out.println(ans);
    }
    // this is incomplete;
    static void permutation(String s, String seq, List<String> ans, boolean isSmall) {
        if(s.isEmpty()) {
            ans.add(seq);
            return ;
        }

        if(s.charAt(0)>='0' && s.charAt(0) <= '9') {
            permutation(s.substring(1), seq + s.charAt(0), ans,isSmall);
        }
        else if(s.charAt(0)>='a' && s.charAt(0) <= 'z'){
            if( isSmall) {
                permutation(s.replace(s.charAt(0), (char)(s.charAt(0)-32)), seq + s.charAt(0), ans, false);
            }
            else{
                permutation(s.substring(1), seq + s.charAt(0), ans, true);
            }
        }
        else{
            if(isSmall) {
                permutation(s.replace(s.charAt(0),(char)(s.charAt(0)+32)),seq+s.charAt(0), ans, false);
            }
            else{
                permutation(s.substring(1), seq + s.charAt(0), ans, true);
            }
        }
    }
}
