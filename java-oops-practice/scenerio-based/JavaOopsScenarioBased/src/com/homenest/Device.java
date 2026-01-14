package com.homenest;
public abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;              // encapsulated
    protected double energyUsage;
    private String firmwareLog;           // secured

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "v1.0";
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOn() {
        return status;
    }

    protected double calculateEnergy(double hours) {
        return energyUsage * hours; // operator usage
    }
}
