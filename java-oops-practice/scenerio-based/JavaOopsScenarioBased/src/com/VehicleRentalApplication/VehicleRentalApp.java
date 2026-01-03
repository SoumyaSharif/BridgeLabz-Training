package com.VehicleRentalApplication;

public class VehicleRentalApp {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"Soumya");
		customer.displayCustomer();
		
		Rentable bike = new Bike("MP09-B1234" , "Yamaha" , 300);
		Rentable car = new Car("MP04-C5678", "Honda", 1500);
        Rentable truck = new Truck("MP07-T9999", "Tata", 2500);
        
        System.out.println("Bike Rent (3 days):" + bike.calculateRent(3));
        System.out.println("Car Rent(3 days):" + car.calculateRent(3));
        System.out.println("Truck Rent (3days):" + truck.calculateRent(3));
	}

}
