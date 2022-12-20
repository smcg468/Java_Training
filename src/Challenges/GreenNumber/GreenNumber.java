package Challenges.GreenNumber;

/*
DESCRIPTION:
This is a very simply formulated task. Let's call an integer number N 'green' if N² ends with all of the digits of N. Some examples:

5 is green, because 5² = 25 and 25 ends with 5.

11 is not green, because 11² = 121 and 121 does not end with 11.

376 is green, because 376² = 141376 and 141376 ends with 376.

Your task is to write a function green that returns the nth green number, starting with 1 - green (1) == 1
 */

public class GreenNumber {

    public static long Green (int N) {

        long answer = 0;
        int counter = N;

        for (int i = 1; i <= 4000; i++) {
            String numberSquared = Integer.toString(i*i);
            String number = String.valueOf(i);

            if (isGreenNumber(numberSquared, number)){
                counter--;
                if (counter == 0) {
                    answer = Long.parseLong(numberSquared);
                    break;
                }
            }
        }
        return answer;
    }

    private static boolean isGreenNumber ( String numberSquared, String number) {
        return numberSquared.endsWith(number);
    }
}
