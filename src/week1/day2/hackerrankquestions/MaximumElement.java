package week1.day2.hackerrankquestions;
import java.util.*;
public class MaximumElement {

    public static List<Integer> getMax(List<String> operations) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        List<Integer> result = new ArrayList<>();

        for (String operation : operations) {

            String[] parts = operation.split(" ");
            int type = Integer.parseInt(parts[0]);

            // Type 1: Push
            if (type == 1) {

                int value = Integer.parseInt(parts[1]);
                stack.push(value);

                // Store maximum value so far
                if (maxStack.isEmpty() || value >= maxStack.peek()) {
                    maxStack.push(value);
                }
            }

            // Type 2: Delete top
            else if (type == 2) {

                int removed = stack.pop();

                // If removed element was maximum
                if (removed == maxStack.peek()) {
                    maxStack.pop();
                }
            }

            // Type 3: Print maximum
            else if (type == 3) {

                result.add(maxStack.peek());
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Hard-coded input
        List<String> operations = Arrays.asList(
                "1 97",
                "2",
                "1 20",
                "2",
                "1 26",
                "1 20",
                "2",
                "3",
                "1 91",
                "3"
        );

        // Call the function
        List<Integer> result = getMax(operations);

        // Print output
        for (int value : result) {
            System.out.println(value);
        }
    }
}
