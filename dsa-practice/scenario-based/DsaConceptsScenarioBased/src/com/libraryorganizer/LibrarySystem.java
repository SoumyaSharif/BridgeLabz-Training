package com.libraryorganizer;
import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("101", "1984", "George Orwell"));
        shelf.addBook("Fiction", new Book("102", "The Alchemist", "Paulo Coelho"));
        shelf.addBook("Science", new Book("201", "Brief History of Time", "Stephen Hawking"));

        shelf.displayCatalog();

        shelf.borrowBook("Fiction", "101");

        shelf.displayCatalog();
    }
}

