package week2.day6.hackerrankquestions;

import java.util.*;

public class Pairs {

    public static void main(String[] args) {

        // Hardcoded input
        int k = 2;
        List<Integer> arr = new ArrayList<>(
                Arrays.asList(1, 5, 3, 4, 2)
        );

        int result = pairs(k, arr);

        System.out.println("Number of pairs: " + result);
    }

    public static int pairs(int k, List<Integer> arr) {

        // Binary Search requires sorted data
        Collections.sort(arr);

        int count = 0;

        // Search for arr[i] + k
        for (int i = 0; i < arr.size(); i++) {

            int target = arr.get(i) + k;

            int result = BinarySearch(arr, target);

            if (result != -1) {
                count++;
            }
        }

        return count;
    }

    public static int BinarySearch(List<Integer> arr, int target) {

        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }
            else if (arr.get(mid) < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}