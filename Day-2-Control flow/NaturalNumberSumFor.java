import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("For loop sum: " + sum);
            System.out.println("Formula sum: " + formula);
            System.out.println("Are both equal? " + (sum == formula));
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
