import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Count digits
        int count = 0;
        long temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits
        int[] digits = new int[count];
        int[] reversed = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }

        // Reverse digits
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Output reversed digits
        System.out.print("Reversed number digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        scanner.close();
    }
}