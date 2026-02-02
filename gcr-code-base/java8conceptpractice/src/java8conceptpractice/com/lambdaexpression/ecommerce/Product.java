package com.lambdaexpression.ecommerce;

public class Product {
	String name ; 
	double price ; 
	double rating ; 
	double discount ; 
	
	public Product(String name , double price , double rating , double discount ) {
		this.name = name ; 
		this.price = price ; 
		this.discount = discount;
		this.rating = rating ; 
	}
	
	@Override
	public String toString() {
		return name+ "Price:" + price + "Rating:" + rating + "Discount:" + discount;
	};

}
