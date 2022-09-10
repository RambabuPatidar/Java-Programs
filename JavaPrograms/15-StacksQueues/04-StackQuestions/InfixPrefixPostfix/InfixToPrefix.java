package com.StacksQueues.StackQuestions.InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "2+3*(7-4/(3-2)-1)^2";
        s = "a^b^c";


        String ans = convert(s);
        System.out.println(ans);
    }

    private static String convert(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = s.length() - 1; i >=0 ; i--) {
                char ch = s.charAt(i);
            if ( ch == ')') {
                st.push(')');
            } else if (ch == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    ans.append(st.peek());
                    st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^') {
                if (ch == '^') {
                    while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                        ans.append(st.peek());
                        st.pop();
                    }
                } else {
                    while (!st.isEmpty() && precedence(ch) < precedence(st.peek())) {
                        ans.append(st.peek());
                        st.pop();
                    }
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
        return ans.reverse().toString();
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
