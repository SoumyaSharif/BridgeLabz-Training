package com.Artify;

public class User  implements IPurchasable {
	
	private String name ;
	private double walletbalance ;
	
	public User(String name , double walletbalance) {
		
		this.name = name ;
		this.walletbalance = walletbalance ;
		
	}
	
	public void purchase(double price) {
		walletbalance = walletbalance - price ;
		System.out.println("Purchase Complete! Balance left in account :" + walletbalance);
	}
	
	public void license(String license) {
		System.out.println("License for the Purchased item : " + license);
	}
}
