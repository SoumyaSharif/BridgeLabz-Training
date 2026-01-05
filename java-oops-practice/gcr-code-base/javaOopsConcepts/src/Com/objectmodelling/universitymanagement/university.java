package Com.objectmodelling.universitymanagement;

import java.util.ArrayList;

class university {
    String universityName;
    ArrayList<student> students;
    ArrayList<professor> professors;
    ArrayList<course> courses;

    university(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    void addStudent(student s) {
        students.add(s);
    }

    void addProfessor(professor p) {
        professors.add(p);
    }

    void addCourse(course c) {
        courses.add(c);
    }
}

