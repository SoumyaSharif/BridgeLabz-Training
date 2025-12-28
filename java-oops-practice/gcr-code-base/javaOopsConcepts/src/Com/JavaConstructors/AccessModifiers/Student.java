package javaConstructors.accessmodifier;

class Student {

    // Public member
    public int rollNumber;

    // Protected member
    protected String name;

    // Private member
    private double cgpa;

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public method to modify CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

