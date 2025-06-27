import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        double[] heights = new double[number];
        double[] weights = new double[number];
        double[] bmis = new double[number];
        String[] statuses = new String[number];

        // Input loop
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Height (m): ");
            double height = scanner.nextDouble();
            System.out.print("Weight (kg): ");
            double weight = scanner.nextDouble();

            if (height <= 0 || weight <= 0) {
                System.out.println("Invalid input. Height and weight must be positive.");
                i--;
                continue;
            }
            heights[i] = height;
            weights[i] = weight;
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) statuses[i] = "Underweight";
            else if (bmis[i] < 25) statuses[i] = "Normal";
            else if (bmis[i] < 30) statuses[i] = "Overweight";
            else statuses[i] = "Obese";
        }

        //