package javaConstructors.Instances;

public class Course {
	
	//Attributes
	String courseName ;
	double duration; //in months
	double fee;
	static String InstitutionName;
	
	
	//Constructor
	public Course(String courseName , double duration , double fee, String InstitutionName){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee ;
		Course.InstitutionName = InstitutionName ;
	}
	
	public void displayCourseDetails() {
		System.out.println("The course title which is  " + courseName + " should be completed in total duration of " + duration +" with amount of fees to be paid" + fee + " in Institution " + InstitutionName);
	}
	
	public static String updateInstitutionName(String NewInstitutionName ) {
		InstitutionName = NewInstitutionName ;
		return NewInstitutionName;
	}

	public static void main(String[] args) {
		Course C1 = new Course("B.tech" , 5 , 60000 , "Technocrats Institute Of Technology");
		Course C2 = new Course("B.Pharms" , 7 , 80000 , "Technocrats Institute Of Technology");
		
		C1.displayCourseDetails();
		C2.displayCourseDetails();
		updateInstitutionName("Oriental Institute of Technology");
		
		C2.displayCourseDetails();

	}
}
