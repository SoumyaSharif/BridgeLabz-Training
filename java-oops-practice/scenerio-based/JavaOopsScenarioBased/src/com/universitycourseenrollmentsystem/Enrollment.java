package com.universitycourseenrollmentsystem;

public class Enrollment implements Graded {
    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public void assignGrade(String grade) {
        this.grade = grade;
    }

    
    public double getGradePoint() {
        if (grade == null) return -1;

        switch (grade) {
            case "A": return 10;
            case "B": return 8;
            case "C": return 6;
            case "PASS": return 5;
            case "FAIL": return 0;
            default: return -1;
        }
    }

    public Course getCourse() {
        return course;
    }
}

