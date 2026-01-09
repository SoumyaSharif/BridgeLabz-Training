package com.TourMate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Hotel hotel, Transport transport, Activity activity) {
        super(destination, duration, hotel, transport, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + destination);
        System.out.println("Passport & Visa verification required.");
        System.out.println("Total Cost: ₹" + budget);
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with charges.");
    }
}
