package com.foodloop;

public class FoodItem {

    private String name;
    private String category;
    private int price;
    private String availability;

    public FoodItem(String name, int price, String availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - ₹" + price + " (" + availability + ")";
    }
}
