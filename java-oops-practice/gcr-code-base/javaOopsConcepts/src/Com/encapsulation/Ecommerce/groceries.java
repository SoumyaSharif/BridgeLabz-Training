package Com.encapsulation.Ecommerce;

class groceries extends product {
    public groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.05;
    }
}
