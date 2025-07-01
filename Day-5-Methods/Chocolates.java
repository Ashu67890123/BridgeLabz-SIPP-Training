import java.util.Scanner;

public class Chocolates {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining chocolates: " + result[1]);
    }
}