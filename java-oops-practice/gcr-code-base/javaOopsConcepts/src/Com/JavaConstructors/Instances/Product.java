package javaConstructors.Instances;

public class Product {
	
	//Attributes 
	String productName ;
	double Price ;

	static int totalProducts=0;
	
	//Constructor
	Product(String productName,double Price ){
		this.productName = productName ;
		this.Price = Price ;
		totalProducts++;
	}
	
	public void displayProductDetails() {
		System.out.println("The Product name and it's price is " + productName + " and " + Price);
	}
	
	public static void displayTotalProducts() {
		System.out.println("Total no. of products are " + totalProducts);
	}


public static void main(String[] args) {
	
	Product p1 = new Product("Laptop" , 76000);
	Product p2 = new Product("Mobile Phone" , 40000);
	
	p1.displayProductDetails();
	p2.displayProductDetails();
	Product.displayTotalProducts();
}}

