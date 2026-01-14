package com.gamebox;
public class GameBoxDemo {

    public static void main(String[] args) {

        Game g1 = new ArcadeGame("SpeedRun", 299);
        Game g2 = new StrategyGame("WarPlan", 499);

        g1.playDemo();
        g2.playDemo();

        User u = new User();
        u.addGame(g1);
    }
}
