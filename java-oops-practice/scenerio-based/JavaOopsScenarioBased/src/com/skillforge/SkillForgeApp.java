package com.skillforge;

import java.util.List;

public class SkillForgeApp {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Alice", "alice@skillforge.com");

        Course javaCourse = new BeginnerCourse(
                "Java Fundamentals",
                "Alice",
                List.of("OOP", "Collections", "Exception Handling")
        );

        instructor.uploadCourse(javaCourse);

        Student student = new Student("Bob", "bob@gmail.com");
        student.updateProgress(3, 3);
        student.assignScore(75);

        student.generateCertificate(); // interface
        javaCourse.courseLevelCertificate(student); // polymorphism
    }
}
