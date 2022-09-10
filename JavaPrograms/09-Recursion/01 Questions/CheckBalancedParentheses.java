package com.MoreRecursionQuestions;

public class CheckBalancedParentheses{
    public static void main(String[] args) {
        String s = "){}";
        System.out.println(checkValid("", s));

    }
//    p ==  processed string
//    up == unprocessed string
static boolean checkValid(String p, String up) {
    if(up.isEmpty()) {
        return p.isEmpty();
    }

    char ch = up.charAt(0);
    boolean opening = false;
    boolean closing = false ;
    if(ch == '[' || ch == '(' || ch == '{' || ch == '<') {
        opening = checkValid(p + ch , up.substring(1));
    }
    else{
        if(p.isEmpty()) { // for the test case like : }{}[()] , ({}[])} because
                            // in the first case you will get error if you not put this condition
                            // as the -1 index doesn't exist that mean p string is empty. Same is the case in second example the processed string is getting empty after ({}[]) and
                            // we are left on the same situation as in first example
            return false;
        }
        if(ch == ']' && p.charAt(p.length() -1) == '[') {
            closing = checkValid(p.substring(0,p.length() -1),up.substring(1));
        }
        else if(ch == ')' && p.charAt(p.length() -1) == '(') {
            closing = checkValid(p.substring(0,p.length() -1),up.substring(1));
        }
        else if(ch == '}' && p.charAt(p.length() -1) == '{') {
            closing = checkValid(p.substring(0,p.length() -1),up.substring(1));
        }
        else if(ch == '>' && p.charAt(p.length() -1) == '<'){
            closing = checkValid(p.substring(0, p.length() -1), up.substring(1));
        }

    }

    return opening || closing;
}
}

