package com.sortingalgorithms.icecreamrush;

public class BubbleSort {
	
	static int[] merge(int[] array) {
	for(int i=0 ; i<array.length ; i++) {
		
		boolean swapped = false ; 
		for(int j=0 ; j<i ; j++) {
			
			if(array[j+1] < array[j]) {
				int temp = array[j];
				array[j+1] = array[j];
				array[j+1] = temp ;
				swapped = true ; 
			}
		}
		if(swapped == false ) {
		}
	}
	
	return array ;
	}
	
	public static void display(int arr[]) {
		//display sorted order
		for(int i=0 ;i<arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
