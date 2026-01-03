package com.HospitalPatientManagementSystem;

public class InPatient extends Patient{
	private int numberofDays;
	
	public InPatient(int patientId , String name ,int age , int numberofDays ) {
		
		super(patientId , name , age );
		this.numberofDays = numberofDays ;
	}
	
	@Override
	public void displayInfo() {
		System.out.println(getSummary() + ",Stray Days:" + numberofDays);
	}
	
	public int getnumberofDays() {
		return numberofDays;
	}
}
