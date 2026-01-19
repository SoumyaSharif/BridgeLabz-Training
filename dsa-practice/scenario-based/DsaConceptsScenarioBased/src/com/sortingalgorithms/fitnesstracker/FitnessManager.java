package com.sortingalgorithms.fitnesstracker;

public class FitnessManager {
	
	public static void main(String[] args) {
	User user1 = new User(1200);
	User user2 = new User(2300);
	User user3 = new User(640);
	User user4 = new User(100);
	User user5 = new User(1290);
	
	int[] array = {user1.steps , user2.steps, user3.steps, user4.steps , user5.steps};
	
	int[] result = Bubblesort.sort(array);
	
	for(int val : result) {
		System.out.println(val);
	}
	}
	}

