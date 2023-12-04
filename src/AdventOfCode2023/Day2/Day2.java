package AdventOfCode2023.Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {

    public int isGamePossible() throws IOException, FileNotFoundException {
        String filename = ("src/AdventOfCode2023/Day2/day2Input.txt");

        BufferedReader br = new BufferedReader(new FileReader(filename));

        int total = 0;
        int id = 0;
        String currentLine;

        while((currentLine = br.readLine()) != null) {

            int largestReds = 0;
            int largestBlues = 0;
            int largestGreens = 0;

            for (int i = 8; i < currentLine.length(); i++){

                if(Character.isDigit(currentLine.charAt(i))){
                    StringBuilder twoNumbers = new StringBuilder();
                    twoNumbers.append(currentLine.charAt(i));
                    int current = currentLine.charAt(i+2);

                    if(Character.isDigit(currentLine.charAt(i+1))){
                        twoNumbers.append(currentLine.charAt(i+1));
                        current = currentLine.charAt(i+3);
                    }

                    int totalNums = Integer.parseInt(twoNumbers.toString());

                    if(current == 'r' && totalNums > largestReds){
                        largestReds = totalNums;
                    }

                    if(current == 'g' && totalNums > largestGreens){
                        largestGreens = totalNums;
                    }

                    if(current == 'b' && totalNums > largestBlues){
                        largestBlues = totalNums;
                    }
                }
            }

            int totalCubed = largestBlues * largestGreens * largestReds;
            total += totalCubed;
        }
            return total;
    }
}
