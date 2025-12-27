package javaConstructors;

public class Circle {

	double radius;
	
	//default constructor
	public Circle(){
	
	}
	
	//parameterized constructor
	public Circle(double radius){
		this.radius = radius ; 
	}
	
public static void main(String[] args) {
	Circle c0 = new Circle();
	Circle c1 = new Circle(12.3);
	Circle c2 = new Circle(30);
	
	System.out.println("The radius of a circle is given as " + c1.radius + " and " + c2.radius);
	System.out.println("The radius of a point is " + c0.radius);
}
}