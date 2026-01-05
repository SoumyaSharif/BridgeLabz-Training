package Com.objectmodelling.libraryandbook;

import java.util.ArrayList;

import java.util.ArrayList;

class library {
    String libraryName;
    ArrayList<book> books;

    library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    void addBook(book b) {
        books.add(b);
    }

    void showBooks() {
        System.out.println("Library: " + libraryName);
        for (book b : books) {
            b.displayBook();
        }
        System.out.println();
    }
}

