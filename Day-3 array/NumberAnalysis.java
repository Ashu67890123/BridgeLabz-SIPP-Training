import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Analyze numbers
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is positive and " + (num % 2 == 0 ? "even" : "odd"));
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        
        // Compare first and last elements
        if (numbers[0] == numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") equals last element (" + numbers[4] + ")");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[4] + ")");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[4] + ")");
        }
        scanner.close();
    }
}