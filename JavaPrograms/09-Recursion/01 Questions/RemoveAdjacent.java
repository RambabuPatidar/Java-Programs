package com.MoreRecursionQuestions;
//  Q. https://www.geeksforgeeks.org/recursively-remove-adjacent-duplicates-given-string/
public class RemoveAdjacent {

    public static void main(String[] args) {
        string("", "azxxzy");
    }
    static void string(String p, String up ) {
        if( up.isEmpty()) {   // Base condition
            System.out.print(p);
            return ;
        }
        char ch = up.charAt(0);
        int len = p.length();
        if( len > 0 && ch == p.charAt(len-1)) {
            while( ch == p.charAt(len -1)) {
                up = up.substring(1);
                if(!up.isEmpty()) {
                    ch = up.charAt(0);
                }
                else{
                    System.out.print(p.substring(0, len - 1)); //Base condition hit
                    return;
                }
            }
            string(p.substring(0, len - 1), up);
        }
        else{
            string(p + ch, up.substring(1));
        }

    }

}
