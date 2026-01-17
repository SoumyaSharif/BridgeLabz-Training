package com.sortingalgorithms.artexpo;

import java.time.LocalTime;

public class ArtExpoApp {
    public static void main(String[] args) {
        ArtExpoManager manager = new ArtExpoManager();

        manager.addArtist(new Artist("Ravi", LocalTime.of(10, 30)));
        manager.addArtist(new Artist("Anita", LocalTime.of(9, 45)));
        manager.addArtist(new Artist("Suman", LocalTime.of(11, 15)));
        manager.addArtist(new Artist("Karan", LocalTime.of(10, 0)));

        System.out.println("Artists sorted by registration time:");
        manager.displayArtists();
    }
}
