package com.TourMate;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Hotel hotel;
    protected Transport transport;
    protected Activity activity;

    public Trip(String destination, int duration,
                Hotel hotel, Transport transport, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.hotel = hotel;
        this.transport = transport;
        this.activity = activity;

        budget = hotel.getCost() + transport.getCost() + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }
}

