package com.StacksQueues.StackQuestions;

import java.util.Stack;

// Q. https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(){";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch  == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (ch == '}') {
                    if (stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                } else if (ch == ')') {
                    if (stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                } else if (ch == ']') {
                    if (stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
