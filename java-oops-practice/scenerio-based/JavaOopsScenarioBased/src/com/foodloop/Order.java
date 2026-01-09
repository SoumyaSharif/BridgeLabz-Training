package com.foodloop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Order implements IOrderable {
	
	private List<FoodItem> menu ;
	private List<FoodItem> fooditems ;
	private int totalamount ;

	
	public Order() {
		menu = new ArrayList<>();
		fooditems = new ArrayList<>();
		totalamount = 0 ;
		
		menu.add(new VegItem("Pasta" , 250 , "available"));
		menu.add(new VegItem("Chowmein" , 200 , "available"));
		menu.add(new VegItem("Burger" , 400 , "available"));
		menu.add(new VegItem("French Fries" , 100 , "available"));
		
		menu.add(new NonVegItem("Fried Chicken" , 100 , "available"));
		menu.add(new NonVegItem("Biryani" , 500 , "available"));
		menu.add(new NonVegItem("Fish" , 400 , "available"));

		
	}
	
	public void placeorder() {
		
	}
	
	public void cancelorder() {
		
	}
	
	public int placeorder(String itemname) {
		
		for(FoodItem item : menu) {
			if (item.getName().equalsIgnoreCase(itemname)){
				
				fooditems.add(item);
                totalamount += item.getPrice();

                System.out.println(itemname + " added to order.");
                System.out.println("Your Total Amount is : " + totalamount);
                return totalamount;
			}	
		}
		
		System.out.println(itemname + " is not available in the menu.");
        return totalamount;
	}
	
	public int cancelorder(String itemname) {
		
		for(FoodItem item : fooditems) {
			if (item.getName().equalsIgnoreCase(itemname)){
				
				fooditems.remove(item);
                totalamount -= item.getPrice();

                System.out.println(itemname + " removed to order.");
                System.out.println("Your new total is : " + totalamount);
                return totalamount;
			}
			
		}
		
		System.out.println(itemname + " is not available in the menu.");
        return totalamount;
	}
	

	public int applyDiscount() {

	    if (totalamount <= 0) {
	        System.out.println("No items in order. Discount cannot be applied.");
	        return totalamount;
	    }

	    int discount = (totalamount * 10) / 100;
	    totalamount = totalamount - discount;

	    System.out.println("\nDiscount Applied: 10%");
	    System.out.println("You saved: ₹" + discount);
	    System.out.println("Final Amount to Pay: ₹" + totalamount);

	    return totalamount;
	}

}
