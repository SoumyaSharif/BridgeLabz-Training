package week3.day12.hackerrankquestions.LibraryBookTracker;

public class Book {

    public String title ;
    public String author ;
    public int ID ;

    static int totalBooksInLibrary ;
    static int totalBooksCheckedOut ;

    public Book(String title , String author ,int ID ){
        this.author = author ;
        this.title = title ;
        this.ID = ID ;
        totalBooksInLibrary++ ;

    }

    public void CheckedOut(){
        System.out.println(title + " is CheckedOut");
        totalBooksCheckedOut++ ;
    }

    public void returnBook(){
        System.out.println(title + " is processed for return");
        totalBooksCheckedOut-- ;
    }

    public static void main(String[] args){

        //Creating books in library
        Book book1 = new Book("Alice in the wonderland" , "Lewis caroll" , 243121);
        Book book2 = new Book("Wrong Boy" , "Willy Russel" , 125612);
        Book book3 = new Book("The nightangle Bird" , "Jeremy birch" , 103864);
        Book book4 = new Book("We need to walk about Kevin" , "mereline daly" , 106604);
        Book book5 = new Book("Runaway Bride" , "Annabelle D" , 109604);

        //checking out books
        book1.CheckedOut();
        book2.CheckedOut();
        book5.CheckedOut();

        //return checked out books
        book2.returnBook();

        System.out.println("Total books : " + totalBooksInLibrary +  " and total books checkedout : " + totalBooksCheckedOut );


    }




}
