package Com.objectmodelling;

import java.util.Deque;
import java.util.LinkedList;

class slidingWindowMaximum {

    static void printMax(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove elements out of window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // Print max of window
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        printMax(arr, k);
    }
}

