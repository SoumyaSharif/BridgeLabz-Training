package Com.encapsulation.vehiclerental;

class bike extends vehicle {
    public bike(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}