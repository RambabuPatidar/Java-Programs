package com.StacksQueues.StackQuestions.InfixPrefixPostfix;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String prefix = "+-8+42*-7/321";
        prefix = "-5*3+-^235*73";
        prefix = "*2+1+*4+213";

        System.out.println(evaluate(prefix));
    }

    public static double evaluate(String s) {
        if (s.isEmpty())  {
            return -1;
        }
        Stack<Double> st = new Stack<>();
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if ( ch >= '0' && ch <= '9') {
                st.push((double)(ch - '0'));
            } else {
                double op1 = st.pop();
                double op2 = st.pop();
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
