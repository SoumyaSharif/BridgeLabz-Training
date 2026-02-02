package com.lambdaexpression.smarthome;

public class SmartHomeDemo {
	public static void main(String[] args) {
		
		//lambda expressions
		Light m1 = () -> System.out.println("Motion detected lights");
		Light m2 = () -> System.out.println("Time detected : evening , afternoon , morning");
		Light m3 = () -> System.out.println("Voice detected lights");
		
		m1.activate();
		m2.activate();
		m3.activate();
		
	}
	
}
