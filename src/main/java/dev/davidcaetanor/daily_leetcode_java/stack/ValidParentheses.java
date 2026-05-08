package dev.davidcaetanor.daily_leetcode_java.stack;

import java.util.Stack;

/*
Link: https://neetcode.io/problems/validate-parentheses/question?list=neetcode150
 */
public class ValidParentheses {
    public boolean execute(String s) {

        if (s.length() % 2 != 0) return false;

        Stack<Character> cStack = new Stack<>();

        for (Character c : s.toCharArray()) {

            if (c == '[' || c == '(' || c == '{') {
                cStack.push(c);
            } else {
                if (cStack.isEmpty()) return false;

                if (c == '}' && cStack.peek() == '{') {
                    cStack.pop();
                } else if (c == ']' && cStack.peek() == '[') {
                    cStack.pop();
                } else if (c == ')' && cStack.peek() == '(') {
                    cStack.pop();
                } else {
                    return false;
                }

            }
        }
        return cStack.isEmpty();
    }
}
