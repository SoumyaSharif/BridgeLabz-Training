package com.FitTrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
    }

    @Override
    protected int calculateCalories() {
        return duration * 8; // polymorphic behavior
    }
}

