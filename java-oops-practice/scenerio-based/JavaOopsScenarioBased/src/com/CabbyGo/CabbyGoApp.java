package com.CabbyGo;

/* user gets option to choose ride 
 * user gives the distance , from checkpoint 1 to 2 
 * checks which vehicle is available 
 * chooses one vehicle 
 * gets the vehicle license number , capacity and type of vehicle 
 * get the drivers name and rating 
 * gets OTP to confirm the driver 
 * completes the ride 
 * gets option to end ride 
 * pay fare , give rating 
 * 
 * encapsulation : location , users name , number , fare 
 * 
 */
public class CabbyGoApp {
	
	public static void main(String[] args) {
		customer c1 = new customer("Soumya Sharif" , 1);
		
		Driver driver = new Driver("Rahul", "DL12345", 4.8);
		Vehicle v1 = new SUV("1GKER23777J108916", 8 , "SUV" ,40);
		Vehicle v2 = new Sedan("1GKER23777J108916", 8 , "Sedan" ,20);
		Vehicle v3 = new Mini("1GKER23777J108916", 8 , "Mini" ,10);
		Ride ride = new Ride (driver, v1 , true );
		
		
		c1.displaycustomer();
		ride.bookRide(12);
		ride.endRide();
	}

}
