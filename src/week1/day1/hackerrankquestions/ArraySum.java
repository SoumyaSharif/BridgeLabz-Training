package week1.day1.hackerrankquestions;
import java.util.*;

public class ArraySum {

    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;

        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {

        // Hard-coded input
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 10, 11);

        // Calling the function
        int result = simpleArraySum(ar);

        // Displaying output
        System.out.println("Array Sum = " + result);
    }
}
