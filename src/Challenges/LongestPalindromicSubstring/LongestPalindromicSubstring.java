package Challenges.LongestPalindromicSubstring;

import java.util.ArrayList;

public class LongestPalindromicSubstring {

    public String longestPalindromicSubstring(String s) {

        if(s.length() == 0){
            return "";
        }

        char[] sToCharArray = s.toCharArray();

        if(s.length() == 1){
            return s;
        }

        ArrayList<Character> arr = new ArrayList<>();
        String currentLargest = "";
        int counter;

        for (int i = 0; i < sToCharArray.length-1; i++){
            arr.clear();
            counter = 1;
            arr.add(sToCharArray[i]);
            for (int j = i+1; j < sToCharArray.length-1; j++){
                arr.add(sToCharArray[j]);
                if(isPalindromic(arr)){
                    counter++;
                    if(arr.size() > currentLargest.length()){
                        currentLargest = arr.toString();
                        counter = arr.size();
                    }
                } else {
                    counter++;
                }
            }
        }

        return currentLargest;
    }

    public boolean isPalindromic(ArrayList<Character> arr){
        ArrayList<Character> reversed = new ArrayList<>();
        int index = 0;

        for (int i = arr.size()-1; i > 0; i--){
            reversed.add(index, arr.get(i));
            index++;
        }

        if(reversed.equals(arr)){
            return true;
        }

        return false;
    }
}
