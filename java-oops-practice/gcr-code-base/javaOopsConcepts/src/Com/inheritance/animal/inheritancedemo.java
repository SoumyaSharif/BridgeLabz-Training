package Com.inheritance.animal;

class inheritancedemo {
    public static void main(String[] args) {

        animal a1 = new dog("Buddy", 3);
        animal a2 = new cat("Whiskers", 2);
        animal a3 = new bird("Tweety", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}

