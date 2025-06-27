import java.util.Scanner;

public class MultiplesForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100");
            return;
        }
        
        // Find multiples using for loop
        System.out.println("Multiples of " + number + " below 100 (in descending order):");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}