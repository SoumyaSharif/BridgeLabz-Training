package com.smartcheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue;
    private HashMap<String, Item> inventory;

    public SmartCheckout() {
        customerQueue = new LinkedList<>();
        inventory = new HashMap<>();
    }

    // Add items to inventory
    public void addItemToInventory(String name, double price, int stock) {
        inventory.put(name, new Item(name, price, stock));
    }

    // Add customer to checkout queue
    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.getCustomerName() + " added to queue.");
    }

    // Process billing and remove customer
    public void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        double totalBill = 0;

        System.out.println("\nBilling for: " + customer.getCustomerName());

        for (Map.Entry<String, Integer> entry : customer.getCart().entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();

            Item item = inventory.get(itemName);

            if (item != null && item.getStock() >= quantity) {
                double cost = item.getPrice() * quantity;
                totalBill += cost;
                item.reduceStock(quantity);

                System.out.println(itemName + " x " + quantity + " = ₹" + cost);
            } else {
                System.out.println(itemName + " is out of stock or insufficient quantity.");
            }
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }
}
