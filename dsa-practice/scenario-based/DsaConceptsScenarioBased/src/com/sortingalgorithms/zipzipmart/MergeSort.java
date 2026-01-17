package com.sortingalgorithms.zipzipmart;

public class MergeSort {

    // Main merge sort method
    static void mergeSort(Package[] amount, int l, int r) {

        // Base condition
        if (l < r) {

            int mid = l + (r - l) / 2;

            mergeSort(amount, l, mid);
            mergeSort(amount, mid + 1, r);

            merge(amount, l, mid, r);
        }
    }

    // Merge two sorted subarrays
    static void merge(Package[] amount, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        Package[] Left = new Package[n1];
        Package[] Right = new Package[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            Left[i] = amount[l + i];
        }

        for (int j = 0; j < n2; j++) {
            Right[j] = amount[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        // Stable merge
        while (i < n1 && j < n2) {
            if (Left[i].amount <= Right[j].amount) {
                amount[k] = Left[i];
                i++;
            } else {
                amount[k] = Right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            amount[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            amount[k] = Right[j];
            j++;
            k++;
        }
    }
    
    static void display(Package[] result) {
    	System.out.println("Sorted amount are : ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].amount);
        }
    }
}
