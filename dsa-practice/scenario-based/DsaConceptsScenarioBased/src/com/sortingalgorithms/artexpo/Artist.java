package com.sortingalgorithms.artexpo;
import java.time.LocalTime;

public class Artist {
    private String artistName;
    private LocalTime registrationTime;

    public Artist(String artistName, LocalTime registrationTime) {
        this.artistName = artistName;
        this.registrationTime = registrationTime;
    }

    public LocalTime getRegistrationTime() {
        return registrationTime;
    }

    @Override
    public String toString() {
        return artistName + " registered at " + registrationTime;
    }
}

