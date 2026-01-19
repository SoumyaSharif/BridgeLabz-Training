package com.sortingalgorithms.fleetmanager;
import java.util.*;

public class MergeSort {
	
	public static List<Vehicle> mergesort(List<Vehicle> vehicles){
		if(vehicles.size()<= 1) {
			return vehicles ;
		}
		
		int mid = vehicles.size()/2 ;
		
		List<Vehicle> left = mergesort(vehicles.subList(0, mid));
		List<Vehicle> right = mergesort(vehicles.subList(mid, vehicles.size()));
		
		return merge(left, right );
	}
	
	private static List<Vehicle> merge(List<Vehicle> left , List<Vehicle> right){
		List<Vehicle> result = new ArrayList<>();
		int i=0 , j=0 ;
		
		while (i< left.size() && j < right.size()) {
			if(left.get(i).getmileage() <= right.get(j).getmileage()) {
				result.add(left.get(i++));
			}else {
				result.add(right.get(j++));
			}
		}
		
		while(i < left.size()) {
			result.add(left.get(i++));
		}
		
		while(j < right.size()) {
			result.add(right.get(j++));
		}
		
		return result ; 
	}
}
