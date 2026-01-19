package com.sortingalgorithms.eduresults;

public class Student {
	private int id ; 
	private int marks ; 
	
	public Student(int id , int marks) {
		this.id = id ; 
		this.marks = marks ; 
		
	}
	
	public int getid() {
		return id ;
	}
	
	public int getmarks() {
		return marks ;
	}
	
	@Override
	public String toString() {
		return id + " who scored : " + marks ;
	}

}
