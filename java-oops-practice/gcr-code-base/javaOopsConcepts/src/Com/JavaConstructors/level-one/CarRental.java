package javaConstructors;

public class CarRental {

    // Created Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    //Default constructor
    public CarRental() {
        this.customerName = "Not Assigned";
        this.carModel = "Standard";
        this.rentalDays = 0;
        this.totalCost = 0;
    }

    //Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost
    public void calculateTotalCost() {
        double ratePerDay;

        if (carModel.equalsIgnoreCase("SUV")) {
            ratePerDay = 2500;
        } else if (carModel.equalsIgnoreCase("Sedan")) {
            ratePerDay = 2000;
        } else {
            ratePerDay = 1500; // Standard
        }

        totalCost = rentalDays * ratePerDay;
    }

    // Display details
    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName +", Car Model: " + carModel +", Days: " + rentalDays +", Total Cost: ₹" + totalCost);
    }

    // Main method
    public static void main(String[] args) {

        CarRental r1 = new CarRental("Soumya", "SUV", 4);
        r1.displayRentalDetails();

        CarRental r2 = new CarRental();
        r2.displayRentalDetails();
    }
}
