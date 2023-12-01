package Challenges.ValidParenthesis;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

import java.util.Stack;

public class validParenthesis {

    public static boolean validParenthesis(String s) {

        if (s.length() == 0 || s.length() % 2 == 1) {
            return false;
        }

        String [] eachParenthesis = s.split("");
        Stack<String> stack = new Stack<>();

        for (String parenthesis : eachParenthesis) {
            if (parenthesis.equals("(")) {
                stack.push("(");
            } else if (parenthesis.equals(")")) {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

}
