package com.TourMate;

public class TourMateApp {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(30000);
        Transport transport = new Transport(15000);
        Activity activity = new Activity(5000);

        Trip trip = new InternationalTrip(
                "Paris", 7, hotel, transport, activity
        );

        trip.book();
    }
}

