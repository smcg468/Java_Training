package Day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Day1 {

    public static int calorieCounter () throws IOException, FileNotFoundException {

        String filename = ("src/Day1/day1input.txt");

        BufferedReader br = new BufferedReader(new FileReader(filename));
        ArrayList<Integer> totalCalories = new ArrayList<>();

        int calorieCounter = 0;
        int largest = 0;

        String current;

        while ((current = br.readLine()) != null) {
            String cal = current.trim();
            if (!cal.equals("")) {
                calorieCounter += Integer.parseInt(cal);
            } else {
                totalCalories.add(calorieCounter);
                if ( calorieCounter > largest){
                    largest = calorieCounter;
                }
                calorieCounter = 0;
            }
        }

        // PART 2: Find three largest by adding all entries to ArrayList and sorting in Desc Order
        Collections.sort(totalCalories, Collections.reverseOrder());
        System.out.println(totalCalories);

        return largest;
    }

}
