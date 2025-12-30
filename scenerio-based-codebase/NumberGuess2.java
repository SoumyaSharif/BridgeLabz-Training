/*The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.*/


import java.util.*;

public class NumberGuess2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100) + 1; // 1-100

        int userGuess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Computer chose a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < answer) {
                System.out.println("Too Low");
            } else if (userGuess > answer) {
                System.out.println("Too High");
            } else {
                System.out.println("You guessed correctly in " + attempts + " attempts!");
                break;
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));

        } while (attempts < maxAttempts);

        if (userGuess != answer) {
            System.out.println("Game Over! The correct number was: " + answer);
        }

        sc.close();
    }
}
