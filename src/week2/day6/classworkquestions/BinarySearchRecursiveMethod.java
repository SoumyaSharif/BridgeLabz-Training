package week2.day6.classworkquestions;

public class BinarySearchRecursiveMethod {

    public static void main(String[] args) {

        // Binary Search requires a sorted array
        int[] arr = {1, 2, 3, 12, 45};
        int target = 12;

        int result = BinarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int BinarySearch(int[] arr, int left, int right, int target) {

        // Base case
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return BinarySearch(arr, mid + 1, right, target);
        }

        return BinarySearch(arr, left, mid - 1, target);
    }
}