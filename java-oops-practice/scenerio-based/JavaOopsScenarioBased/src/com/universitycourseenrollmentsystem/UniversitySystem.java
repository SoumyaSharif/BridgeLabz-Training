package com.universitycourseenrollmentsystem;

public class UniversitySystem {
    public static void main(String[] args) {

        Course java = new Course("CS101", "Java Programming", 4);
        Course ai = new Course("CS201", "Artificial Intelligence", 3);

        Student ug = new Undergraduate("U101", "Arsh");
        Student pg = new Postgraduate("P201", "Soumya");

        ug.enroll(java);
        ug.enroll(ai);

        Faculty prof = new Faculty("Dr. Sharma");

        for (Enrollment e : ug.enrollments) {
            prof.assignGrade(e, "A");
        }

        System.out.println("UG GPA: " + ug.getTranscript());
    }
}

