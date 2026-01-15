package com.sortingalgorithms.bubblesort;

public class HospitalQueue extends Patient{
	
	public HospitalQueue(String name, int condition) {
		super(name, condition);
	}

	public static void main(String[] args) {
		
		
	Patient p1 = new Patient("Riya" , 10);
	Patient p2 = new Patient("ashok" , 1);
	Patient p3 = new Patient("maya" , 5);
	Patient p4 = new Patient("sunita" , 9);
	Patient p5 = new Patient("mary" , 8);
	
	int[] arr = {p1.getcondition(),p2.getcondition(),p3.getcondition(),p4.getcondition(),p5.getcondition()};
	
	bubblesort.display(arr);
	//in place sorting
	int[] result = bubblesort.bubbleSort(arr , arr.length);

	System.out.println("order of Patients according to patient's condition : " );
	bubblesort.display(result);
	
	}
}
