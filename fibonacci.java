/**
 * the fibonacci sequence
 * 
 * not sure why I was inable to do
 * this before when it's the most simple
 * thing ever?
 * 
 * @author starzorrow
 * @since 9/07/2025
 * @see https://en.wikipedia.org/wiki/Fibonacci_sequence
*/
public class fibonacci {

    public static void main(String[] args) {
        // variables
        int lastSum = 0;
        int currentSum = 1;
        int max = 20;
        String divider = ", ";
        String sequence = "Fibonacci Sequence: " + lastSum + divider + currentSum + divider;

        for (int i = 1; i < max; i++) {
            int newSum = lastSum + currentSum;
            sequence = sequence.concat(Integer.toString(newSum) + divider);
            lastSum = currentSum;
            currentSum = newSum;
        }
        // print sequence while trimming the last divider off the string
        // probably easier to add a divider with if statement but this is one line so who cares?
        System.out.println(sequence.substring(0, sequence.length() - 2));
        return;
    }
}
