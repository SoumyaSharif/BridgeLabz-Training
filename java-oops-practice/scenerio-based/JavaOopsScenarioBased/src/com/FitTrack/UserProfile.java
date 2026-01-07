package com.FitTrack;

class UserProfile {
    private String name;
    private int age;
    private double weight; // protected health data
    private String goal;

    private int dailyTargetCalories;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Maintain Fitness");
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyTargetCalories = 2000;
    }

    public int getDailyTargetCalories() {
        return dailyTargetCalories;
    }
}

