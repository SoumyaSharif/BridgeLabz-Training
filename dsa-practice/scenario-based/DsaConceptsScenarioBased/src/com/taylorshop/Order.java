package com.taylorshop;
class Order {
    int orderId;
    int deadline; // delivery deadline in days

    Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Order " + orderId + " | Deadline: " + deadline;
    }
}
