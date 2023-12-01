package Challenges.LengthOfLongestSubstring;

import java.util.ArrayList;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }

        char[] sToCharArray = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        int lengthOfLargest = 0;
        int counter;

        for (int i = 0; i < sToCharArray.length - 1; i++){
            arr.clear();
            arr.add(sToCharArray[i]);
            System.out.println("1" + arr);
            counter = 1;
            for (int j = i+1; j < sToCharArray.length; j++){
                if(!arr.contains(sToCharArray[j])){
                    arr.add(sToCharArray[j]);
                    System.out.println("2"+arr);
                    counter++;
                } else {
                    if(counter > lengthOfLargest){
                        lengthOfLargest = counter;
                    }
                    counter = 0;
                    arr.clear();
                    System.out.println("3"+arr);
                    break;
                }
            }

            if(counter > lengthOfLargest){
                lengthOfLargest = counter;
            }
        }
        return lengthOfLargest;
    }

}
