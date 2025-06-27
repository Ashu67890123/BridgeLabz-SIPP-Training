import java.util.Scanner;

public class DigitFrequency {
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
        int index = 0;
        while (number != 0) {
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }

        // Calculate frequency
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Output frequency
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i]