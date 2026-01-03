package com.universitycourseenrollmentsystem;

import java.util.ArrayList;

public abstract class Student {
    protected String studentId;
    protected String name;
    private double gpa;   // encapsulated
    protected ArrayList<Enrollment> enrollments;

    // Constructor without electives
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrollments = new ArrayList<>();
    }

    // Constructor with elective preference
    public Student(String studentId, String name, ArrayList<Course> electives) {
        this(studentId, name);
        for (Course c : electives) {
            enrollments.add(new Enrollment(this, c));
        }
    }

    public void enroll(Course course) {
        enrollments.add(new Enrollment(this, course));
    }

    // GPA calculation using operators
    protected void calculateGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (Enrollment e : enrollments) {
            if (e.getGradePoint() >= 0) {
                totalPoints += e.getGradePoint() * e.getCourse().getCredits();
                totalCredits += e.getCourse().getCredits();
            }
        }
        if (totalCredits > 0) {
            gpa = totalPoints / totalCredits;
        }
    }

    // Public access to private GPA
    public double getTranscript() {
        calculateGPA();
        return gpa;
    }
}

