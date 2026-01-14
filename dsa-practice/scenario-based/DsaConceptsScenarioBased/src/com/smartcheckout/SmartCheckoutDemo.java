package com.smartcheckout;
public class SmartCheckoutDemo {

    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        // Add inventory
        checkout.addItemToInventory("Milk", 50, 20);
        checkout.addItemToInventory("Bread", 30, 15);
        checkout.addItemToInventory("Eggs", 6, 50);

        // Create customers
        Customer c1 = new Customer("Soumya");
        c1.addItem("Milk", 2);
        c1.addItem("Bread", 1);

        Customer c2 = new Customer("Rahul");
        c2.addItem("Eggs", 12);
        c2.addItem("Milk", 1);

        // Add customers to queue
        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        // Process checkout
        checkout.processCustomer();
        checkout.processCustomer();
    }
}
