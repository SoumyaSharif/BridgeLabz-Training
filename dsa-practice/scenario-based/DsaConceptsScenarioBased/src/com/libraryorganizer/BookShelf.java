package com.libraryorganizer ;
import java.util.*;

class BookShelf {

    // Genre → List of Books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // Optional: to avoid duplicate ISBNs
    private HashSet<String> isbnSet = new HashSet<>();

    // Add a book
    public void addBook(String genre, Book book) {
        if (isbnSet.contains(book.isbn)) {
            System.out.println("Duplicate book not allowed!");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        isbnSet.add(book.isbn);

        System.out.println("Book added: " + book);
    }

    // Borrow (remove) a book
    public void borrowBook(String genre, String isbn) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found!");
            return;
        }

        LinkedList<Book> books = catalog.get(genre);
        Iterator<Book> it = books.iterator();

        while (it.hasNext()) {
            Book b = it.next();
            if (b.isbn.equals(isbn)) {
                it.remove();
                isbnSet.remove(isbn);
                System.out.println("Borrowed: " + b);
                return;
            }
        }

        System.out.println("Book not available!");
    }

    // Display all books
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println(" - " + b);
            }
        }
    }
}
