package com.sortingalgorithms.artexpo;

import java.util.ArrayList;

public class ArtExpoManager {
	    private ArrayList<Artist> artists = new ArrayList<>();

	    // Real-time insertion with sorting
	    public void addArtist(Artist artist) {
	        artists.add(artist);
	        insertionSort();
	    }

	    // Insertion Sort based on registration time
	    private void insertionSort() {
	        for (int i = 1; i < artists.size(); i++) {
	            Artist key = artists.get(i);
	            int j = i - 1;

	            while (j >= 0 && 
	                   artists.get(j).getRegistrationTime()
	                   .isAfter(key.getRegistrationTime())) {
	                artists.set(j + 1, artists.get(j));
	                j--;
	            }
	            artists.set(j + 1, key);
	        }
	    }

	    public void displayArtists() {
	        for (Artist artist : artists) {
	            System.out.println(artist);
	        }
	    }
}
