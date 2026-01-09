package com.Artify;

public class DigitalArt extends Artwork {
	
	public DigitalArt(String title , String artist , double price , String licensetype) {
		super(title,artist,price,licensetype);
	}
	
	public void purchase() {
		System.out.println("purchase complete!");
	}
	
	public void license() {
		System.out.println("License approved!");
	}

}
