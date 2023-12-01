/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.


Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

 */

package Challenges.IndexOfFirstOccurence;

public class IndexOfFirstOccurence {

    public int strStr (String haystack, String needle) {

        int index = -1;
        boolean checking = false;

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for(int c = 0; c < haystackChars.length; c++){
            if(haystackChars[c] == needleChars[0]){
                c++;
                int tempC = c;
                int startC = c;

                checking = true;

                while(checking){
                    for(int i = 0; i < needleChars.length; i++){
                        if(needleChars[i] == haystackChars[tempC]){
                            tempC++;
                        } else if(i == needleChars.length - 1){
                            return startC;
                        }
                        else {
                            checking = false;
                        }
                    }
                }
            }
        }

        return index;

    }

}
