package com.Artify;

public class ArtifyApp {
	
	public static void main(String[] args ) {
		
		Artwork A1 = new PrintArt("empty vase", "leo de carpe" , 23100 ,"PL-2026-01987");
	    Artwork A2 = new PrintArt("Flower", "Euphoria elanova" , 55000 ,"IN-ART-PAINT-2026-00042");

	    User person1 = new User("Soumya", 90000);
	    
	    System.out.println("Person1 buys artwork A2");
	    
	    person1.purchase(55000);
	    person1.license("IN-ART-PAINT-2026-00042");
	    
	}

}
