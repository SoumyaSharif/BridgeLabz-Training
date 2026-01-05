package Com.objectmodelling.ecommerce;

class ecommercedemo {
    public static void main(String[] args) {

        customer c1 = new customer(1, "Soumya");

        product p1 = new product(101, "Laptop", 55000);
        product p2 = new product(102, "Mouse", 700);
        product p3 = new product(103, "Keyboard", 1200);

        order o1 = new order(5001);

        c1.placeOrder(o1);

        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);

        o1.showOrderDetails();
    }
}
