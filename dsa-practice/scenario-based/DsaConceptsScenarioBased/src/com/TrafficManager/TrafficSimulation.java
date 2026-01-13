package com.TrafficManager;

public class TrafficSimulation {
    public static void main(String[] args) {

        TrafficManager manager = new TrafficManager(3);
        manager.enqueueVehicle("KA-01");
        manager.enqueueVehicle("KA-02");
        manager.enqueueVehicle("KA-03");
        manager.enqueueVehicle("KA-04"); // Overflow

        manager.enterroundabout();
        manager.enterroundabout();
        manager.displayroundabout();

        manager.exitroundabout();
        manager.displayroundabout();

        manager.enterroundabout();
        manager.displayroundabout();
    }
}
