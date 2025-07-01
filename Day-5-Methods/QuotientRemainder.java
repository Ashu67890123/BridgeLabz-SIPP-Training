import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int num, int div) {
        return new int[]{num % div, num / div};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int num = sc.nextInt(), div = sc.nextInt();
        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Remainder: " + result[0] + ", Quotient: " + result[1]);
    }
}