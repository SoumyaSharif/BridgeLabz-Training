package com.gamebox;
public class StrategyGame extends Game {

    public StrategyGame(String title, double price) {
        super(title, "Strategy", price);
    }

    public void download() {
        System.out.println(title + " installed");
    }

    public void playDemo() {
        System.out.println("Strategy demo: Tactical gameplay!");
    }
}
