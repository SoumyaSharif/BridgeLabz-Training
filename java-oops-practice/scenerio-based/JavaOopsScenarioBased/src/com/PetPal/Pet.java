package com.PetPal;

abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // encapsulated
    private int energy;
    private int mood;

    // Constructor with random defaults
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.energy = 50;
        this.mood = 50;
    }

    // Encapsulated modifiers
    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy + value);
    }

    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger - value);
    }

    protected void improveMood(int value) {
        mood = Math.min(100, mood + value);
    }

    public abstract void makeSound();

    @Override
    public void feed() {
        decreaseHunger(20);
        improveMood(10);
    }

    @Override
    public void play() {
        increaseEnergy(-10);
        improveMood(20);
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
    }
}

