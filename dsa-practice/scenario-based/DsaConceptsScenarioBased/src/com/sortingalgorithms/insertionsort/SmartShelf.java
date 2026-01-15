package com.sortingalgorithms.insertionsort;

public class SmartShelf {
    public static void main(String[] args) {

        Book[] readingList = {
            new Book("Data Structures"),
            new Book("Algorithms"),
            new Book("Computer Networks"),
            new Book("Operating Systems")
        };

        // Sorting using Insertion Sort
        InsertionSort.sort(readingList);

        // Display sorted list
        System.out.println("Alphabetical order for the readinglist : ");
        for (Book b : readingList) {
            System.out.println(b.getTitle());
        }
    }
}
