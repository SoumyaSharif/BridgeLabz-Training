package javaConstructors.Instances;

public class Vehicle {
	
	String ownerName;
	String vehicleType;
	static double registrationFee ;
	
	//Constructor
	public Vehicle(String ownerName , String vehicleType, double registrationFee) {
		this.ownerName = ownerName ;
		this.vehicleType = vehicleType;
		this.registrationFee = registrationFee;
	}
	
	public void displayvehicleDetails() {
		System.out.println("The owner of the vehicle " + vehicleType + " is " + ownerName + " who pays fee " + registrationFee);
	}
	
	public static void updateregistrationFee(int newfee) {
		Vehicle.registrationFee = newfee ;
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Rahul" , "Car" , 3000 );
		Vehicle v2 = new Vehicle("Meena" , "Scooty" , 3000 );
		Vehicle v3 = new Vehicle("Momos" , "Bike" , 3000 );
		
		v1.displayvehicleDetails();
		v2.displayvehicleDetails();
		updateregistrationFee(4000);
		v3.displayvehicleDetails();
		
		
	}

}
