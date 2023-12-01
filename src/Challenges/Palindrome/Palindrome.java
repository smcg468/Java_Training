package Challenges.Palindrome;/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class Palindrome {

    public static boolean Palindrome (int x) {

        if ( x < 0) {
            return false;
        }

        if (x >= 0 && x < 10) {
            return true;
        }

        Integer reverse = 0;
        Integer current = x;

        while (current != 0) {
            int i = current % 10;
            reverse = reverse * 10 + i;
            current = current / 10;
        }

        return reverse.equals(x);
    }

}
