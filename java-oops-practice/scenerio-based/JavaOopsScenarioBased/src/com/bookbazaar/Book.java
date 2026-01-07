package com.bookbazaar;

abstract class Book implements IDiscountable{
	
	protected String title ;
	protected String author ;
	protected double price ;
	private int stock ;
	
	public Book(String title , String author , double price, int stock){
	
		this.title = title ;
		this.author = author ;
		this.price = price ;
		
	}
	
	//getter for stock 
	public int getstock() {
		return stock ;
	}
	
	public void updateStock(int quantity) {
		if(quantity <= stock) {
			stock -= quantity ;
		} else {
			System.out.println("Insufficient stock");
		}
	}
	
	public double getprice() {
		return price ;
	}
	
}
