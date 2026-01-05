package Com.encapsulation.Ecommerce;

class ecommercetest {
    public static void main(String[] args) {
        product[] products = {
            new electronics(1, "Laptop", 60000),
            new clothing(2, "Shirt", 2000),
            new groceries(3, "Rice", 1000)
        };

        for (product p : products) {
            System.out.println("Final price: " + p.finalPrice());
        }
    }
}
