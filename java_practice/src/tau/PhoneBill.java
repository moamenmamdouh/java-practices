package tau;

import java.util.Scanner;

public class PhoneBill {

    public static double overageFees(double minutes){
        return minutes*0.25;
    }

    public static double taxCalculator(double basePlan, double overageFees){
        return (basePlan + overageFees) * 0.15;
    }

    public static double finalTotal(double basePlan, double overageFees, double taxFees){
        return basePlan + overageFees + taxFees;
    }

    public static void main(String[] args){

        System.out.println("Please Enter your plan cost:");
        Scanner input = new Scanner(System.in);
        double baseCost = input.nextDouble();

        System.out.println("Please Enter your overage minutes:");
        double overageMinutes = input.nextDouble();
        input.close();

        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + overageFees(overageMinutes));
        System.out.println("Tax: $" + taxCalculator(baseCost, overageFees(overageMinutes)));
        System.out.println("Total: $" + finalTotal(baseCost, overageFees(overageMinutes), taxCalculator(baseCost,
                overageFees(overageMinutes))));

    }
}
