/*
Create a function that takes a positive integer and returns the largest possible number that can be made with the digits

351 = 531
1938472 = 9874321
12 = 21


*/


public class LargestNum {

    public static int largestNum(int num) {
        if (num >= 0 && num <= 11) {
            return -1;
        }

        String stringInt = Integer.toString(num);
        char[] digits = stringInt.toCharArray();

        for (int i = 0; i < digits.length-1; i++) {
            if(Integer.valueOf(digits[i]) < Integer.valueOf(digits[i+1])){
                char temp = digits[i];
                digits[i] = digits[i+1];
                digits[i+1] = temp;
                if ( i != 0){
                    i-=2;
                }
            }
        }

        int largestNum = Integer.parseInt(new String (digits));

        if (largestNum > num) {
            return largestNum;
        }
        else {
            return -1;
        }


    }


}
