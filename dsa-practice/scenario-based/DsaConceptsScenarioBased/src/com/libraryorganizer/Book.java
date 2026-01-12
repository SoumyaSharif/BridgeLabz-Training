package com.libraryorganizer ;

public class Book {
	
	String isbn ;
	String title ;
	String author ;
	
	Book(String isbn , String title ,String author){
		this.isbn = isbn ;
		this.title= title ;
		this.author = author ;
	}
	
	@Override
	public String toString() {
		return title + "by" + author ;
	}

}
