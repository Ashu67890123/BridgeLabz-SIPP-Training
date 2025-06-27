import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();
        int[][] marks = new int[number][3]; // [physics, chemistry, maths]
        double[] percentages = new double[number];
        String[] grades = new String[number];

        // Input loop
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            System.out.print("Physics: ");
            int phy = scanner.nextInt();
            System.out.print("Chemistry: ");
            int chem = scanner.nextInt();
            System.out.print("Maths: ");
            int math