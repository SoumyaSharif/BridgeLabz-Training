package com.sortingalgorithms.foodfest;
public class Main {
    public static void main(String[] args) {
        Stall[] stalls = {
            new Stall("Burger Hub", 120),
            new Stall("Pizza Point", 200),
            new Stall("Taco Town", 120),
            new Stall("Pasta Palace", 300)
        };

        FoodFestMergeSort.mergeSort(stalls, 0, stalls.length - 1);

        System.out.println("Sorted Stalls : ");
        for (Stall s : stalls) {
            System.out.println(s.name + " - " + s.footfall);
        }
    }
}
