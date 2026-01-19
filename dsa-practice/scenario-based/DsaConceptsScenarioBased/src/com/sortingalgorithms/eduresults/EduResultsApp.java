package com.sortingalgorithms.eduresults;

public class EduResultsApp {
	
	public static void main(String[] args) {
		
		Student[] students = {new Student(101, 90),  new Student(102, 95),new Student(103, 88),new Student(104, 99)};
	
		MergeSorter.mergeSort(students, 0,students.length-1);
		
		display(students);
	}

	private static void display(Student[] arr) {
		for(Student s : arr) {
			System.out.println(s);
		}
	}
}
