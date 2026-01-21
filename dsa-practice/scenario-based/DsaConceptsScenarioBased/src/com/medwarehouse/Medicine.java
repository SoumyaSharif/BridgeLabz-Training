package com.medwarehouse;
class Medicine {
    String name;
    int expiryDays;

    Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return name + " | Expiry in " + expiryDays + " days";
    }
}
