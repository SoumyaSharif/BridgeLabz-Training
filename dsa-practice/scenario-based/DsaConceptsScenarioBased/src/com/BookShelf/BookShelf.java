package com.BookShelf;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BookShelf {

    private HashMap<String, LinkedList<Book>> genreCatalog;
    private HashSet<Book> uniqueBooks; // optional – avoid duplicates

    public BookShelf() {
        genreCatalog = new HashMap<>();
        uniqueBooks = new HashSet<>();
    }

    // Add book
    public void addBook(Book book) {
        if (!uniqueBooks.add(book)) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }

        genreCatalog.putIfAbsent(book.getGenre(), new LinkedList<>());
        genreCatalog.get(book.getGenre()).add(book);

        System.out.println("Added: " + book);
    }

    // Borrow (remove) book
    public void borrowBook(String title, String author, String genre) {
        LinkedList<Book> books = genreCatalog.get(genre);

        if (books == null) {
            System.out.println("Genre not found.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().equals(title) &&
                book.getAuthor().equals(author)) {

                books.remove(book);
                uniqueBooks.remove(book);
                System.out.println("Borrowed: " + book);
                return;
            }
        }

        System.out.println("Book not available.");
    }

    // Display catalog
    public void displayCatalog() {
        System.out.println("\nLibrary Catalog:");

        for (String genre : genreCatalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : genreCatalog.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}
