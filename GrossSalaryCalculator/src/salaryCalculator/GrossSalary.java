package salaryCalculator;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        //1. Get the number of hours worked
        System.out.println("Enter the number of your working hours:");
        Scanner scanner = new Scanner(System.in);
        double hours = scanner.nextDouble();

        //2. Get the hourly pay rate
        System.out.println("Enter your hourly pay rate:");
        double payRate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossSalary = hours * payRate;

        //4. Display result
        System.out.println("Your gross salary equals " + grossSalary);
    }
}
