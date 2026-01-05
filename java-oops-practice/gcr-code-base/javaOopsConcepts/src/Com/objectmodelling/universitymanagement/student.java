package Com.objectmodelling.universitymanagement;

import java.util.ArrayList;

class student {
    int rollNo;
    String name;
    ArrayList<course> courses;

    student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(course c) {
        courses.add(c);
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.courseName);
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (course c : courses) {
            System.out.println("Course: " + c.courseName);
        }
        System.out.println();
    }
}

