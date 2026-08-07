package week2.day6.classworkquestions;

public class LinearSearch {
        // Method to perform Linear Search
        static int linearSearch(int[] arr, int target) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }

            return -1;
        }

        // Main method
        public static void main(String[] args) {

            int[] arr = {12, 4, 23, 6, 13};
            int target = 23;

            int result = linearSearch(arr, target);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found.");
            }
        }
    }

