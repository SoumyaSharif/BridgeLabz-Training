package com.EventEase;

class ConferenceEvent extends Event {
    public ConferenceEvent(String name, String location, String date, int attendees) {
        super(name, location, date, attendees);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with speakers and agenda 📊");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}

