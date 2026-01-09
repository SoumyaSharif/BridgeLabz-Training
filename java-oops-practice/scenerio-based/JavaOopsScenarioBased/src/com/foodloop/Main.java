package com.foodloop;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.placeorder("Pasta");
        order.placeorder("Burger");
        order.placeorder("Ice Cream"); // not in menu
        order.cancelorder("Pasta");
        
        order.applyDiscount();
        
    }
}
