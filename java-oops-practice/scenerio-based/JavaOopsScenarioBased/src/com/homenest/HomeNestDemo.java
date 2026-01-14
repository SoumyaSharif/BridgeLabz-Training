package com.homenest;
public class HomeNestDemo {

    public static void main(String[] args) {

        Device d1 = new Light("L101");
        Device d2 = new Camera("C201");

        d1.turnOn();
        d1.reset();

        d2.turnOn();
        d2.reset();
    }
}
