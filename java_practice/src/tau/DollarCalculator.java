package tau;

import java.util.Scanner;

public class DollarCalculator {

    public static void main(String[] arg){

        System.out.println("Enter number of Pennies:");
        Scanner input = new Scanner(System.in);
        int pennies = input.nextInt();

        System.out.println("Enter number of Nickles:");
        int nickles = input.nextInt();

        System.out.println("Enter number of dimes:");
        int dimes = input.nextInt();

        System.out.println("Enter number of quarters:");
        int quarters = input.nextInt();
        input.close();

        int total = quarters*25 + dimes*10 + nickles*5 + pennies;

        if (total == 100){
            System.out.println("You Win!");
        }
        else if (total > 100) {
            System.out.println("You are up by " + (total - 100) + " pennies");
        }
        else {
            System.out.println("You are down by " + (100 - total) + " pennies");
        }
    }

}
