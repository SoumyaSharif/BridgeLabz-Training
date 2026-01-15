package com.sortingalgorithms.quicksort;
class EventManager {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(1500),
            new Ticket(500),
            new Ticket(2000),
            new Ticket(800),
            new Ticket(1200)
        };

        // Sort tickets by price using Quick Sort
        QuickSort.sort(tickets, 0, tickets.length - 1);

        // Display sorted ticket prices
        for (Ticket t : tickets) {
            System.out.println(t.price);
        }
    }
}
