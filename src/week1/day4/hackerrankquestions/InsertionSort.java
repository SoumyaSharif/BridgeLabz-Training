package week1.day4.hackerrankquestions;
import java.util.*;
public class InsertionSort {

    public static void insertionSort1(int n, List<Integer> arr) {

        int value = arr.get(n - 1);
        int i = n - 2;

        while (i >= 0 && arr.get(i) > value) {

            arr.set(i + 1, arr.get(i));

            printArray(arr);

            i--;
        }

        arr.set(i + 1, value);

        printArray(arr);
    }

    // Helper function to print the array
    public static void printArray(List<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Hard-coded input
        int n = 5;

        List<Integer> arr = new ArrayList<>(
                Arrays.asList(2, 4, 6, 8, 3)
        );

        // Call the function
        insertionSort1(n, arr);
    }
}
