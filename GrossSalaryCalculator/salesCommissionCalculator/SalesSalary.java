package salesCommissionCalculator;

import java.util.Scanner;

public class SalesSalary {
    public static void main(String[] args) {
        /*
        All salespeople get a payment of $1000 a week.
        Salespeople who exceed 10 sales get an additional bonus of $250.
        */
        Scanner scanner = new Scanner(System.in);
        int salary = 1000;
        int quota = 10;
        int bonus = 250;
        System.out.println("Enter the amount of sales done this week:");
        int sales = scanner.nextInt();
        scanner.close();
        if (sales > quota){
            salary += bonus;
        }
        System.out.println("Your salary is: $" + salary);
    }
}
