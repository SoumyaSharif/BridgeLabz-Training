package com.FitTrack;

public class FitTrackApp {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Soumya", 22, 55, "Weight Loss");

        Workout workout = new CardioWorkout(30); // polymorphism
        workout.startWorkout();
        workout.stopWorkout();

        int progress = user.getDailyTargetCalories() - workout.caloriesBurned;
        System.out.println("Remaining calories for the day: " + progress);
    }
}

