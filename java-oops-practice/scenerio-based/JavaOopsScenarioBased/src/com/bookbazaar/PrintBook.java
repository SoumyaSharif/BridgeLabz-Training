package com.bookbazaar;

public class PrintBook extends Book{
	
	private int pages ;
	private int deliverycharge ;
	
	public PrintBook(String title , String author , double price, int stock) {
		super(title , author , price , stock); 
		this.pages = pages ;
		this.deliverycharge = deliverycharge ;
	}

	public double applyDiscount() {
		return price * 0.20 ;
	}
}
