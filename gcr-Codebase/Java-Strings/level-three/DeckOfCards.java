import java.util.*;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                             "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {

        String[] deck = initializeDeck();      // initialize deck
        deck = shuffleDeck(deck);              // shuffle deck

        int playersCount = 4;
        String[][] players = distributeCards(deck, playersCount);

        printPlayers(players);                 // print cards
    }

    // Initialize deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String s : suits) {
            for (String r : ranks) {
                deck[index++] = r + " of " + s;
            }
        }
        return deck;
    }

    // Shuffle deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute cards to players
    public static String[][] distributeCards(String[] deck, int x) {
        int n = deck.length;

        if (n % x != 0) {
            System.out.println("Cards cannot be evenly distributed.");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Print players and cards
    public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }
}
