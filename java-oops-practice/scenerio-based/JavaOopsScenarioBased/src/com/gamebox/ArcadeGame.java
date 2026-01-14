package com.gamebox;
public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price) {
        super(title, "Arcade", price);
    }

    public void download() {
        System.out.println(title + " downloaded");
    }

    public void playDemo() {
        System.out.println("Arcade demo: Fast-paced action!");
    }
}
