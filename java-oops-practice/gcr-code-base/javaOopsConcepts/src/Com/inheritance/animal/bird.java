package Com.inheritance.animal;

class bird extends animal {

    bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp");
    }
}

