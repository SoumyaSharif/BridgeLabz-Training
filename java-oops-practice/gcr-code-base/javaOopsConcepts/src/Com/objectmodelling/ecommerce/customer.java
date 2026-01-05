package Com.objectmodelling.ecommerce;

import java.util.ArrayList;

class customer {
    int customerId;
    String name;
    ArrayList<order> orders;

    customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(order o) {
        orders.add(o);
        o.setCustomer(this);
        System.out.println(name + " placed Order ID: " + o.orderId);
    }
}
