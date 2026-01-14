package com.gamebox;
public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    protected double applyOffer(double discount) {
        return price - discount; // operator
    }
}
