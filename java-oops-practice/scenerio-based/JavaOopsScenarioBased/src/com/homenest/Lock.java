package com.homenest;
public class Lock extends Device {

    public Lock(String id) {
        super(id, 2);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Door Locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Door Unlocked");
    }

    public void reset() {
        System.out.println("Lock reset with new PIN");
    }
}
