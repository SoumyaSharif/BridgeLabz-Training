package com.sortingalgorithms.bubblesort;

public class bubblesort {
	//created a static class with return type void 
		public static int[] bubbleSort(int arr[] , int n) {
			int i, j , temp ;
			boolean swapped ;
			
			for(i=0 ; i< n-1 ; i++) {
				swapped = false ;
				for(j=0 ; j<n-i-1 ; j++) {
					if(arr[j] > arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp ;
						swapped = true ;
					}
				}
				
				if(swapped == false) {
					break;
				}
			}
			return arr;
		}
		
		public static void display(int arr[]) {
			//display sorted order
			for(int i=0 ;i<arr.length ;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
}
