package com.smartcheckout;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String customerName;
    private Map<String, Integer> cart; // itemName -> quantity

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
    }

    public Map<String, Integer> getCart() {
        return cart;
    }

    public String getCustomerName() {
        return customerName;
    }
}
