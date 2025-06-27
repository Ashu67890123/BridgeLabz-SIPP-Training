import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];

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
            personData[i][0] = height;
            personData[i][1] = weight;
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        // Output results
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out