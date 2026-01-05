package Com.encapsulation.Ecommerce;

class electronics extends product implements taxable {
    public electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST";
    }
}
