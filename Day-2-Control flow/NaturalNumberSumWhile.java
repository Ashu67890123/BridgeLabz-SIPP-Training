import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("While loop sum: " + sum);
            System.out.println("Formula sum: " + formula);
            System.out.println("Are both equal? " + (sum == formula));
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
