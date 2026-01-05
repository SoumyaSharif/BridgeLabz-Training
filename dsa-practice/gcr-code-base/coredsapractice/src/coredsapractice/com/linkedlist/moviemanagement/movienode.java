package coredsapractice.com.linkedlist.moviemanagement;

class movienode {
    String title, director;
    int year;
    double rating;
    movienode next, prev;

    movienode(String t, String d, int y, double r) {
        title = t; director = d; year = y; rating = r;
    }
}