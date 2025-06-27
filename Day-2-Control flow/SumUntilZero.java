import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;
        do {
            value = input.nextDouble();
            total += value;
        } while (value != 0);
        System.out.println("Total sum is: " + total);
        input.close();
    }
}
