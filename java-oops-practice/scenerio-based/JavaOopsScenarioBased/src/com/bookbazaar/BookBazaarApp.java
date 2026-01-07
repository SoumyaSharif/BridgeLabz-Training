package com.bookbazaar;

public class BookBazaarApp {
	
	public static void main(String[] args ) {
		
		Book b1 = new EBook("Clean Code", "Robert C Martin", 500, 10);
		Book b2 = new PrintBook("Java", "Herbert Schildt", 600, 5);

		System.out.println(b1.applyDiscount()); // EBook logic
		System.out.println(b2.applyDiscount()); // PrintedBook logic

	}

}
