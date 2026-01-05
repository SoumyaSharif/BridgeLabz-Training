package Com.objectmodelling.universitymanagement;

import java.util.ArrayList;

class course {
    String courseName;
    professor professor;
    ArrayList<student> students;

    course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void assignProfessor(professor p) {
        this.professor = p;
    }

    void addStudent(student s) {
        students.add(s);
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        }
        System.out.println("Students:");
        for (student s : students) {
            System.out.println(s.name);
        }
        System.out.println();
    }
}

