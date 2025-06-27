import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();
        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        // Input loop
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            System.out.print("Physics: ");
            int phy = scanner.nextInt();
            System.out.print("Chemistry: ");
            int chem = scanner