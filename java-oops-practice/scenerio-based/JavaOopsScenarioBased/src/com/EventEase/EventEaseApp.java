package com.EventEase;

public class EventEaseApp {
    public static void main(String[] args) {
        Event event = new BirthdayEvent("Soumya's Birthday", "Bangalore", "12-Apr-2026", 50);
        event.schedule(); 
        event.reschedule("15-Apr-2026");
    }
}
