package Com.encapsulation.vehiclerental;

class car extends vehicle implements insurable {
    public car(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car insurance";
    }
}