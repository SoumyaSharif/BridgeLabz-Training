package com.sortingalgorithms.gamerzone;
public class Main {
    public static void main(String[] args) {

        Player[] players = {
            new Player("Alex", 4500),
            new Player("Riya", 8200),
            new Player("Sam", 6100),
            new Player("Neha", 9000)
        };

        GamerZoneDemo.quicksort(players, 0, players.length - 1);

        System.out.println("Leaderboard:");
        for (Player p : players) {
            System.out.println(p.name + " : " + p.score);
        }
    }
}
