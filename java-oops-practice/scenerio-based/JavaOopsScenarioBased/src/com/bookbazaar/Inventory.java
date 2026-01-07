package com.bookbazaar;

abstract class Inventory extends Book{
	
	public Inventory(String title , String author , double price, int stock) {
		super(title,author,price,stock);
	}
	
}
