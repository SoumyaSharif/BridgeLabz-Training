package com.homenest;
public class Thermostat extends Device {

    public Thermostat(String id) {
        super(id, 15);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat active");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat off");
    }

    public void reset() {
        System.out.println("Thermostat reset to 24°C");
    }
}
