import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int number = scanner.nextInt();
        int[] multiplicationTable = new int[10];
        
        // Calculate multiplication table
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i-1] = number * i;
        }
        
        // Display results
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        scanner.close();
    }
}