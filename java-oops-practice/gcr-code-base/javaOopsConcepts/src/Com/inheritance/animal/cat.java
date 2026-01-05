package Com.inheritance.animal;

class cat extends animal {

    cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow");
    }
}

