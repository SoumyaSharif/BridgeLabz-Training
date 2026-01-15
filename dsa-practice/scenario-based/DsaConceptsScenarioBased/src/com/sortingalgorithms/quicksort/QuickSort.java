package com.sortingalgorithms.quicksort;
class QuickSort {

    // Partition method
    static int partition(Ticket[] tickets, int low, int high) {
        int pivot = tickets[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].price <= pivot) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }

    // Quick Sort method
    static void sort(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int pi = partition(tickets, low, high);
            sort(tickets, low, pi - 1);
            sort(tickets, pi + 1, high);
        }
    }
}
