package tau;

import java.util.Random;

public class BoardGame {

    public static void main(String[] arg){

        int winNumber = 20;
        int userPlace = 0;
        System.out.println("You are currently at square number " + userPlace);

        Random stepNumber = new Random();

        for (int roll = 0; roll < 5; roll++) {
            userPlace = userPlace + stepNumber.nextInt(6) + 1;
            System.out.println("After the dice roll number " + (roll+1) + " , you are currently on square "
                    + userPlace);

            if(userPlace >= winNumber){
                break;
            }
        }

        if(userPlace == winNumber){
            System.out.println("Congratulations, You won!");
        }
        else {
            System.out.println("Sorry, Game over.");
        }

    }

}
