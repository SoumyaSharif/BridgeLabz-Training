package com.universitycourseenrollmentsystem;

public class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void assignGrade(Enrollment enrollment, String grade) {
        enrollment.assignGrade(grade);
    }
}

