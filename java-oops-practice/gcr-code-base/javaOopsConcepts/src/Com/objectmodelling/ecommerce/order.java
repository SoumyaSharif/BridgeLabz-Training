package Com.objectmodelling.ecommerce;

import java.util.ArrayList;

class order {
    int orderId;
    customer customer;
    ArrayList<product> products;

    order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void setCustomer(customer c) {
        this.customer = c;
    }

    void addProduct(product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Products:");
        for (product p : products) {
            System.out.println(p.productName + " - ₹" + p.price);
        }
        System.out.println();
    }
}

