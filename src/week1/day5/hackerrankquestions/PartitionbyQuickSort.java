package week1.day5.hackerrankquestions;
import java.util.*;

public class PartitionbyQuickSort {
    public static List<Integer> quickSort(List<Integer> arr) {

        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            }
            else if (arr.get(i) == pivot) {
                equal.add(arr.get(i));
            }
            else {
                right.add(arr.get(i));
            }
        }

        List<Integer> result = new ArrayList<>();

        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        return result;
    }

    public static void main(String[] args) {

        // Hard-coded input
        List<Integer> arr = new ArrayList<>(
                Arrays.asList(4, 5, 3, 7, 2)
        );

        // Call the function
        List<Integer> result = quickSort(arr);

        // Print the result
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
