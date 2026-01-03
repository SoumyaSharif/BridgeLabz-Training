package com.HospitalPatientManagementSystem;

/*1. Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.*/


public class Patient {
	private int patientId;
	private String name ;
	private int age;
	private String medicalHistory;
	
	public Patient(int patientId , String name , int age) {
		this.patientId = patientId;
		this.name = name ; 
		this.age = age ;
	}
	
	public Patient(int patientId, String name , int age , String medicalHistory) {
		this.patientId = patientId ;
		this.name = name ;
		this.age = age ;
		this.medicalHistory = medicalHistory ;
	}

	public String getSummary() {
		return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
	}
	
	public void displayInfo() {
		System.out.println(getSummary());
	}
}
