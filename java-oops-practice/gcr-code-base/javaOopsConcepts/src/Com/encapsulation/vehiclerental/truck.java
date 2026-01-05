package Com.encapsulation.vehiclerental;

class truck extends vehicle implements insurable {
    public truck(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.5;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck insurance";
    }
}