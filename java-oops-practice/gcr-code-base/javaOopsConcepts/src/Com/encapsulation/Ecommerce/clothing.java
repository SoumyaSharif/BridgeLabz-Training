package Com.encapsulation.Ecommerce;

class clothing extends product {
    public clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.20;
    }
}
