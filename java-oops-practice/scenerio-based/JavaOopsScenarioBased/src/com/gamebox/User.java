package com.gamebox;
import java.util.ArrayList;

public class User {
    private ArrayList<Game> ownedGames;

    public User() {
        ownedGames = new ArrayList<>();
    }

    public void addGame(Game game) {
        ownedGames.add(game);
    }
}
