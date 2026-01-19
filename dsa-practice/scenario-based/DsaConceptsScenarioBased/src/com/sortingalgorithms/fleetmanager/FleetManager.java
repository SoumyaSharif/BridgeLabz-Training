package com.sortingalgorithms.fleetmanager;
import java.util.ArrayList;
import java.util.List;

public class FleetManager {

    public static void main(String[] args) {

        // Depot-wise sorted lists
        List<Vehicle> depot1 = new ArrayList<>();
        depot1.add(new Vehicle("D1-V1", 12000));
        depot1.add(new Vehicle("D1-V2", 18000));
        depot1.add(new Vehicle("D1-V3", 25000));

        List<Vehicle> depot2 = new ArrayList<>();
        depot2.add(new Vehicle("D2-V1", 10000));
        depot2.add(new Vehicle("D2-V2", 22000));
        depot2.add(new Vehicle("D2-V3", 30000));

        List<Vehicle> depot3 = new ArrayList<>();
        depot3.add(new Vehicle("D3-V1", 15000));
        depot3.add(new Vehicle("D3-V2", 20000));

        // Combine all depot lists
        List<Vehicle> masterList = new ArrayList<>();
        masterList.addAll(depot1);
        masterList.addAll(depot2);
        masterList.addAll(depot3);

        // Apply Merge Sort
        List<Vehicle> sortedSchedule =MergeSort.mergesort(masterList);

        // Display Master Maintenance Schedule
        System.out.println("Master Vehicle Maintenance Schedule:");
        for (Vehicle v : sortedSchedule) {
            System.out.println(v);
        }
        
    }
}
