package javaConstructors;

//Creating a Person Class
public class Person {
    
	//Initializing attributes
	String name;
	int age ;
	double Height;
	double weight;
	
	//Creating a parameterized constructor for Person class 
	Person(String name , int age , double height , double weight){
		this.name = name ;
		this.age = age ;
		this.Height = height ;
		this.weight = weight ;
	}
	
	//cloning the Person class as p
	Person(Person p){
		this.name = p.name;
		this.age = p.age;
		this.Height = p.Height;
		this.weight = p.weight;
		
	}
	
	void display() {
        System.out.println("Name: " + name +" and " + age +" and " + Height +" and " + weight );
    }

    public static void main(String[] args) {

        // Original object
        Person p1 = new Person("Soumya", 21,6.3 , 65);

        // Cloned object using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Copied Person:");
        p2.display();
    }
	
	
}
