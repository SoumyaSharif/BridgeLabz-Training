package javaConstructors;

public class Book {
    
	String title ;
	String author ;
	int price ;

public static void main(String[] args) {
	// TODO Auto-generated method stub	
    Book Hobbit = new Book();
    
    Hobbit.title = " Hobbit and the 7 rings ";
    Hobbit.author = "J.R.R Tolkien";
    Hobbit.price = 670 ;
    
    System.out.println("Book's Title is  " + Hobbit.title);
    System.out.println("Book's author is " + Hobbit.author);
    System.out.println("Book's price is Rs." + Hobbit.price);
    
}
}