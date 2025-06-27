import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("Demonstrating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        scanner.close();
    }
}