package com.sortingalgorithms.flashdealz;

public class QuickSort {
	
	public static int partition(int[] arr, int str , int end) {
		int idx = str-1 ;
		int pivot = arr[end];
		
		for(int j=str ; j < end ; j++) {
			if(arr[j] <= pivot) {
				idx++ ;
				swap(arr,j,idx);
			}
		}
		
		idx++ ;
		swap(arr, end, idx);
		return idx ;
	}
	
	public static void quicksort(int[] arr, int str , int end) {
		if(str<end) {
			int pividx = partition(arr,str,end);
			
			quicksort(arr,str,pividx-1);
			quicksort(arr,pividx+1,end);
			
		}
	}
	
	public static void swap(int[] array , int x, int y) {
		int temp = array[x] ;
		array[x] = array[y] ;
		array[y] = temp;
		
	}
}
