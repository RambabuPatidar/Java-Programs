package com.StacksQueues.StackQuestions.InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "2+3*(7-4/(3-2)-1)^2";
        s = "a^b^c";
        s = "((a+b)*c)-d^e^f";

        String ans = convert(s);
        System.out.println(ans);
    }

    private static String convert(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
            if ( ch == '(') {
                st.push('(');
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.peek());
                    st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^') {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    if (ch == '^' && st.peek() == '^') {
                        break;
                    }
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(ch);
            } else {
                ans.append(ch);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.peek());
            st.pop();
        }
        return ans.toString();
    }

    private static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }
}
