package com.BookShelf;
public class BookShelfDemo {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("Clean Code", "Robert Martin", "Programming");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "Programming");
        Book b3 = new Book("1984", "George Orwell", "Fiction");
        Book b4 = new Book("Clean Code", "Robert Martin", "Programming"); // duplicate

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);
        shelf.addBook(b4); // ignored

        shelf.displayCatalog();

        shelf.borrowBook("Clean Code", "Robert Martin", "Programming");

        shelf.displayCatalog();
    }
}
