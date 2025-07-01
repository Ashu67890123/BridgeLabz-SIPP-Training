import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temp, double speed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature and wind speed: ");
        double temp = sc.nextDouble(), speed = sc.nextDouble();
        System.out.println("Wind Chill Temperature: " + calculateWindChill(temp, speed));
    }
}