import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] employeeData = new double[10][2]; // [salary, years]
        double[][] bonusData = new double[10][2];   // [new salary, bonus]
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Years of service: ");
            double years = scanner.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Salary must be positive and years non-negative.");
                i--;
                continue;
            }
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            bonusData[i][0] = salary + bonus; // new salary
            bonusData[i][1] = bonus;          // bonus amount
            totalOldSalary += salary;
            totalNewSalary += salary + bonus;
            totalBonus += bonus;
        }

        // Output results
        System.out.printf("Total Bonus Payout: $%.2f%n", totalBonus);
        System.out.printf("Total Old Salary: $%.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: $%.2f%n", totalNewSalary);

        scanner.close();
    }
}