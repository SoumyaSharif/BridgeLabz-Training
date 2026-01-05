package Com.objectmodelling.libraryandbook;

class aggregationdemo {
    public static void main(String[] args) {

        book b1 = new book("Java Programming", "James Gosling");
        book b2 = new book("Clean Code", "Robert C. Martin");

        library lib1 = new library("Central Library");
        library lib2 = new library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1); // same book in another library

        lib1.showBooks();
        lib2.showBooks();
    }
}
