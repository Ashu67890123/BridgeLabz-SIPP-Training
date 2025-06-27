import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        
        // Input heights for 11 players
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        
        // Calculate and display mean height
        double mean = sum / 11;
        System.out.printf("Mean height of the football team: %.2f%n", mean);
        scanner.close();
    }
}