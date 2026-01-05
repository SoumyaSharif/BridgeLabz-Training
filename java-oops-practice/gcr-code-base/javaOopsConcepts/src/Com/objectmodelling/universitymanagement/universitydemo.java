package Com.objectmodelling.universitymanagement;

class universitydemo {
    public static void main(String[] args) {

        university uni = new university("RGPV University");

        student s1 = new student(1, "Soumya");
        student s2 = new student(2, "Rahul");

        professor p1 = new professor(101, "Dr. Sharma");

        course c1 = new course("Java Programming");
        course c2 = new course("Data Structures");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addCourse(c1);
        uni.addCourse(c2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        p1.assignCourse(c1);

        c1.showDetails();
        c2.showDetails();
    }
}

