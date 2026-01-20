package com.sortingalgorithms.gamerzone;

public class GamerZoneDemo {
	
	public static int partition(Player[] arr, int low , int high) {
		
		Player pivot = arr[high];
		int i= low -1 ; 
		
		for(int j= low ; j<high ;j++) {
			if(arr[j].score > pivot.score) {
				i++ ;
				Player temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp ;
			}
		}
		
		Player temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp ;
		
		return i+1 ;
	}
	
	public static void quicksort(Player[] arr, int low ,int high) {
		if(low < high) {
			int pivotIndex = partition(arr,low,high);
			quicksort(arr,low,pivotIndex-1);
			quicksort(arr,pivotIndex+1,high);
		}
	}

}
