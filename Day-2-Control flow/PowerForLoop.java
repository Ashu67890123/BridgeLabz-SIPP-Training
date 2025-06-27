import java.util.Scanner;

public class PowerForLoop {
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
        
        // Calculate power using for loop
        long result = 1; // Using long to handle larger numbers
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        scanner.close();
    }
}