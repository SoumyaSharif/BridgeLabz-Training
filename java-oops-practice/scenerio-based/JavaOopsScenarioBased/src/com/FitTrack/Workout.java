package com.FitTrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    protected abstract int calculateCalories();

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started 🏃");
    }

    @Override
    public void stopWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println(type + " workout stopped. Calories burned: " + caloriesBurned);
    }
}
