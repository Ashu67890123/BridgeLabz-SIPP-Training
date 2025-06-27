import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        // Output results
        System.out.println("Youngest friend: " + names[youngestIndex] + " (" + ages[youngestIndex] + " years)");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (" + heights[tallestIndex] + " cm)");

        scanner.close();
    }
}