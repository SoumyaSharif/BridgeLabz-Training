package com.skillforge;

import java.util.List;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, String instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void courseLevelCertificate(Student student) {
        System.out.println("Beginner Certificate awarded to " + student.name);
    }
}
