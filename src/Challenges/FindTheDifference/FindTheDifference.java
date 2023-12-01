package Challenges.FindTheDifference;

import java.util.Stack;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {

        char newChar = 'a';

        char[] originalString = s.toCharArray();
        char[] shuffledString = t.toCharArray();
        Stack<Character> stack = new Stack<>();

        if(originalString.length < 1){
            return shuffledString[0];
        }

        char currentChar;

        for(char c : shuffledString){
            currentChar = c;
            for(char d : originalString){
                if(d == c){
                    stack.remove(c);
                }
            }
        }

        return newChar;
    }
}
