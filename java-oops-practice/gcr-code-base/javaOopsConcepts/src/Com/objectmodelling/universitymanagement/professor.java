package Com.objectmodelling.universitymanagement;

import java.util.ArrayList;

class professor {
    int profId;
    String name;
    ArrayList<course> courses;

    professor(int profId, String name) {
        this.profId = profId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(course c) {
        courses.add(c);
        c.assignProfessor(this);
        System.out.println(name + " assigned to " + c.courseName);
    }
}

