package Com.inheritance.animal;

class animal {
    String name;
    int age;

    animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

