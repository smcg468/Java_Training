package ValidParenthesis;

import java.util.Stack;

public class validParenthesis {

    public static boolean validParenthesis(String s) {

        if (s.length() == 0 || s.length() % 2 == 1) {
            return false;
        }

        String [] eachParenthesis = s.split("");
        Stack<String> stack = new Stack<>();

        for (int index = 0; index < eachParenthesis.length; index++){
            if (eachParenthesis[index].equals("(")){
                stack.push("(");
            }
            else if (eachParenthesis[index].equals(")")){
                if (!stack.empty()) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

}
