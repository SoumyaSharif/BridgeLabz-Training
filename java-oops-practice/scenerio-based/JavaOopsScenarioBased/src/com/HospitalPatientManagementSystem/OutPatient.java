package com.HospitalPatientManagementSystem;

public class OutPatient extends Patient {
	private double consultationFee;
	
	public OutPatient(int patientId , String name , int age , double consultationFee) {
		
		super(patientId , name , age);
		this.consultationFee = consultationFee ;
	}
	
	@Override
	public void displayInfo() {
		System.out.println(getSummary() + ",Consultation Fee: " + consultationFee);
	}
	
	public double getConsultationFee() {
		return consultationFee ;
	}
}
