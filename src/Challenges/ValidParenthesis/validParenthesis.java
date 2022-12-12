package Challenges.ValidParenthesis;

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
