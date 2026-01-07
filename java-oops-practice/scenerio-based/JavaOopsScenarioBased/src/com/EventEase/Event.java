package com.EventEase;

abstract class Event implements ISchedulable {
    private final int eventId; // cannot be modified
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;

    private static int idCounter = 100;

    // Constructor
    public Event(String eventName, String location, String date, int attendees) {
        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = 5000;
        this.serviceCost = 2000;
    }

    // Operator usage for cost calculation
    protected double calculateCost(double discount) {
        return (venueCost + serviceCost) - discount;
    }

    public int getEventId() {
        return eventId;
    }
}
