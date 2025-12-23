import java.util.Scanner;

public class RockPaperScissors {

    //Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }

    //Method to find winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    //Method to calculate stats
    public static String[][] calculateStats(String[] winners, int games) {
        int userWins = 0, compWins = 0;

        for (String w : winners) {
            if (w.equals("User")) userWins++;
            else if (w.equals("Computer")) compWins++;
        }

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }

    //Method to display results
    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("-------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" +
                               games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWin Percentage");
        System.out.println("--------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[games][3];
        String[] winners = new String[games];

        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter Rock, Paper or Scissors: ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
            winners[i] = winner;
        }

        String[][] stats = calculateStats(winners, games);
        displayResults(gameResults, stats);
    }
}
