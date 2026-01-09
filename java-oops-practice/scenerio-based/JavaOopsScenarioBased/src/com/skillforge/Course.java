package com.skillforge;

import java.util.List;

public abstract class Course {

    private String title;
    private String instructor;
    private double rating;        // encapsulated
    private List<String> modules; // read-only externally

    public Course(String title, String instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0.0;
    }

    public Course(String title, String instructor) {
        this(title, instructor, List.of("Introduction", "Basics", "Final Project"));
    }

    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getModules() {
        return List.copyOf(modules); // read-only
    }

    public abstract void courseLevelCertificate(Student student);
}
