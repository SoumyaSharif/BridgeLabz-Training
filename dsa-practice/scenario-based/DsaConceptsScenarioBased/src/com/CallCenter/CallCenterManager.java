package com.CallCenter;
import java.util.*;

import java.util.*;

public class CallCenterManager {

    Queue<Customer> normalQueue = new LinkedList<>();
    PriorityQueue<Customer> vipQueue;
    HashMap<String, Integer> callCountMap = new HashMap<>();

    public CallCenterManager() {
        // VIP customers get higher priority
        vipQueue = new PriorityQueue<>(
            (c1, c2) -> Boolean.compare(c2.isVIP, c1.isVIP)
        );
    }

    // Add incoming call
    public void receiveCall(Customer customer) {
        // Update call count
        callCountMap.put(
            customer.customerId,
            callCountMap.getOrDefault(customer.customerId, 0) + 1
        );

        // Route to appropriate queue
        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP Call received from: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal Call received from: " + customer.name);
        }
    }

    // Handle next call
    public void handleCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Handling VIP customer: " + customer.name);
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("Handling normal customer: " + customer.name);
        } else {
            System.out.println("No calls in queue.");
        }
    }

    // Display call frequency
    public void displayCallStats() {
        System.out.println("\nCustomer Call Count:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " calls");
        }
    }
}
