import java.util.Scanner;

public class StudentVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        
        // Input ages for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        // Check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote");
            } else {
                System.out.println("The student with age " + age + " cannot vote");
            }
        }
        scanner.close();
    }
}