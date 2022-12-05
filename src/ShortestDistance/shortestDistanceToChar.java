package ShortestDistance;

public class shortestDistanceToChar {
    public static int[] shortestDistanceToChar(String st, char c) {

        int[] answers = new int[st.length()];

        char[] charArray = st.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                int counter = 0;
                if (charArray[j] != c) {
                    counter++;
                } else {
                    answers[i] = counter;
                }

            }

        }

        return answers;
    }
}
