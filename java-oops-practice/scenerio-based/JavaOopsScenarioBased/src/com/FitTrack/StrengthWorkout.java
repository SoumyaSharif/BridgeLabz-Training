package com.FitTrack;


class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
    }

    @Override
    protected int calculateCalories() {
        return duration * 6;
    }
}

