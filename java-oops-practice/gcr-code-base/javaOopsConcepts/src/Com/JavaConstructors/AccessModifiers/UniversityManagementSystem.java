package javaConstructors.accessmodifier;

public class UniversityManagementSystem {

	public static void main(String[] args) {

		PostgraduateStudent pg = new PostgraduateStudent(101, "Soumya Sharif", 8.5, "Computer Science");

		// Modify CGPA using setter
		pg.setCGPA(8.8);

		// Display details
		pg.displayDetails();
	}
}
