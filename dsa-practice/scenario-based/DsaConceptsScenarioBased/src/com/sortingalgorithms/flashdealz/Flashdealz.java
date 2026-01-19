package com.sortingalgorithms.flashdealz;

public class Flashdealz {
	
	public static void main(String[] args) {
		
	Product p1 = new Product("Microwave" , 20);
	Product p2 = new Product("Phone" , 70);
	Product p3 = new Product("Iphone" , 100);
	Product p4 = new Product("Curler" , 30);

	int[] array = {p1.discount , p2.discount, p3.discount,p4.discount};
	int end = array.length-1 ;
			
	QuickSort.quicksort(array, 0 , end);
	
	for(int val : array) {
		System.out.println(val);
	}
	
	}
}
