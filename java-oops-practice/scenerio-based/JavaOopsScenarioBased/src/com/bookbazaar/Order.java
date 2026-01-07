package com.bookbazaar;
import java.util.Map;
import java.util.HashMap;


public class Order{
	
	private int orderId ;
	private Map<Book, Integer> items = new HashMap<>();
	private double totalamount ;
	private String status = "Placed";
	
	public void addbook(Book book , int quantity) {
		if(book.getstock() >= quantity) {
			items.put(book , quantity);
			book.updateStock(quantity);
		}
	}
	
	public void calculateTotal() {
        totalamount = 0;
        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double discount = book.applyDiscount();
            totalamount += (book.getprice() * qty) - discount;
        }
    }
	
	private void updateStatus(String newStatus) {
        status = newStatus;
    }
	
}
