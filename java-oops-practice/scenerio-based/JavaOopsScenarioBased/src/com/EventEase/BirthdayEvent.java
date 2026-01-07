package com.EventEase;

class BirthdayEvent extends Event {
    public BirthdayEvent(String name, String location, String date, int attendees) {
        super(name, location, date, attendees);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with decorations 🎉");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}

