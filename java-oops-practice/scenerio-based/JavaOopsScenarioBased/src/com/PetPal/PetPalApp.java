package com.PetPal;

public class PetPalApp {
    public static void main(String[] args) {
        Pet pet = new Dog("Buddy", 3); // polymorphism
        pet.feed();
        pet.play();
        pet.makeSound();
    }
}
