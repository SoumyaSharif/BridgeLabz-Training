package Com.encapsulation.vehiclerental;

abstract class vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    public vehicle(String number, double rate) {
        this.vehicleNumber = number;
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}
