package Com.objectmodelling.libraryandbook;

class book {
    String title;
    String author;

    book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

