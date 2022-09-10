package com.StacksQueues.StackQuestions.InfixPrefixPostfix;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String postfix = "352^*7/522^--";
        postfix = "69+42*42^++";

        System.out.println(evaluate(postfix));
    }

    public static double evaluate(String s) {
        if (s.isEmpty())  {
            return -1;
        }
        Stack<Double> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if ( ch >= '0' && ch <= '9') {
                st.push((double)(ch - '0'));
            } else {
                double op2 = st.pop();
                double op1 = st.pop();
                double value = switch (ch) {
                    case '+' -> op1 + op2;
                    case '-' -> op1 - op2;
                    case '*' -> op1 * op2;
                    case '/' -> op1 / op2;
                    case '^' -> Math.pow(op1, op2);
                    default -> 0;
                };
                st.push(value);
            }
        }

        return st.peek();
    }
}
