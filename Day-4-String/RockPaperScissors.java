import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int rand = (int)(Math.random() * 3);
        return switch (rand) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> "";
        };
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        }
        return "Computer";
    }

    public static String[][] getStats(String[] results, int games) {
        int playerWins = 0, computerWins = 0;
        for (String result : results) {
            if (result.equals("Player")) playerWins++;
            else if (result.equals("Computer")) computerWins++;
        }
        double playerPercent = (playerWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;
        return new String[][] {
            {"Player", String.valueOf(playerWins), String.format("%.2f", playerPercent)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f", computerPercent)}
        };
    }

    public static void displayResults(String[] results, String[][] stats) {
        System.out.println("Game Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("---------------------------------");
        for (int i = 0; i < results.length; i += 3) {
            System.out.printf("%d\t%s\t%s\t\t%s%n", (i/3) + 1, results[i], results[i+1], results[i+2]);
        }
        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tPercentage");
        System.out.println("-----------------------------");
        for (String[] stat : stats) {
            System.out.printf("%s\t%s\t%s%%%n", stat[0], stat[1], stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] results = new String[games * 3]; // player choice, computer choice, winner
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String player = scanner.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(player, computer);
            results[i*3] = player;
            results[i*3 + 1] = computer;
            results[i*3 + 2] = winner;
        }

        String[][] stats = getStats(results, games);
        displayResults(results, stats);

        scanner.close();
    }
}