package Com.encapsulation.Ecommerce;

abstract class product {
    private int productId;
    private String name;
    protected double price;

    public product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double finalPrice() {
        double tax = (this instanceof taxable) ? ((taxable)this).calculateTax() : 0;
        return price + tax - calculateDiscount();
    }
}
