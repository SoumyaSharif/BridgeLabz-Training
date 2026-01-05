package Com.inheritance.animal;

class dog extends animal {

    dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Bark");
    }
}
