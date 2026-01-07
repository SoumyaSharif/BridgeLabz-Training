package com.bookbazaar;

public class EBook extends Book {
	
	private int filesize ;
	
	public EBook(String title , String author , double price , int filesize) {
		super(title,author,price, filesize);
		this.filesize = filesize ;
	}
	
	public double applyDiscount() {
		return price * 0.30 ;
	}
	
}
