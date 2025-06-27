import java.util.Scanner;

public class StudentVoting {
    public static int[] getAges(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18 && ages[i] >= 0) ? "true" : "false";
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");
        System.out.println("---------------");
        for (String[] row : table) {
            System.out.printf("%s\t%s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] ages = getAges(n);
        String[][] votingStatus = checkVotingEligibility(ages);
        displayTable(votingStatus);
    }
}