package AdventOfCode2023.Day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Day1 {

    public int calibrationValues() throws IOException, FileNotFoundException {
        String filename = ("src/AdventOfCode2023/Day1/day1Input.txt");

        BufferedReader br = new BufferedReader(new FileReader(filename));

        int total = 0;
        String currentLine;

        while((currentLine = br.readLine()) != null){

            int firstDigit = 0;
            int secondDigit = 0;
            int twoNumbersCombined;
            StringBuilder firstHalf = new StringBuilder();
            StringBuilder secondHalf = new StringBuilder();

            for(int i = 0; i < currentLine.length(); i++){
                if(Character.isDigit(currentLine.charAt(i))){
                    String number = currentLine.charAt(i) + "";
                    firstDigit = Integer.parseInt(number);
                    break;
                }

                firstHalf.append(currentLine.charAt(i));

                if(firstHalf.toString().contains("one")){
                    firstDigit = 1;
                    break;
                }

                if(firstHalf.toString().contains("two")){
                    firstDigit = 2;
                    break;
                }

                if(firstHalf.toString().contains("three")){
                    firstDigit = 3;
                    break;
                }

                if(firstHalf.toString().contains("four")){
                    firstDigit = 4;
                    break;
                }

                if(firstHalf.toString().contains("five")){
                    firstDigit = 5;
                    break;
                }

                if(firstHalf.toString().contains("six")){
                    firstDigit = 6;
                    break;
                }

                if(firstHalf.toString().contains("seven")){
                    firstDigit = 7;
                    break;
                }

                if(firstHalf.toString().contains("eight")){
                    firstDigit = 8;
                    break;
                }

                if(firstHalf.toString().contains("nine")){
                    firstDigit = 9;
                    break;
                }
            }

            for(int i = currentLine.length()-1; i >= 0; i--){
                if(Character.isDigit(currentLine.charAt(i))){
                    String number = currentLine.charAt(i) + "";
                    secondDigit = Integer.parseInt(number);
                    break;
                }

                secondHalf.insert(0, currentLine.charAt(i));

                if(secondHalf.toString().contains("one")){
                    secondDigit = 1;
                    break;
                }

                if(secondHalf.toString().contains("two")){
                    secondDigit = 2;
                    break;
                }

                if(secondHalf.toString().contains("three")){
                    secondDigit = 3;
                    break;
                }

                if(secondHalf.toString().contains("four")){
                    secondDigit = 4;
                    break;
                }

                if(secondHalf.toString().contains("five")){
                    secondDigit = 5;
                    break;
                }

                if(secondHalf.toString().contains("six")){
                    secondDigit = 6;
                    break;
                }

                if(secondHalf.toString().contains("seven")){
                    secondDigit = 7;
                    break;
                }

                if(secondHalf.toString().contains("eight")){
                    secondDigit = 8;
                    break;
                }

                if(secondHalf.toString().contains("nine")){
                    secondDigit = 9;
                    break;
                }
            }

            twoNumbersCombined = (firstDigit*10) + secondDigit;
            total += twoNumbersCombined;
        }

        return total;
    }
}
