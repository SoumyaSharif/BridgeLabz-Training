package javaConstructors.accessmodifier;

class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public → accessible
        System.out.println("Name: " + name);               // protected → accessible
        System.out.println("CGPA: " + getCGPA());           // private → via getter
        System.out.println("Specialization: " + specialization);
    }
}

