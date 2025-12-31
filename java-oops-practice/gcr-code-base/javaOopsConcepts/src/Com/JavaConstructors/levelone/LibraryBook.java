package javaConstructors;

public class LibraryBook {
	
	//Created Attributes
	String title ;
	String author ;
	int price ;
	boolean available ;
	
	//Created Constructor
	public LibraryBook(String title , String author , int price ) {
		this.title = title;
		this.author = author;
		this.price = price ;
		this.available = true ;	
	}

	//Created a method for borrow
	public void borrow() {
		if(available) {
			available = false ;
			System.out.println("Book borrowed");
		}else {
		
			System.out.println("not available");
		}
		
	}
	
	//Display the results in main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LibraryBook b1 = new LibraryBook("Percy Jackson" , "J.K.Rowling" , 700);
        b1.borrow();
        b1.borrow();
	}

}
