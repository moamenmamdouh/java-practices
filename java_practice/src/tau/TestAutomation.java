package tau;

import java.util.Scanner;

public class TestAutomation {

    public static void main(String[] arg){

        System.out.println("Please Enter a season of the year: "); // to print something
        Scanner input = new Scanner(System.in); // to take input data
        String season = input.next(); // to save the next input integer

        System.out.println("Please Enter a Whole number: ");
        int number = input.nextInt();

        System.out.println("Please Enter an adjective: ");
        String adjective = input.next();
        input.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");

    }

}
