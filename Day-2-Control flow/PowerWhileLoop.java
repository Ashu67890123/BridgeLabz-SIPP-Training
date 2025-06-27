import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
        // Validate input
        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive base number and non-negative power");
            return;
        }
        
        // Calculate power using while loop
        long result = 1; // Using long to handle larger numbers
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        scanner.close();
    }
}